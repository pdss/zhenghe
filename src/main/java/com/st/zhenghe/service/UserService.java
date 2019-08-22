package com.st.zhenghe.service;

import com.st.zhenghe.entity.User;

/**
 * @Author: luotao
 * @CreateTime: 2019-03-21 12:43
 * @Description:
 */
public interface UserService {
    User queryByUsername(String username);
    Void test();
}
