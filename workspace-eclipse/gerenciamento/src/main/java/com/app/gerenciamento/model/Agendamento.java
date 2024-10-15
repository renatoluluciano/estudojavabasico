package com.app.gerenciamento.model;



import java.util.Calendar;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

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
@Getter
@Setter
@Table(name="afastamentos")
@AllArgsConstructor

public class Agendamento {
	
	 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id_agendamento;
	 private Long id_policia;
	 @DateTimeFormat(pattern="dd/MM/yyyy")
	 private Date data_afastamento;	
	 @Enumerated(EnumType.STRING)
	 private Afastamento tipo_afastamento;
	 
	 public Agendamento() {}

}
