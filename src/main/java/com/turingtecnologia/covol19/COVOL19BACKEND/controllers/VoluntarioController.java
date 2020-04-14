package com.turingtecnologia.covol19.COVOL19BACKEND.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turingtecnologia.covol19.COVOL19BACKEND.models.Voluntario;
import com.turingtecnologia.covol19.COVOL19BACKEND.repository.VoluntarioRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/voluntariarse")
@Api(value="API REST projeto COVOL-19")
@CrossOrigin(origins="*")
public class VoluntarioController {

	@Autowired
	VoluntarioRepository repository;
	@ApiOperation(value="Salva dados do Voluntário")
	@PostMapping(value = "/voluntario")
	public Voluntario salvaVoluntario(@RequestBody Voluntario voluntario) {
		return repository.save(voluntario);
	}
/*
	@ApiOperation(value="Salva dados do Voluntário")
	@PutMapping(value = "/voluntario")
	public Voluntario atualizaVoluntario(@RequestBody Voluntario voluntario) {
		return repository.save(voluntario);
	}*/
	@ApiOperation(value="Lista Voluntários")
	@GetMapping(value = "/voluntarios")
	public List<Voluntario> getVoluntarios() {
		return repository.findAll();
	}
	@ApiOperation(value="Lista Voluntários por localidade")
	@GetMapping(value = "/voluntarios/localidade/{localidade}")
	public List<Voluntario> listaVoluntariosPorCidade(@PathVariable(value = "localidade") String localidade) {
		return repository.findByLocalidadeLikeIgnoreCase(localidade);
	}

	@GetMapping(value = "/voluntarios/cep/{cep}")
	public List<Voluntario> listaVoluntariosPorCep(@PathVariable(value = "cep") String cep) {
		return repository.findByCepLikeIgnoreCase(cep);
	}

	@ApiOperation(value = "(NOVO) Encontra um voluntario pelo contato informado por ele e o remove da base de dados")
	@DeleteMapping(value = "/voluntario/contato/{contato}")
	public void removeVoluntarioPeloContato(@PathVariable (value = "contato") String contato) {
		repository.deleteByContato(contato);
	}

}
