package com.example.appformulariospringparte2.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(Model model){
        return "home";
    }

    @GetMapping("/index")
    public String index(Model model){
        return "index";
    }
}
