package com.nabei.modules.web.member;

import com.nabei.common.utils.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("webMemberController")
@RequestMapping("/web/auth")
public class MemberController {


    @GetMapping("index")
    public Response index(){
        return Response.getSuccessResponse("web/auth/index");
    }



}
