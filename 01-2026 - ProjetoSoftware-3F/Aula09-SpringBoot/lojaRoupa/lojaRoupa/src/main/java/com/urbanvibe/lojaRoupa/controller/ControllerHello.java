package com.urbanvibe.lojaRoupa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Informa que a classe tera requisicoes via API RestFul
@RestController
//Informa o caminho para chegar na classe
@RequestMapping("/hello")
public class ControllerHello {

    @GetMapping
    public String sayHello() {
        return "<h1>Hello World</h1>";
    }
}
