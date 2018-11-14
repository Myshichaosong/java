package com.example.basiclogin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shichaosong
 * @Title: shichaosong
 * @ProjectName basicframework
 * @Description: TODO
 * @date 2018/11/10  13:03
 * @remark
 */
@RestController
public class UserInfoController {

    @RequestMapping("/user")
    public String user(){
        return "Hello world";
    }

}
