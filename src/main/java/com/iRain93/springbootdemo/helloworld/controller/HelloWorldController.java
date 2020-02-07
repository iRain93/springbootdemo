package com.iRain93.springbootdemo.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用一句话描述次类
 *
 * @author lu
 * @version 1.0
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    @ResponseBody
    public String get() {
        return "Hello world";
    }
}
