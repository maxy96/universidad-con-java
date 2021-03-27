package com.maxyespindola.universidad.service;

import com.maxyespindola.universidad.domain.Subject;

import java.util.List;

public interface MateriaService {
    public List<Subject> listarMaterias(String nombre);
}
