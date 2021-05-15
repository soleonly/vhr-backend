package org.lqj.vhr.controller;

import org.lqj.vhr.model.RespBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname LoginController
 * @Description
 * @Author liuqiangjian
 * @Date 2021/4/8 23:12
 * @Version 1.0
 **/
@RestController
public class LoginController {
    @GetMapping("/login")
    //@CrossOrigin("*")
    public RespBean login(){
        return RespBean.error("尚未登录，请登录");
    }
}
