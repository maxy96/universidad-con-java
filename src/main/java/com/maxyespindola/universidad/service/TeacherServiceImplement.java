package com.maxyespindola.universidad.service;

import com.maxyespindola.universidad.dao.TeacherDAO;

import com.maxyespindola.universidad.domain.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TeacherServiceImplement implements TeacherService{
    @Autowired
    private TeacherDAO teacherDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Teacher> listarProfesores() {
        return (List<Teacher>) teacherDAO.findAll();
    }

    @Override
    @Transactional
    public void guardar(Teacher teacher) {
        teacherDAO.save(teacher);
    }

    @Override
    @Transactional
    public void eliminar(Teacher teacher) {
        teacherDAO.delete(teacher);
    }

    @Override
    @Transactional(readOnly = true)
    public Teacher encontrarPersona(Teacher teacher) {
        return teacherDAO.findById(teacher.getIdTeacher()).orElse(null);
    }


}
