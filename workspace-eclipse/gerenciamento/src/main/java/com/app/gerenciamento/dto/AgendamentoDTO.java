package com.app.gerenciamento.dto;



import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.app.gerenciamento.model.Afastamento;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class AgendamentoDTO {
	
	 private Long id_agendamento;
	 private Long id_policia;
	 private String data_afastamento;
	 private Afastamento tipo_afastamento;

}
