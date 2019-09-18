package cn.lhz.lyt.controller;

import cn.lhz.lyt.pojo.User;
import cn.lhz.lyt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public String login(User user)
    {
      if ("123456".equals(user.getUserPassword()))
          return "欢迎";
      return "滚";
    }
}
