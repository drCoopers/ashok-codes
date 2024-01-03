package com.sanketdd.mvcExceptionEx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/moon")
public class MoonController {

    @GetMapping
    public String getMoon(){
        String s= null;
        s.length();
        return "moon";

    }
}
