package com.bfs.ryan.rest_api_interceptor.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Component
public class EmpInterceptor implements HandlerInterceptor {
    private static Logger log = LoggerFactory.getLogger(EmpInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("EmpInterceptor - preHandle");
        boolean flag = true;

        String method = request.getMethod();
        int contentLen = request.getContentLength();
        if (method.equalsIgnoreCase("post") || method.equalsIgnoreCase("put")) {
            String contentType = request.getContentType();
            if (contentType != null && !contentType.equalsIgnoreCase("application/jason")) {
                flag = false;
            } else if (contentLen < 2) {
                flag = false;
            }
        }
        if (!flag) {
            response.sendRedirect("/home");
        }
        return flag;
        //return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("EmpInterceptor - postHandle");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("EmpInterceptor - afterCompletion");
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
