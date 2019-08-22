package com.st.zhenghe.service.impl;

import com.st.zhenghe.entity.User;
import com.st.zhenghe.enums.ResultEnum;
import com.st.zhenghe.exception.MyException;
import com.st.zhenghe.mapper.UserMapper;
import com.st.zhenghe.service.UserService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: luotao
 * @CreateTime: 2019-03-21 12:44
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    @Cacheable(value = "user",key = "#username")
    public User queryByUsername(String username) {
        return userMapper.queryByUsername(username);
    }

    @Override
    public Void test() {
        throw new MyException(ResultEnum.USER_OR_PASSWORD_ERROR);
    }
}
