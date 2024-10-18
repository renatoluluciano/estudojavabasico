package br.com.appgerenciador.agendamentos.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.appgerenciador.agendamentos.modelo.AgendamentoModell;
import br.com.appgerenciador.agendamentos.service.AgendamentoServico;



@RestController
public class AgendamentoController {

    @Autowired
    private AgendamentoServico agendamentoServico;

    @PostMapping("/cadastrar")
    public ResponseEntity<?>cadastrar(@RequestBody AgendamentoModell agendamentoModell) {        
        
        return agendamentoServico.cadastrarAgendamento(agendamentoModell);
    }
    
    

    @GetMapping("/listar")
    public Iterable<AgendamentoModell> listar(){

        return agendamentoServico.listarAgendamentos();

    }


    @GetMapping("/")
    public String rotaTeste(){
        return "Testando Rota";
    }

   
}