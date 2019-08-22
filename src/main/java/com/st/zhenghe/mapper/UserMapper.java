package com.st.zhenghe.mapper;

import com.st.zhenghe.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: luotao
 * @CreateTime: 2019-03-21 12:04
 * @Description: mapper
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where username = #{username}")
    User queryByUsername(String username);
    @Insert("insert into user(username,password) values(#{username},#{password})")
    Integer insertUser(User user);
}
