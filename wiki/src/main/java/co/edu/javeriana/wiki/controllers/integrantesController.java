package co.edu.javeriana.wiki.controllers;

//Controlador de los integrantes del proyecto

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class integrantesController {
    private final List<String> validNames = List.of("Juan", "Juano", "Gaby", "Carva", "Luis", "Miguel");
    //private final List<String> validProjects = List.of("index");
    @GetMapping("{name}")
    public String loadPage(@PathVariable String name) {
        if (!validNames.contains(name)) {
            return "error"; // Si el nombre no está en la lista, redirige a una página de error
        }
        return name;
    }    
}
