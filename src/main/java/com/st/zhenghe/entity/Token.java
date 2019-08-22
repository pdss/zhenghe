package com.st.zhenghe.entity;

import lombok.Data;

/**
 * @Author: luotao
 * @CreateTime: 2019-03-21 12:03
 * @Description: token
 */
@Data
public class Token {
    private Integer id;
    private Integer userId;
    private String token;
    private Integer createTime;
}
