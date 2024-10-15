package com.app.gerenciamento.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.gerenciamento.dto.AgendamentoDTO;
import com.app.gerenciamento.dto.PessoaPolicialDTO;
import com.app.gerenciamento.repository.AgendamentoRepository;
import com.app.gerenciamento.service.AgendamentoService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/")
@AllArgsConstructor
public class AgendamentoController {
	
	private final AgendamentoRepository agendamentoRepository;
	private final AgendamentoService agendamentoService;
	
	@PostMapping("/agendarfolga")
	public String agendarAfastamento(AgendamentoDTO dto) {
		
		System.out.println("Data no DTO:"+dto.getData_afastamento());
		agendamentoService.agendarFolga(dto);
		
		return "listar";
		
	}
	
	

}
