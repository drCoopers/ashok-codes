package com.sanketdd.mvcExceptionEx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DemoController {

    @GetMapping("/index")
    public String getWelcomePage(Model model){
        model.addAttribute("msg"," Sanket");
        int i=1/0;

        return "index";
    }

    @GetMapping("/gret")
    public String getWelcomePages(Model model){
        model.addAttribute("msg"," Sanket");


        return "index";
    }

    @ExceptionHandler(value = Exception.class)
    public String handleException(Exception e){
        System.out.println("Exception occurred "+ e.getMessage());
        return "error-view";
    }
}
