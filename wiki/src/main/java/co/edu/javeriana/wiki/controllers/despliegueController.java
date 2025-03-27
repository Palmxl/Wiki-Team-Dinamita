package co.edu.javeriana.wiki.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
@RequestMapping("/")
public class despliegueController {
    @GetMapping("despliegue-proyecto")
    public String despliegueD() {
        return "proyecto/despliegue-proyecto";
    }
}
