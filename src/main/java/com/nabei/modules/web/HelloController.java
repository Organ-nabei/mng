package com.nabei.modules.web;


import com.nabei.common.utils.RedisUtils;
import com.nabei.common.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web/hello")
public class HelloController {

    @Autowired
    RedisUtils redisUtils;

    @GetMapping("index")
    public Response index(){
        Object obj  = redisUtils.get("APP-MNG_DELIVER_INFO_36");
        return Response.getSuccessResponse();
    }

}
