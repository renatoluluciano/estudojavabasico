package com.example.demo.model;

import java.io.Serializable;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;


@Entity
public class Convidado implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	
	private Long id;
	
	private String nome;
	
	private Integer quantidadeAcompanhante;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadeAcompanhante() {
		return quantidadeAcompanhante;
	}

	public void setQuantidadeAcompanhante(Integer quantidadeAcompanhante) {
		this.quantidadeAcompanhante = quantidadeAcompanhante;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
