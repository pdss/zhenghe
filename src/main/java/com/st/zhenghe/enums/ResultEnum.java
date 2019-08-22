package com.st.zhenghe.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {
    USER_OR_PASSWORD_ERROR(101,"用户名或密码错误"),
    UNKNOW_ERROR(-1,"未知异常"),
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg ) {
        this.code = code;
        this.msg = msg;
    }
}
