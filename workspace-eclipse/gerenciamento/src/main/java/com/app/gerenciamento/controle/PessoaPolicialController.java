package com.app.gerenciamento.controle;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.gerenciamento.dto.PessoaPolicialDTO;
import com.app.gerenciamento.repository.PessoaPoliciaRepository;
import com.app.gerenciamento.service.PessoaPolicialService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor

public class PessoaPolicialController {
	
	private final PessoaPolicialService pessoaPolicialService;
	private final PessoaPoliciaRepository pessoaPolicialRepository;
	
	@GetMapping("/cadastro")
	public String cadatrarPolicia() {
		return "cadastro";
	}
	
	@PostMapping("/cadastrar")
	@Transactional
	public String cadastroPolicia(PessoaPolicialDTO dto) {
		pessoaPolicialService.cadastroPolicia(dto);
		
		return "listar";
		
		
	}
	
	@GetMapping("/listar")
	public ModelAndView listarTodos() {
		
		List <PessoaPolicialDTO> pessoaPolicialDTO = pessoaPolicialService.listarTodos();
		
		ModelAndView modelView = new ModelAndView("listar");		
		
		return modelView.addObject("pessoas", pessoaPolicialDTO);
	}
	
	@GetMapping("/listar/{id}")
	public String excluirPessoaPolicia(@PathVariable Long id) {
		pessoaPolicialService.excluir(id);
		
		return "/listar";
		
	}
	
	@GetMapping("/agendar/{id}")
	public ModelAndView listaId(@PathVariable Long id) {
		
		System.out.println("Pegou o ID = "+id);
		
		PessoaPolicialDTO pessoaPolicialDTO = pessoaPolicialService.listaID(id);
		
		String agendamento = "agendamento";
		
		ModelAndView modelView = new ModelAndView(agendamento);		
		
		return modelView.addObject("pessoas", pessoaPolicialDTO);
		
	}
	
	
	
	@GetMapping("/agendar")
	public String chamarPagina() {
		return "agendamento";
	}
	
	
	
	
}
