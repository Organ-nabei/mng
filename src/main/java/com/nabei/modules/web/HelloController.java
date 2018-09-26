package com.nabei.modules.web;


import com.nabei.common.utils.RedisUtils;
import com.nabei.common.utils.Response;
import com.nabei.entity.User;
import com.nabei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/web/hello")
public class HelloController {

    @Autowired
    RedisUtils redisUtils;

    @Resource
    UserService userService;

    @GetMapping("index")
    public Response index(){
        Object obj  = redisUtils.get("APP-MNG_DELIVER_INFO_36");
        return Response.getSuccessResponse(obj);
    }

    @GetMapping("userIndex")
    public Response userIndex(){
        List<User> list = userService.list(null);
        return Response.getSuccessResponse(list);
    }

}
