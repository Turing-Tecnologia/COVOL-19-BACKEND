package com.turingtecnologia.covol19.COVOL19BACKEND.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.turingtecnologia.covol19.COVOL19BACKEND.models.Voluntario;

public interface VoluntarioRepository extends JpaRepository<Voluntario, Long>{
	
	//@Query(value = "select * from tb_voluntarios where cidade = :cidade ", nativeQuery = true)
	List<Voluntario> findByCidadeLikeIgnoreCase(String cidade);

}
