package com.jd.sys;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wangrongtao on 15/6/1.
 */
public class RequestInterceptor extends HandlerInterceptorAdapter {
    public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {
        DataSourceContextHolder.setDataSourceType("mydataSourse");
        return true;
    }
    public void afterCompletion(HttpServletRequest httpservletrequest,HttpServletResponse httpservletresponse, Object obj,Exception exception) throws Exception {
        //log.debug("=====afterCompletion====");
        DataSourceContextHolder.clearDataSourceType();
    }
}
