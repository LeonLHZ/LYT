package cn.lhz.lyt.controller;

import cn.lhz.lyt.pojo.User;
import cn.lhz.lyt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Neo
 * @date 2019/9/18 23:17
 */
@Controller
public class LoginController
{
    @Autowired
    private UserService userService;

    public LoginController()
    {
    }

    @RequestMapping("/login")
    @ResponseBody
    public Integer login(User user, HttpServletRequest request)
    {
        User u = userService.login(user);
        if (u == null||"0".equals(u.getUserState()))
            return 0;
        request.getSession().setAttribute("user", u);
        return 1;

    }


    @RequestMapping("/register")
    @ResponseBody
    public Integer register(User user)
    {

       userService.register(user);

       return null;
    }

    @RequestMapping("/activation/{userId}")
    @ResponseBody
    public String activation(@PathVariable(value="userId") String userId){
      userService.activation(userId);
        return null;
    }
}
