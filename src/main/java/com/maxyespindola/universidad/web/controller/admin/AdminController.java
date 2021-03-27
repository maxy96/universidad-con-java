package com.maxyespindola.universidad.web.controller.admin;

import com.maxyespindola.universidad.domain.Teacher;
import com.maxyespindola.universidad.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/admin")
@Slf4j
public class AdminController {

    @GetMapping("")
    public String inicio(){
        return "admin/gestionar/index";
    }
    
    @GetMapping("/gestionar-materias")
    public String gestionarMaterias(){
        return "admin/gestionar/materias/index";
    }


}
