package com.gerenciadorfolga.demo.policial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gerenciador")
public class PolicialController {
	
	@GetMapping("/cadastro")
	public String cadastrarPolicial() {
		return "cadastro";
	}

}
