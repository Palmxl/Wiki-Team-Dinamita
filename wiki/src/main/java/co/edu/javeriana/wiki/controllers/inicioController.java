package co.edu.javeriana.wiki.controllers;

//Controlador de la página principal

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;






@Controller
public class inicioController {
    @GetMapping("/index")
    public String inicio() {
        return "index";
    }
    
}