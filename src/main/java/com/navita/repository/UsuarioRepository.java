package com.navita.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.navita.models.*;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Usuario findByEmail(String email);

}
