package com.nabei.common.dto;

/**
 * @Auther: huangxiaosen
 * @Date: 2018/9/24 16:19
 * @Description: 异常数据转换
 */
public class ErrorInfo<T> {

    public static final Integer OK = 0000;
    public static final Integer ERROR = 9999;

    private Integer code;
    private String message;
    private String url;
    private T data;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getUrl() {
        return url;
    }

    public T getData() {
        return data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setData(T data) {
        this.data = data;
    }
}
