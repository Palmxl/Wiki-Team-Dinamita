package co.edu.javeriana.wiki.controllers;

//Controlador del formulario de contacto

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;






@Controller
public class contactoController {
    @GetMapping("/contacto")
    public String contacto() {
        return "contacto";
    }
    
}
