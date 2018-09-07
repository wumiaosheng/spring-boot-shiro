package com.neo.framwork.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 不同的状态码跳转不同的页面
 * @author xwolf
 * @version 1.0
 * @since 1.8
 */

public class ErrorInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
                          String uri = httpServletRequest.getRequestURI();
                          int status = httpServletResponse.getStatus();
                          //log.info("uri={},status={}",uri,status);

                          switch (status){
                              case 500:
                                  modelAndView.setViewName("error/500");
                                  break;
                              case 400:
                                  modelAndView.setViewName("error/400");
                                  break;
                              case 404:
                                  modelAndView.setViewName("error/404");
                                  break;
                              case 302:
                                  modelAndView.setViewName("error/302");
                                  break;
                          }
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
