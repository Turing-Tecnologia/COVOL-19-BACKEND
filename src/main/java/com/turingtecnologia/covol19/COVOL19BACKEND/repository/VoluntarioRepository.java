package com.turingtecnologia.covol19.COVOL19BACKEND.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.turingtecnologia.covol19.COVOL19BACKEND.models.Voluntario;

public interface VoluntarioRepository extends JpaRepository<Voluntario, Long>{
	
	List<Voluntario> findByLocalidadeLikeIgnoreCase(String localidade);
	
	List<Voluntario> findByCepLikeIgnoreCase(String cep);

}
