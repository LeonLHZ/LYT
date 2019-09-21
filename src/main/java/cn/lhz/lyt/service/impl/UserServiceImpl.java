package cn.lhz.lyt.service.impl;

import cn.lhz.lyt.dao.UserMapper;
import cn.lhz.lyt.pojo.*;
import cn.lhz.lyt.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * @author Neo
 * @date 2019/9/18 22:41
 */
@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private TemplateEngine templateEngine;

    @Autowired
    private MailService mailService;

    @Autowired
    private UserMapper userMapper;

    public UserServiceImpl()
    {
    }


    @Override
    public User login(User user)
    {

        return userMapper.selectByCondition(user);
    }

    @Override
    public String register(User user)
    {
        user.setUserState("0");
        userMapper.insert(user);
        Context context = new Context();
        context.setVariable("userId", user.getUserId());
        String emailContent = templateEngine.process("emailTemplate", context);
        mailService.sendHtmlMail(user.getUserEmail(), "主题：这是一封账户激活邮件", emailContent);
        return user.getUserId();
    }

    @Override
    public void activation(String userId)
    {
        User user = new User();
        user.setUserId(userId);
        user.setUserState("1");
        userMapper.updateByUser(user);
    }
}
