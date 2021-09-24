package com.greenhi.controller;

import com.greenhi.pojo.Person;
import com.greenhi.pojo.Pet;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class TestDataController {

    /*
    * 紧耦合方式参数注入
    * 使用传统的HttpServletRequest对象获取参数  javax.servlet
    * */
    @RequestMapping("/getParamByRequest")
    public String getParam1(HttpServletRequest req, HttpServletResponse resp){
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("username:"+username+" password:"+password);
        return "getParamSuccess";
    }
    /*
    * 解耦方式参数注入
    * 通过SpringMVC框架功能，自动转换参数
    * 处理单元参数列表中的参数名必须与请求中的参数名保持一致，否则需要使用@RequestParam注解声明
    * */
    @RequestMapping("/getParamByArgName")
    public String getParam2(String username,@RequestParam("pwd") String password){
        System.out.println("username:"+username+" password:"+password);
        return "getParamSuccess";
    }

    /*
    * 使用POJO接收参数：
    * 提交的参数名必须和POJO的属性名保持一致
    * springMVC底层通过反射给参数列表的属性赋值
    * 通过set方法设置属性值，POJO属性要有set方法
    * */
    @RequestMapping("/getDataByPojo")
    public String getDataByPojo(Person p){
        System.out.println(p);
        /*
        //要给参数列表中的List参数赋值，必须把网页数据封装成json数据
        //或把List参数再封装，例如把pets放到Person里面去
        for(Pet pet:pets){
            System.out.println(pet);
        }*/
        return "getDataSuccess";
    }

}
