package com.st.zhenghe.exception;

import com.st.zhenghe.VO.ResultVO;
import com.st.zhenghe.enums.ResultEnum;
import com.st.zhenghe.util.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.rmi.runtime.Log;

import java.util.logging.Logger;

/**
 * @Author: luotao
 * @CreateTime: 2019-03-21 00:10
 * @Description: yichangchuli
 */
@ControllerAdvice
@Slf4j
public class MyExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultVO exceptionHandler(Exception e){
        if (e instanceof MyException){
            log.warn("异常码：{}，异常信息：{}",((MyException) e).getCode(),e.getMessage());
            return ResultVOUtil.error(((MyException) e).getCode(),e.getMessage());
        }
        log.error("系统异常 {}", e);
        return ResultVOUtil.error(ResultEnum.UNKNOW_ERROR);
    }
}
