package cn.lhz.lyt.service;

import cn.lhz.lyt.pojo.User;

/**
 * @author lhz
 * @date 2019/9/18 22:41
 */
public interface UserService
{
    public User login(String username,String password);
}
