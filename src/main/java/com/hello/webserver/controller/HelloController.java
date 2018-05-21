package com.hello.webserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.plugin2.message.Message;

import java.awt.*;
import java.nio.channels.FileChannel;

@Controller
@RequestMapping("/index")
public class HelloController {
    // 添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    private String message1;
    private String message2;
    public void setMessage1(String message){
        this.message1 = message;
    }

    public void setMessage2(String message){
        this.message2 = message;
    }

    public void getMessage1(){
        System.out.println("Your Message1: " + message1);
    }

    public void getMessage2(){
        System.out.println("Your Message2: " + message2);
    }

    public void init(){
        System.out.println("Bean is going throught init.");
    }

    public void destroy(){
        System.out.println("Bean will destroy now.");
    }

     //映射一个action
    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        logger.info("the first jsp pages");
        return "index";
    }


    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "index";
    }
}
