package com.geranciadorfolga.demo.agendamento;

import javax.xml.crypto.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="agendamento")
public class Agendamento {
	
	private Long id_agendamento;
	
	private Data dataInicial;
	private Data dataFinal;
	

}
