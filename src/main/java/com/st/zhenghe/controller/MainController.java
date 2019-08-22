package com.st.zhenghe.controller;

import com.st.zhenghe.VO.ResultVO;
import com.st.zhenghe.entity.User;
import com.st.zhenghe.enums.ResultEnum;
import com.st.zhenghe.exception.MyException;
import com.st.zhenghe.form.LoginForm;
import com.st.zhenghe.service.BookService;
import com.st.zhenghe.service.UserService;
import com.st.zhenghe.util.JWTUtil;
import com.st.zhenghe.util.ResultVOUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: luotao
 * @CreateTime: 2019-03-19 19:22
 * @Description:
 */
@RestController
@RequestMapping("/st")
@Api("异常相关的api")
public class MainController {
    @Autowired
    private UserService userService;
    @Resource
    private BookService bookService;
    @GetMapping("/test")
    public ResultVO test(){
//        userService.test();
        return ResultVOUtil.success();
    }
    @ApiOperation(value = "登陆",notes = "获取异常")
    @PostMapping("/login")
    public ResultVO doLogin(HttpServletResponse response,LoginForm loginForm){
        System.out.println(loginForm.toString());
        User user = userService.queryByUsername(loginForm.getUsername());
        if(user==(null)) {
            throw new MyException(ResultEnum.USER_OR_PASSWORD_ERROR);
        }else{
            if(DigestUtils.md5DigestAsHex(loginForm.getPassword().getBytes()).equals(user.getPassword())){
                response.setHeader("token", JWTUtil.createToken(user.getUsername()));
                return ResultVOUtil.succes(bookService.findAll());
            }
            throw new MyException(ResultEnum.USER_OR_PASSWORD_ERROR);
        }
    }
    @ApiOperation(value = "系统异常")
    @GetMapping("/un")
    public void un(){
        int i = 0;
        int sum = 1/i;
    }

}
