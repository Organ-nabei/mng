package com.nabei.modules.h5.member;


import com.nabei.common.utils.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("h5MemberController")
@RequestMapping("/h5/auth")
public class MemberController {

    @GetMapping("index")
    public Response index(){
        return Response.getSuccessResponse("h5/auth/index");
    }
}
