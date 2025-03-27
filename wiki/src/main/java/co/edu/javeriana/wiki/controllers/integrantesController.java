package co.edu.javeriana.wiki.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/")
public class integrantesController {
    private final List<String> validNames = List.of("Juan", "Juano", "Gaby", "Carva", "Luis", "Miguel");
    @GetMapping("{name}")
    public String loadPage(@PathVariable String name) {
        if (!validNames.contains(name)) {
            return "error";
        }
        return name;
    }    
}
