package com.curso.eccomerce.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/administrador")
public class AdministradorController {

    @GetMapping("")
    public String home(){
        return "administrador/home";
    }
}
