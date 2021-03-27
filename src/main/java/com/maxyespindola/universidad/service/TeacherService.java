package com.maxyespindola.universidad.service;


import com.maxyespindola.universidad.domain.Teacher;

import java.util.List;

public interface TeacherService {

     public List<Teacher> listarProfesores();

    public void guardar(Teacher teacher);

    public void eliminar(Teacher teacher);

    public Teacher encontrarPersona(Teacher teacher);

}
