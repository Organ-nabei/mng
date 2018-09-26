package com.nabei.common.utils;

import java.util.HashMap;

/**
 * @Auther: huangxiaosen
 * @Date: 2018/9/24 17:08
 * @Description:  响应
 */
public class Response<T> extends HashMap<String,Object>{


    public Response(){
        put("code",ServerCode.SUCCESS.getCode());
        put("message",ServerCode.SUCCESS.getMessage());
    }

    public Response(Integer errorCode, String message) {
        put("code",errorCode);
        put("message",message);
    }

    public Response(Integer errorCode, String message, T data) {
        put("code",errorCode);
        put("message",message);
        put("data",data);
    }


    /**
     * 成功
     * @param data
     * @param < T >
     * @return
     */
    public static <T> Response getSuccessResponse(T data) {
        return new Response(ServerCode.SUCCESS.getCode(), ServerCode.SUCCESS.getMessage(), data);
    }


    /**
     * 成功
     * @param data
     * @param message
     * @return
     */
    public static <T> Response getSuccessResponse(T data, String message) {
        return new Response(ServerCode.SUCCESS.getCode(), message, data);
    }

    public static <T> Response getSuccessResponse(T data,ServerCode serverCode) {
        return new Response(serverCode.getCode(), serverCode.getMessage(), data);
    }

    public static <T> Response getSuccessResponse() {
        return new Response(ServerCode.SUCCESS.getCode(), "处理成功", null);
    }

    /**
     * 获取失败的Response
     * @return
     */
    public static Response getFailResponse() {
        Response response = new Response(ServerCode.UNKNOWN_EXCEPTION.getCode(), ServerCode.UNKNOWN_EXCEPTION.getMessage());
        return response;
    }

    public static Response getFailResponse(ServerCode errorCode) {
        return new Response(errorCode.getCode(), errorCode.getMessage());
    }

    public static Response getFailResponse(String message) {
        Response response = new Response(ServerCode.UNKNOWN_EXCEPTION.getCode(), message);
        return response;
    }



}
