package org.lqj.vhr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HelloController
 * @Description
 * @Author liuqiangjian
 * @Date 2021/3/17 上午6:57
 * @Version 1.0
 **/
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/employee/basic/test")
    public String test1(){
        return "/employee/basic/test";
    }


}
