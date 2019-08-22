//package com.st.zhenghe.security;
//
//import com.alibaba.fastjson.JSONObject;
//import com.st.zhenghe.enums.ResultEnum;
//import com.st.zhenghe.exception.MyException;
//import com.st.zhenghe.util.ResultVOUtil;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.authentication.AuthenticationFailureHandler;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
///**
// * @Author: luotao
// * @CreateTime: 2019-03-26 13:01
// * @Description:
// */
//@Component
//public class MyAuthenticationFailHandler implements AuthenticationFailureHandler {
//    @Override
//    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
//        //httpServletResponse.getWriter().write(e.getMessage());
//        //throw new MyException(ResultEnum.USER_OR_PASSWORD_ERROR);
//        httpServletResponse.setContentType("application/json;charset=UTF-8");
//        PrintWriter writer = httpServletResponse.getWriter();
//        String resultString = JSONObject.toJSONString(ResultVOUtil.error(ResultEnum.USER_OR_PASSWORD_ERROR));
//        writer.write(resultString);
//        writer.flush();
//    }
//}
