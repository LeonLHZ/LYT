package cn.lhz.lyt.service.impl;

import cn.lhz.lyt.dao.UserMapper;
import cn.lhz.lyt.pojo.*;
import cn.lhz.lyt.service.*;
import freemarker.template.Template;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.util.*;


/**
 * @author Neo
 * @date 2019/9/18 22:41
 */
@Service
public class UserServiceImpl implements UserService
{
    @Autowired
      private FreeMarkerConfigurer configurer;

    @Autowired
    private MailService mailService;

    @Autowired
    private UserMapper userMapper;

    public UserServiceImpl()
    {
    }


    @Override
    public User login(String emial ,String password)
    {

        return userMapper.selectUserLogin(emial,password);
    }

    @Override
    public String register(User user)
    {
        try
        {
        user.setUserState("0");
        userMapper.insert(user);
        //Context context = new Context();
       // context.setVariable("userId", user.getUserId());
        //String emailContent = templateEngine.process("emailTemplate", context);
        Map<String, Object> model = new HashMap<>();
                     model.put("userId", user.getUserId());
                //创建邮件正文
                Template template = configurer.getConfiguration().getTemplate("emailTemplate.ftl");
                String text = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
        mailService.sendHtmlMail(user.getUserEmail(), "主题：这是一封账户激活邮件", text);
        }catch (Exception e) {
            e.printStackTrace();
        }
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
