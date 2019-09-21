package cn.lhz.lyt.config;

import cn.lhz.lyt.config.intercepors.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @author lhz
 * @date 2019/9/18 23:05
 */
@Configuration
public class WebConfigurer implements WebMvcConfigurer
{
    @Autowired
    private LoginInterceptor loginInterceptor;

    public WebConfigurer()
    {
    }

    /**
     * 注册拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        // addPathPatterns("/**") 表示拦截所有的请求，
        //excludePathPatterns白名单不需要拦截的请求
        // excludePathPatterns("/login", "/register") 表示除了登陆与注册之外，因为登陆注册不需要登陆也可以访问
        registry.addInterceptor(loginInterceptor).addPathPatterns("/"). excludePathPatterns("/login","/register","/pageLogin","/activation");

    }

    /**
     * 配置静态资源路径
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {

    }
}
