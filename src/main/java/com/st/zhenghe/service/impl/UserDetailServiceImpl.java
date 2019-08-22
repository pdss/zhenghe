//package com.st.zhenghe.service.impl;
//
//import com.st.zhenghe.DTO.MyUserDetail;
//import com.st.zhenghe.mapper.UserMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.util.StringUtils;
//
//import javax.annotation.Resource;
//
///**
// * @Author: luotao
// * @CreateTime: 2019-03-27 23:13
// * @Description:
// */
//@Service
//public class UserDetailServiceImpl implements UserDetailsService {
//    @Resource
//    private UserMapper userMapper;
//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;
//
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        MyUserDetail myUserDetail = new MyUserDetail();
//        myUserDetail.setUsername(s);
//        String password = stringRedisTemplate.opsForValue().get(s);
//        if(!StringUtils.isEmpty(password)){
//            myUserDetail.setPassword(password);
//            return myUserDetail;
//        }
//        password = userMapper.queryByUsername(s).getPassword();
//        stringRedisTemplate.opsForValue().append(s, password);
//        myUserDetail.setPassword(password);
//        return myUserDetail;
//    }
//}
