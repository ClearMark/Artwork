package com.kedom.myExceptionResolver;

import com.google.gson.Gson;
import com.kedom.dao.ExceptionLogDao;
import com.kedom.entity.CodeEnum;
import com.kedom.entity.ExceptionLog;
import com.kedom.entity.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//MVC全局异常处理器
@ControllerAdvice
public class MyExceptionResolver implements HandlerExceptionResolver {
    @Autowired
   private ExceptionLogDao exceptionLogDao;

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

        StackTraceElement stackTraceElement= e.getStackTrace()[0];
        String exceptionURL= httpServletRequest.getRequestURL().toString();
        String exceptionClassName= stackTraceElement.getClassName();
        String exceptionMethodName= stackTraceElement.getMethodName();
        String exceptionMessage = e.getMessage();
//        ExceptionLog exceptionLog=new ExceptionLog(exceptionURL,exceptionClassName,exceptionMethodName,exceptionMessage);
//        exceptionLogDao.insert(exceptionLog);
        System.out.println("全局异常捕获");

        R response = new R();
        response.fillCode(CodeEnum.ERROR_SERVER);
        try {
            httpServletResponse.setHeader("Content-type", "text/html;charset=UTF-8");
            httpServletResponse.setCharacterEncoding("UTF-8");
            httpServletResponse.getWriter().write(new Gson().toJson(response));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return new ModelAndView();
    }
}
