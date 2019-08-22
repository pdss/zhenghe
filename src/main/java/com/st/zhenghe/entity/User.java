package com.st.zhenghe.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: luotao
 * @CreateTime: 2019-03-21 12:02
 * @Description: 用户表
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
}
