package com.example.basicboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shichaosong
 * @Title: shichaosong
 * @ProjectName basicframework
 * @Description: TODO
 * @date 2018/11/9  17:11
 * @remark
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
