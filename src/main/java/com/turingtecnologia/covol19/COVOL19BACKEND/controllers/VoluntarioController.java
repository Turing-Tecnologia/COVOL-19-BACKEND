package com.turingtecnologia.covol19.COVOL19BACKEND.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turingtecnologia.covol19.COVOL19BACKEND.models.Voluntario;
import com.turingtecnologia.covol19.COVOL19BACKEND.repository.VoluntarioRepository;

@RestController
@RequestMapping(value = "/voluntariarse")
public class VoluntarioController {

	
	@Autowired
	VoluntarioRepository repository;
	
	@PostMapping(value = "/voluntario")
	public Voluntario salvaVoluntario(@RequestBody Voluntario voluntario) {
		return repository.save(voluntario);
	}
	
	@PutMapping(value = "/voluntario")
	public Voluntario atualizaVoluntario(@RequestBody Voluntario voluntario) {
		return repository.save(voluntario);
	}
	
	
	@GetMapping(value = "/voluntarios")
	public List<Voluntario> getVoluntarios(){
		return repository.findAll();
	}
	
	@GetMapping(value = "/voluntarios/{cidade}")
	public List<Voluntario> listaVoluntariosPorCidade(@PathVariable(value = "cidade") String cidade){
		return repository.findByCidade(cidade);
	}
}
