package com.bfs.ryan.rest_api_interceptor.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Component
public class EmpInterceptorConfig extends WebMvcConfigurationSupport {

    @Autowired
    EmpInterceptor empInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(empInterceptor);
    }
}
