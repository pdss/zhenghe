package com.st.zhenghe.util;

import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.xml.bind.DatatypeConverter;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

/**
 * @Author: luotao
 * @CreateTime: 2019-04-02 16:34
 * @Description:
 */
public class JWTUtil {
    public static final String secret = "admin";
    public static String createToken(String username){
        long invalidMillis = 360000;
        return createToken(username,invalidMillis);
    }

    public static String createToken(String username, long invalidMillis) {
        //签名算法
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        //生成签发时间
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        //通过密钥签名jwt
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(secret);
        //jwt声明
        JwtBuilder builder = Jwts.builder().setId(username)
                .setIssuedAt(now)
                .signWith(signatureAlgorithm, apiKeySecretBytes);
        if (invalidMillis >= 0) {
            long expMillis = nowMillis + invalidMillis;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp);
        }
        return builder.compact();
        }
    }

