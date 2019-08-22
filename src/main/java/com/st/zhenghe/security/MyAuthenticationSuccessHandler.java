//package com.st.zhenghe.security;
//
//import com.alibaba.druid.support.json.JSONUtils;
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//import com.st.zhenghe.service.BookService;
//import com.st.zhenghe.util.ResultVOUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//import org.springframework.stereotype.Component;
//import springfox.documentation.spring.web.json.Json;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//import java.io.PrintWriter;
//
///**
// * @Author: luotao
// * @CreateTime: 2019-03-26 12:44
// * @Description:
// */
//@Component
//public class MyAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
//    @Autowired
//    private BookService bookService;
//    @Override
//    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
//    //        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
//    //        httpServletResponse.setHeader("Access-Control-Allow-Headers", "token, Accept, Origin, X-Requested-With, Content-Type, Last-Modified");
//        HttpSession session = httpServletRequest.getSession();
//        httpServletResponse.setContentType("application/json;charset=UTF-8");
//        PrintWriter printWriter = httpServletResponse.getWriter();
//        String resultJson = JSONObject.toJSONString(ResultVOUtil.success());
//        printWriter.write(resultJson);
//        printWriter.flush();
//    }
//}
