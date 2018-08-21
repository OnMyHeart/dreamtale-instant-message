package com.dreamtale.instant.message.web.config;

import com.dreamtale.instant.message.web.interceptor.WebBaseInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by yingshuai on 2018/8/21.
 */
@Configuration
public class MyWebMvcConfigAdapter extends WebMvcConfigurerAdapter{

    /**
     * 配置静态资源
     */
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");
        super.addResourceHandlers(registry);
    }

    public void addInterceptors(InterceptorRegistry registry) {
        //addPathPatterns 用于添加拦截规则
        //excludePathPatterns 用于排除拦截
        registry.addInterceptor(
                new WebBaseInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/admin/login.html") //登录页
                .excludePathPatterns("/admin/register.html") //用户注册
                .excludePathPatterns("/admin/login"); //用户登录
        super.addInterceptors(registry);
    }

}
