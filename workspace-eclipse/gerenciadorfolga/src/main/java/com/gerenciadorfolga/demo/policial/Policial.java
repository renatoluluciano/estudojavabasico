package com.gerenciadorfolga.demo.policial;

import javax.xml.crypto.Data;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Entity 
@Table(name = "Policial")
@Getter
@Setter
@EqualsAndHashCode
public class Policial {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Policial;
	private String nomeCompleto;
	private String nomeGuerra;
	private String atribuicao;
	private Data dataAfastamento;

}
