package com.app.gerenciamento.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.gerenciamento.dto.PessoaPolicialDTO;
import com.app.gerenciamento.model.PessoaPolicial;
import com.app.gerenciamento.service.PessoaPolicialService;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor

public class PessoaPolicialController {
	
	private final PessoaPolicialService pessoaPolicialService;
	
	@GetMapping("/index")
	public String cadatrarPolicia() {
		return "cadastro";
	}
	
	@PostMapping("/cadastro")
	@Transactional
	public void cadastroPolicia(PessoaPolicialDTO dto) {
		pessoaPolicialService.cadastroPolicia(dto);

	}
}
