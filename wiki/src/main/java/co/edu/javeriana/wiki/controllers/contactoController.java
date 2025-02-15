package co.edu.javeriana.wiki.controllers;

//Controlador del formulario de contacto

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class contactoController {

    @GetMapping("/formulario/formulario")
    public String mostrarFormulario() {
        return "formulario/formulario"; // Devuelve el archivo formulario.html dentro de la carpeta "formulario"
    }
}

