package com.nabei.common.exception;

import com.nabei.common.dto.ErrorInfo;
import com.nabei.common.utils.Response;
import com.nabei.common.utils.ServerCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: huangxiaosen
 * @Date: 2018/9/24 16:46
 * @Description: 统一异常处理
 */
@RestControllerAdvice
public class MngExceptionHandler {

    @ExceptionHandler(value = MngException.class)
    public ErrorInfo<String> handleMngExceptionException(HttpServletRequest req, MngException e) throws Exception {
        ErrorInfo<String> r = new ErrorInfo<>();
        r.setMessage(e.getMessage());
        r.setCode(e.getCode());
        r.setData(null);
        r.setUrl(req.getRequestURL().toString());
        return r;
    }

    @ExceptionHandler(value = NoHandlerFoundException.class)
    @ResponseBody
    public ErrorInfo<String> handleNoHandlerFoundException(HttpServletRequest req, NoHandlerFoundException e) throws Exception {
        ErrorInfo<String> r  = new ErrorInfo<>();
        r.setMessage("你访问的路径走丢啦!!!");
        r.setCode(404);
        r.setUrl(req.getRequestURL().toString());
        return r;
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ErrorInfo<String> handleException(HttpServletRequest req, Exception e) throws Exception {
        ErrorInfo<String> r  = new ErrorInfo<>();
        r.setMessage(ServerCode.UNKNOWN_EXCEPTION.getMessage());
        r.setCode(ServerCode.UNKNOWN_EXCEPTION.getCode());
        r.setUrl(req.getRequestURL().toString());
        return r;
    }
}