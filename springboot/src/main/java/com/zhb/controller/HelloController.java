package com.zhb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 18618 on 2019/4/3.
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hi")
    public Object helloController(){
        return "springBoot";
    }

}
