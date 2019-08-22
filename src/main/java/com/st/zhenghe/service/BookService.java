package com.st.zhenghe.service;

import com.st.zhenghe.entity.Book;

import java.util.List;

/**
 * @Author: luotao
 * @CreateTime: 2019-03-21 12:55
 * @Description:
 */
public interface BookService {
    List<Book> findAll();
}
