package br.com.appgerenciador.agendamentos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.appgerenciador.agendamentos.modelo.AgendamentoModell;
import br.com.appgerenciador.agendamentos.modelo.RespostaModelo;
import br.com.appgerenciador.agendamentos.repository.AgendamentoRepository;

@Service
public class AgendamentoServico {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    @Autowired
    private RespostaModelo respostaModelo;


    public Iterable<AgendamentoModell> listarAgendamentos(){

        return agendamentoRepository.findAll();
    }

    
public ResponseEntity<?> cadastrarAgendamento(AgendamentoModell agendamentoModell){
    if(agendamentoModell.getNomePolicial().equals("")){
        
        respostaModelo.nomeVazio();
        return new ResponseEntity<RespostaModelo>(respostaModelo, HttpStatus.BAD_REQUEST);
    }else if(agendamentoModell.getDataInicio().equals("")){
        respostaModelo.dataInicioVazio();
        return new ResponseEntity<RespostaModelo>(respostaModelo, HttpStatus.BAD_REQUEST);
    }else if(agendamentoModell.getDataFinal().equals("")){
        respostaModelo.dataFinalVazio();
        return new ResponseEntity<RespostaModelo>(respostaModelo, HttpStatus.BAD_REQUEST);
     }else if(agendamentoModell.getTipoAfastamento().equals("")){
        respostaModelo.tipoAfastamentoVazio();
        return new ResponseEntity<RespostaModelo>(respostaModelo, HttpStatus.BAD_REQUEST);
     }else{
        return new ResponseEntity<AgendamentoModell>(agendamentoRepository.save(agendamentoModell), HttpStatus.CREATED);
     }
    }
}
