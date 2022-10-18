package com.kedom.myInterceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 用于用户登陆。
 * */
@Component
public class TokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws Exception {
//        if (!AboutToken.verificationToken(httpServletRequest.getHeader("username"),httpServletRequest.getHeader("token"))) {
//          ResponseBase response=new ResponseBase();
//          response.fillCode(CodeEnum.ERROR_SERVER);
//            try {
//                httpServletResponse.setHeader("Content-type", "text/html;charset=UTF-8");
//                httpServletResponse.setCharacterEncoding("UTF-8");
//                httpServletResponse.getWriter().write(JSON.toJSONString(response));
//            } catch (IOException ioException) {
//                ioException.printStackTrace();
//            }
//        }
//        httpServletResponse.setHeader("Content-type", "text/html;charset=UTF-8");
//        httpServletResponse.setCharacterEncoding("UTF-8");
//        httpServletResponse.getWriter().write("访问过于频繁");
        System.out.println(handler);
        System.out.println("访问");
        System.out.println(httpServletRequest.getRequestURL());
        return true;


    }


}
