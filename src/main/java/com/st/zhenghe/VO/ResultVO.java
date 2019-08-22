package com.st.zhenghe.VO;

import lombok.Data;

/**
 * @Author: luotao
 * @CreateTime: 2019-03-20 22:26
 * @Description: 返回值
 */
@Data
public class ResultVO<T> {
    private Integer code;
    private String msg;
    private T date;
}
