package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;


@RestController
@RequestMapping
public class AOPController {

    @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(){
        SimpleDateFormat simpleFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS");
        return "To do Lists: \n" +
                "1.Jenkins 持续集成 \n" +
                "hello Jasmine, this time is " + simpleFormatter.format(System.currentTimeMillis());
    }
}
