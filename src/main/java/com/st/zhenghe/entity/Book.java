package com.st.zhenghe.entity;

import io.swagger.models.auth.In;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: luotao
 * @CreateTime: 2019-03-21 12:53
 * @Description:
 */
@Data
public class Book implements Serializable {
    private Integer id;
    private String name;
    private String author;
}
