package com.app.gerenciamento.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.app.gerenciamento.dto.PessoaPolicialDTO;
import com.app.gerenciamento.model.PessoaPolicial;
import com.app.gerenciamento.repository.PessoaPoliciaRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PessoaPolicialService {
	
	private final PessoaPoliciaRepository pessoaPoliciaRepository;
	
	private final ModelMapper modelMapper;

	public PessoaPolicialDTO cadastroPolicia(PessoaPolicialDTO dto) {
				
		PessoaPolicial pessoaPolicial = modelMapper.
				map(dto, PessoaPolicial.class);
		
		pessoaPoliciaRepository.save(pessoaPolicial);
		
		return modelMapper.map(pessoaPolicial,
				PessoaPolicialDTO.class);
	}

	public List<PessoaPolicialDTO> listarTodos() {

		return pessoaPoliciaRepository.findAll().stream().map(p -> modelMapper.
				map(p, PessoaPolicialDTO.class)).collect(Collectors.toList());
	}

	public void excluir(Long id) {
		pessoaPoliciaRepository.deleteById(id);
		
	}

	public PessoaPolicialDTO listaID(Long id) {
		// TODO Auto-generated method stub
		  PessoaPolicial pessoaPolicial = pessoaPoliciaRepository.findById(id).
				 orElseThrow(() -> new EntityNotFoundException());
		  
		  return modelMapper.map(pessoaPolicial, PessoaPolicialDTO.class);
		 
	}

}
