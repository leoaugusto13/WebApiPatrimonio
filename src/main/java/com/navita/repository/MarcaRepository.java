package com.navita.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.navita.models.*;

public interface MarcaRepository extends JpaRepository<Marca, Long>{

	Marca findById(long id);
}