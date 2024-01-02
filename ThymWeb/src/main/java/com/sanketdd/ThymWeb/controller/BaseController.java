package com.sanketdd.ThymWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api/v1")
public class BaseController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Sanket";
    }

    public ModelAndView getWelcomeMessage(){
        ModelAndView modelAndView= new ModelAndView();
        modelAndView.addObject("msg","Welcome Sanket ");
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
