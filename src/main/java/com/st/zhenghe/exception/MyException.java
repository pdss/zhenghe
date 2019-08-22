package com.st.zhenghe.exception;

import com.st.zhenghe.enums.ResultEnum;
import lombok.Data;

/**
 * @Author: luotao
 * @CreateTime: 2019-03-21 00:36
 * @Description:
 */
@Data
public class MyException extends RuntimeException {
    private Integer code;

    public MyException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
