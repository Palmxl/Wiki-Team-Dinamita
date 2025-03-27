package co.edu.javeriana.wiki.controllers;

import org.springframework.beans.factory.annotation.Autowired;

//Controlador del formulario de contacto

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.edu.javeriana.wiki.models.Contacto;
import co.edu.javeriana.wiki.services.ContactoService;

@Controller
@RequestMapping("/formulario")
public class contactoController {

    @Autowired
    private ContactoService contactoService;

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("contact", new Contacto());
        return "formulario/formulario";
    }

    @PostMapping("/guardarFormulario")
    public String guardarFormulario(@ModelAttribute Contacto contact, Model model) {
        contactoService.saveContact(contact);
        model.addAttribute("message", "Mensaje enviado con éxito!");
        return "redirect:/formulario/formulario";
    }
}

