package com.du.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/h1")
    public String hello(Model model) {
        //封装数据
        model.addAttribute("msg","Hello World");

        //hello就是视图的名字，会被视图解析器处理，自动拼接
        return "hello";
    }

}