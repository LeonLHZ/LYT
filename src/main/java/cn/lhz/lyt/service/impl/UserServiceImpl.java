package cn.lhz.lyt.service.impl;

import cn.lhz.lyt.dao.UserMapper;
import cn.lhz.lyt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Neo
 * @date 2019/9/18 22:41
 */
@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserMapper userMapper;

    public UserServiceImpl()
    {
    }


}
