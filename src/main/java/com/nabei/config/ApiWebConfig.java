package com.nabei.config;

import com.nabei.modules.app.interceptor.AppAuthorziationInterceptor;
import com.nabei.modules.applet.interceptor.AppletAuthorziationInterceptor;
import com.nabei.modules.h5.interceptor.H5AuthorizationInterceptor;
import com.nabei.modules.web.interceptor.WebAuthorziationInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class ApiWebConfig implements WebMvcConfigurer {

    @Resource
    H5AuthorizationInterceptor h5AuthorizationInterceptor;
    @Resource
    WebAuthorziationInterceptor webAuthorziationInterceptor;
    @Resource
    AppAuthorziationInterceptor appAuthorziationInterceptor;
    @Resource
    AppletAuthorziationInterceptor appletAuthorziationInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(h5AuthorizationInterceptor);
        registry.addInterceptor(webAuthorziationInterceptor);
        registry.addInterceptor(appAuthorziationInterceptor);
        registry.addInterceptor(appletAuthorziationInterceptor);
    }
}
