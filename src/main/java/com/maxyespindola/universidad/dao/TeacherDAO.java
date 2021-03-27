package com.maxyespindola.universidad.dao;

import com.maxyespindola.universidad.domain.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherDAO extends CrudRepository<Teacher, Long> {
}
