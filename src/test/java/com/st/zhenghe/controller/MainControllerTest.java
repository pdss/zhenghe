package com.st.zhenghe.controller;

import com.st.zhenghe.entity.User;
import com.st.zhenghe.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class MainControllerTest {
    @Resource
    private UserMapper userMapper;
    @Autowired
    RabbitTemplate rabbitTemplate;
    @Test
    public void test(){
        User user = new User();
        user.setUsername("luotao");
        user.setPassword("123123");
        rabbitTemplate.convertAndSend("st.test", "st.message", user);
    }
    @Test
    public void setRabbitTemplate(){
        System.out.println(rabbitTemplate.receiveAndConvert("st.message").toString());
    }

}