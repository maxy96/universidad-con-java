package com.maxyespindola.universidad.service;

import com.maxyespindola.universidad.dao.SubjectDAO;
import com.maxyespindola.universidad.domain.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MateriaServiceImplement implements MateriaService{

    @Autowired
    private SubjectDAO subjectDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Subject> listarMaterias(String nombre) {
        return (List<Subject>) subjectDAO.findByMateria(nombre);
    }
}
