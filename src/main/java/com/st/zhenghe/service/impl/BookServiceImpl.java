package com.st.zhenghe.service.impl;

import com.st.zhenghe.entity.Book;
import com.st.zhenghe.mapper.BookMapper;
import com.st.zhenghe.service.BookService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: luotao
 * @CreateTime: 2019-03-21 12:56
 * @Description:
 */
@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;
    @Override
    @Cacheable(value = "BookList")
    public List<Book> findAll() {
        return bookMapper.findAll();
    }
}
