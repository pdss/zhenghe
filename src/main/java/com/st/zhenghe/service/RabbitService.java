package com.st.zhenghe.service;

import com.st.zhenghe.entity.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author: luotao
 * @CreateTime: 2019-04-11 16:39
 * @Description:
 */
@Service
public class RabbitService {
    @RabbitListener(queues ="st.message")
    public void test(User user){
        System.out.println(user);
    }
}
