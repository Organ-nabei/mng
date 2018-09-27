package com.nabei.config;

import com.nabei.interceptor.AuthorizationInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    AuthorizationInterceptor authorizationInterceptor;
    @Value("${mng.interceptor.include}")
    private String[] include;
    @Value("${mng.interceptor.exclude}")
    private String[] exclude;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(authorizationInterceptor).addPathPatterns(include);
    }
}
