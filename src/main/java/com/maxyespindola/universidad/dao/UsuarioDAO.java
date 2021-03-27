package com.maxyespindola.universidad.dao;

import com.maxyespindola.universidad.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDAO extends JpaRepository<Usuario, Long> {
    public Usuario findByUsername(String username);
}
