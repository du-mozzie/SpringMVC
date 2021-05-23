package com.du.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller02 {

    @RequestMapping("/t2")
    public String hello(Model model) {

        model.addAttribute("msg","controller02");
        return "hello";
    }


}