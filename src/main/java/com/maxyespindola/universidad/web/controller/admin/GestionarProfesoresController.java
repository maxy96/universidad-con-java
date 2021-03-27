package com.maxyespindola.universidad.web.controller.admin;

import com.maxyespindola.universidad.domain.Teacher;
import com.maxyespindola.universidad.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/admin/gestionar/profesores")
public class GestionarProfesoresController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("")
    public String inicio(){
        return "admin/gestionar/profesores/index";
    }
    
    /**
     * Mostrar formulario para agregar profesor
     */
    @GetMapping("/agregar")
    public String agregarProfesor(Teacher teacher){

        return "admin/gestionar/profesores/modificar";
    }

    @PostMapping("/guardar")
    public String guardarProfesor(@Valid Teacher teacher, Errors errores){
        if(errores.hasErrors()){
            return "admin/gestionar/profesores/modificar";
        }
        teacherService.guardar(teacher);
        return "redirect:/";
    }
}
