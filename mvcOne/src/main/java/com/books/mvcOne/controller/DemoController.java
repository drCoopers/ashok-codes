package com.books.mvcOne.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api/v1/demo")
public class DemoController {

    @GetMapping("/demo1")
    public String getDemo1(Model model){
        return "index";
    }


    @GetMapping("/demo2")
    @ResponseBody
    public String getDemo2(){
        return "WELCOME TO NASA";
    }

    @GetMapping("demo3")
    @ResponseBody
    public ModelAndView getDemo3(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return  modelAndView;
    }
}
