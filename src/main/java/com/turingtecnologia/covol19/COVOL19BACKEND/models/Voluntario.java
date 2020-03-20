package com.turingtecnologia.covol19.COVOL19BACKEND.models;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_voluntarios")
public class Voluntario implements Serializable {

	public static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_voluntario;
	
	private String nome;
	private String cidade;
	private String bairro;
	private String contato;
	public long getId_voluntario() {
		return id_voluntario;
	}
	public void setId_voluntario(long id_voluntario) {
		this.id_voluntario = id_voluntario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	
}
