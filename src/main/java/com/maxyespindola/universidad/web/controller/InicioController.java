package com.maxyespindola.universidad.web.controller;

//import com.maxyespindola.universidad.service.PersonaService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;


import javax.validation.Valid;


@Controller
@Slf4j
public class InicioController {

   // @Autowired
    //private PersonaService personaService;

    @GetMapping("/")
    public String inicio(Model model, @AuthenticationPrincipal User user){
        log.info("Mostrando pagina index.html");
        log.info("Usuario login " + user);
        //var personas = personaService.listarPersona();
        var saludo = "hola spring";
        model.addAttribute("saludo", saludo);
        //model.addAttribute("personas", personas);
        return "index.html";
    }
    /**
    @GetMapping("/agregar")
    public String agregar(Persona persona){
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid Persona persona, Errors errores){
        if(errores.hasErrors()){
            return "modificar";
        }
        personaService.guardar(persona);
        return "redirect:/";
    }

    @GetMapping("/editar/{idPersona}")
    public String editar(Persona persona, Model model){
        persona = personaService.encontrarPersona(persona);
        model.addAttribute("persona", persona);
        return "modificar";
    }

    @GetMapping("/eliminar")
    public String eliminar(Persona persona){
        personaService.eliminar(persona);
        return "redirect:/";
    }
    */
}
