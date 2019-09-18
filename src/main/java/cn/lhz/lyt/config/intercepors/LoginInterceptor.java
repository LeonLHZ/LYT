package cn.lhz.lyt.config.intercepors;

import cn.lhz.lyt.pojo.User;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.*;

import javax.servlet.http.*;

/**
 * @author Neo
 * @date 2019/9/18 23:08
 */
@Component
public class LoginInterceptor implements HandlerInterceptor
{
    public LoginInterceptor()
    {
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {
        //每一个项目对于登陆的实现逻辑都有所区别，我这里使用最简单的Session提取User来验证登陆。
        HttpSession session = request.getSession();
        //这里的User是登陆时放入session的
        User user = (User) session.getAttribute("user");
        //如果session中没有user，表示没登陆
        if (user == null)
        {
            //这个方法返回false表示忽略当前请求，如果一个用户调用了需要登陆才能使用的接口，如果他没有登陆这里会直接忽略掉
            //当然你可以利用response给用户返回一些提示信息，告诉他没登陆
            response.sendRedirect(request.getContextPath()+"/pageLogin");
            return false;
        }

            return true;    //如果session里有user，表示该用户已经登陆，放行，用户即可继续调用自己需要的接口

    }


    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                @Nullable Exception ex) throws Exception
    {
        throw new UnsupportedOperationException("Method not implemented.");
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           @Nullable ModelAndView modelAndView) throws Exception
    {
        throw new UnsupportedOperationException("Method not implemented.");
    }
}
