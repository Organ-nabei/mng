package com.nabei.common.aspect;

import com.nabei.common.exception.MngException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: huangxiaosen
 * @Date: 2018/9/25 20:20
 * @Description:
 */
@Aspect
@Configuration
public class RedisAspect {

    private Logger logger = LoggerFactory.getLogger(RedisAspect.class);

    @Value("${mng.redis.open}")
    private boolean open;

    @Around("execution(* com.nabei.common.utils.RedisUtils.*(..))")
    public Object doAround(ProceedingJoinPoint point) throws Throwable{
        Object result = null;
        if(open){
            try{
                result = point.proceed();
            }catch (Exception e){
                logger.error(e.getMessage());
                throw new MngException();
            }
        }
        return result;
    }


}
