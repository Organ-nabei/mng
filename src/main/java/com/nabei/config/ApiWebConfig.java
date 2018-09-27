package com.nabei.config;

import com.nabei.interceptor.ApiAuthorizationInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class ApiWebConfig implements WebMvcConfigurer {

    @Resource
    ApiAuthorizationInterceptor apiAuthorizationInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(apiAuthorizationInterceptor).addPathPatterns("/auth/hello/*");
    }
}
