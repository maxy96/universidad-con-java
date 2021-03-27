package com.maxyespindola.universidad.dao;

import com.maxyespindola.universidad.domain.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SubjectDAO extends JpaRepository<Subject, Long> {

    @Query("FROM #{#entityName} WHERE nombre LIKE %?1%")
    public List<Subject> findByMateria(String nom);
}
