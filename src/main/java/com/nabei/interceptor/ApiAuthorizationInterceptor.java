package com.nabei.interceptor;

import com.nabei.common.exception.MngException;
import com.nabei.common.utils.FaJsonUtils;
import com.nabei.common.utils.RedisUtils;
import com.nabei.common.utils.ServerCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Component
public class ApiAuthorizationInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    RedisUtils redisUtils;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        String token = request.getHeader("token");
//
//        if(StringUtils.isEmpty(token)){
//            throw new MngException(ServerCode.TOKEN_EXPIRED);
//        }
//        Map<String,Object> map = FaJsonUtils.parseObj(redisUtils.get(token),Map.class);

        return super.preHandle(request, response, handler);
    }
}
