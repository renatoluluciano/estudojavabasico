package com.app.gerenciamento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pessoapolicial")
@Getter
@Setter
@AllArgsConstructor
public class PessoaPolicial {
	
	 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long idPolicia;	 
	 private String nome_policial;
	 private String nome_guerra;
	 private Long matricula;
	 @Enumerated(EnumType.STRING)
	 private Atribuicao atribuicao;
	 
	 public PessoaPolicial() {}
}
