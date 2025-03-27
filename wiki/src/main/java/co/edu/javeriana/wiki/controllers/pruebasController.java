package co.edu.javeriana.wiki.controllers;

//Controlador de los casos de prueba

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")
public class pruebasController {
    @GetMapping("pruebas-proyecto")
    public String despliegueP() {
        return "proyecto/pruebas-proyecto";
    }
}
