package com.app.gerenciamento.dto;

import com.app.gerenciamento.model.Atribuicao;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PessoaPolicialDTO {
	
	 private Long idPolicia;	 
	 private String nome_policial;
	 private String nome_guerra;
	 private Long matricula;
	 private Atribuicao atribuicao;

}
