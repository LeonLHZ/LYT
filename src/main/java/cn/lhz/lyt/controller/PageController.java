package cn.lhz.lyt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Neo
 * @date 2019/9/19 0:10
 */
@Controller
public class PageController
{
    public PageController()
    {
    }

    @RequestMapping("/pageLogin")
    public String pageLogin(){
        return "index";
    }
}
