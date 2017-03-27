package com.example.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on
 */
public class LogInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        //该方法将在请求处理之前进行调用，比如判断当前登录的用户，如果没有登录
        // 跳到你自己的登录页面 response.sendRedirect("/admin/login"); 返回 false，下面两个方法都不会执行
        //有登录，返回true
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        //preHandle 方法的返回值为true 时才能被调当前请求进行处理之后，
        // 也就是Controller 方法调用之后执行，但是它会在DispatcherServlet 进行视图返回渲染之前被调用

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        //该方法将在整个请求结束之后，也就是在DispatcherServlet 渲染了对应的视图之后执行
        // 在这里可以做些日志处理 LogUtils.saveLog(request, handler, e);
    }
}
