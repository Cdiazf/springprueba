package com.example.appformulariospringparte2.controller;

import com.example.appformulariospringparte2.model.Alumno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlumnoController {
    @GetMapping("/alumnos")
    public String frmAlumno(Model model){
        List<Alumno> lstAlumno = new ArrayList<>();

        lstAlumno.add(new Alumno("Cesar","Diaz","Masculino"));
        lstAlumno.add(new Alumno("Jose","Bova","Masculino"));
        lstAlumno.add(new Alumno("Carlos","Guil","Masculino"));
        lstAlumno.add(new Alumno("Maritza","Mercy","Femenino"));
        model.addAttribute("listaalumno",lstAlumno);

        return "frmAlumno";
    }
}
