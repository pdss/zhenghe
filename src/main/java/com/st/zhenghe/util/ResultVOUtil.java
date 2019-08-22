package com.st.zhenghe.util;

import com.st.zhenghe.VO.ResultVO;
import com.st.zhenghe.enums.ResultEnum;

/**
 * @Author: luotao
 * @CreateTime: 2019-03-20 22:30
 * @Description:
 */
public class ResultVOUtil {
    public static ResultVO succes(Object o){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setDate(o);
        return resultVO;
    }
    public static ResultVO success(){
        return succes(null);
    }
    public static ResultVO error(ResultEnum resultEnum){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(resultEnum.getCode());
        resultVO.setMsg(resultEnum.getMsg());
        return resultVO;
    }
    public static ResultVO error(int code, String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
