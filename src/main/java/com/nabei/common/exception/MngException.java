package com.nabei.common.exception;


import com.nabei.common.utils.ServerCode;

/**
 * @Auther: huangxiaosen
 * @Date: 2018/9/24 16:24
 * @Description: 异常处理
 */
public class MngException extends RuntimeException {

    private Integer code = 9999;

    private String message;


    public MngException(){
        this.code = ServerCode.UNKNOWN_EXCEPTION.getCode();
        this.message = ServerCode.UNKNOWN_EXCEPTION.getMessage();
    }

    public MngException(ServerCode serverCode){
        this.code = serverCode.getCode();
        this.message = serverCode.getMessage();
    }

    public MngException(String message){
        this.message = message;
    }


    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {

        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
