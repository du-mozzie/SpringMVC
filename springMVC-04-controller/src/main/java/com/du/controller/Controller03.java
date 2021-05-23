package com.du.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller03 {

    @RequestMapping("/t3")
    public String hello(Model model){

        model.addAttribute("msg","controller03");
        return "redirect:/index.jsp";
    }
}