package com.navita.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.navita.models.*;

public interface PatrimonioRepository extends JpaRepository<Patrimonio, Long>{

	Patrimonio findById(long id);
}
