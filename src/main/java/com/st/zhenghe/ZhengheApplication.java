package com.st.zhenghe;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@EnableRabbit
@SpringBootApplication
public class ZhengheApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhengheApplication.class, args);
    }

}
