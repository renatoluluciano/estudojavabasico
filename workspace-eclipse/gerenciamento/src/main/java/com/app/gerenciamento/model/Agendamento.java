package com.app.gerenciamento.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Agendamento {
	 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long idAgendamento;	
	 private Date dataInicio;
	 private Date dataFim;
	 private Long idPolcial;

}
