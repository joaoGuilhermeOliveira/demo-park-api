package com.mbalem.demoparkapi.repository;

import com.mbalem.demoparkapi.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}