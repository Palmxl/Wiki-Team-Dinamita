package co.edu.javeriana.wiki.controllers;

//Controlador de la arquitectura del sistema

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;





@Controller
@RequestMapping("/")
public class arquitecturaController {
    @GetMapping("arquitectura-proyecto")
    public String despliegueA() {
        return "proyecto/arquitectura-proyecto";
    }
}
