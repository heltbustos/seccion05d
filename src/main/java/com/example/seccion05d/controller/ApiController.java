package com.example.seccion05d.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class ApiController {

    @GetMapping("/saludo")
    public String hola(){
        return "HOLA"; 
    }

}
