package com.greenhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathController {

    //支持restFul风格的URL
    @RequestMapping("/testPathVariable/{id}/{username}")
    public String testPathVariable(@PathVariable("id") String id, @PathVariable("username") String username){
        System.out.println("testPathVariable1: "+id+" -- "+username);
        return "success";
    }

}
