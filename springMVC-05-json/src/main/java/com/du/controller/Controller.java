package com.du.controller;

import com.alibaba.fastjson.JSON;
import com.du.pojo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@org.springframework.stereotype.Controller
@RestController
public class Controller {

    @RequestMapping("/t1")
    //使用这个注解不会走视图解析器，会直接返回一个字符串
    //@ResponseBody
    public String json01() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        User user = new User("Du", 19, "male");

        //将对象转为json字符串
        String str = mapper.writeValueAsString(user);

        return str;
    }

    @RequestMapping("/t2")
    public String json02() throws JsonProcessingException {

        List<User> list = new ArrayList<User>();
        list.add(new User("Du01",19,"male"));
        list.add(new User("Du02",19,"male"));
        list.add(new User("Du03",19,"male"));
        list.add(new User("Du04",19,"male"));

        return new ObjectMapper().writeValueAsString(list);
    }

    @RequestMapping("/t3")
    public String json03() {

        List<User> list = new ArrayList<User>();
        list.add(new User("Du01",19,"male"));
        list.add(new User("Du02",19,"male"));
        list.add(new User("Du03",19,"male"));
        list.add(new User("Du04",19,"male"));

        String s = JSON.toJSONString(list);
        return s;
    }

}