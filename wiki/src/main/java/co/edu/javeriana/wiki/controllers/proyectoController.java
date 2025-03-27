package co.edu.javeriana.wiki.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class proyectoController {
    @GetMapping("descripcion-proyecto")
    public String despliegueP() {
        return "proyecto/descripcion-proyecto";
    }
}
