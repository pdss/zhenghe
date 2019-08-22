package com.st.zhenghe.util;

import io.jsonwebtoken.Jwts;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.bind.DatatypeConverter;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class JWTUtilTest {
    @Test
    public void Test(){
        String token = JWTUtil.createToken("luotao");
        System.out.println("token:"+token);
        System.out.println(Jwts.parser()
                .setSigningKey(DatatypeConverter.parseBase64Binary("admin"))
                .parseClaimsJws(token).getBody());
    }

}