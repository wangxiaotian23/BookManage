package com.example.bills.configuration;

import com.example.bills.interceptor.HostInfoInterceptor;
import com.example.bills.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Auther: 李清依
 * @Date: 2019/11/10 19:37
 * @Description:
 */
@Component
public class BookWebConfiguration implements WebMvcConfigurer {
    @Autowired
    private LoginInterceptor loginInterceptor;

    @Autowired
    private HostInfoInterceptor hostInfoInterceptor;
    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return new WebMvcConfigurer() {

            /**
             * 添加拦截器
             */
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(hostInfoInterceptor).addPathPatterns("/**");
                registry.addInterceptor(loginInterceptor).addPathPatterns("/books/**");
            }
        };
    }
}
