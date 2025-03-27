package co.edu.javeriana.wiki.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class inicioController {
    @GetMapping("/")
    public String inicio() {
        return "PaginaInicio";
    }
    @GetMapping("PaginaInicio")
    public String inicioReturn() {
        return "PaginaInicio";
    }
    
}