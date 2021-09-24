package com.greenhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/greenhi")
public class MyController {

    /*
    **定义一个处理请求的方法
    * 返回类型String，用来表明要跳转的页面路径
     */
    @RequestMapping("/firstController.do")
    public String firstController(){
        System.out.println("firstController");
        return "first";
    }

    @RequestMapping(value = "/testRequest",method = {RequestMethod.GET,RequestMethod.POST})
    public String testRequest(){
        System.out.println("testRequest");
        return "success";
    }

    @RequestMapping(value = "/testRequest2",params = {"username!=root","password"})
    public String testRequest2(){
        System.out.println("testRequest2");
        return "success";
    }

    @RequestMapping(value = "/testRequest3",headers = "Accept-Encoding=gzip, deflate, br")
    public String testRequest3(){
        System.out.println("testRequest3");
        return "success";
    }

}
