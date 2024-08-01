package com.ProyectoAdopciones.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DonacionController {

    @GetMapping("/donar")
    public String donar(Model model) {
        
        return "donar";
       
    }
    @GetMapping("/contacto")
    public String contacto() {
        return "contacto";
    }
    
    @GetMapping("/sobrenosotros")
    public String sobrenosotros() {
        return "sobrenosotros";
    }

    
}
