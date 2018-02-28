package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping(value = "/")
    public String home (){

        return "home";

    }
    @RequestMapping(value = "/index")
    public String index (){

        return "index";

    }
}
