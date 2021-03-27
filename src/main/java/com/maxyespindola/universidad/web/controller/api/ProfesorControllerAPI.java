package com.maxyespindola.universidad.web.controller.api;

import com.maxyespindola.universidad.domain.Teacher;
import com.maxyespindola.universidad.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@RestController
@RequestMapping("/api/profesores")
public class ProfesorControllerAPI {
    
    @Autowired
    private TeacherService teacherService;
    
    @GetMapping("")
    public List<Teacher> index(){
        return teacherService.listarProfesores();
    }
    
}
