package com.nabei.common.aspect;

import com.nabei.common.utils.FaJsonUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

@Aspect
@Configuration
public class MngWebLogAspect {

    private Logger logger = LoggerFactory.getLogger(MngWebLogAspect.class);
    @Pointcut("execution(* com.nabei.modules..*.*(..))")
    public void webLog(){}


    @Before("webLog()")
    public void toBefore(JoinPoint joinPoint) throws Throwable{
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        String params = FaJsonUtils.objToString(request.getParameterMap());
        // 记录下请求内容
        logger.warn("request:{URL:"+ request.getRequestURL().toString()+":,ActionName : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName()
                +",params:"+params+"}");
    }

    @AfterReturning(returning = "response", pointcut = "webLog()")
    public void doAfterReturning(Object response) throws Throwable {
        // 处理完请求，返回内容
        logger.info("reponse:"+response+"");
    }


}
