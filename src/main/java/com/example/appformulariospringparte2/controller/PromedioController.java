package com.example.appformulariospringparte2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PromedioController {
    @GetMapping("/promedios")
    public String frmPromedioNotas(Model model){
        return "frmPromedio";
    }
}
