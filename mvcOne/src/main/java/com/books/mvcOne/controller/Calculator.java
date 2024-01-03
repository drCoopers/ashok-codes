package com.books.mvcOne.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api/v1/calc")
public class Calculator {


    @GetMapping("/")
    public String showPage(Model model){
        return "";
    }
}
