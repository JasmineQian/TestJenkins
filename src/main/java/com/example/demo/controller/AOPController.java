package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

@RestController
@RequestMapping
public class AOPController {

    @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(){
        SimpleDateFormat simpleFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssSSS");
        return "hello Jasmine, this time is " + simpleFormatter.format(System.currentTimeMillis());
    }
}
