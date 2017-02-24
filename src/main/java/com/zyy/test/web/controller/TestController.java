package com.zyy.test.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhouyinyan on 17/2/24.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping
    public String testHome(){
        return "test";
    }
}
