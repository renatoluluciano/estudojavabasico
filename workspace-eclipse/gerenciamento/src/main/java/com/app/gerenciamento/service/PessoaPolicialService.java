package com.app.gerenciamento.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.app.gerenciamento.dto.PessoaPolicialDTO;
import com.app.gerenciamento.model.PessoaPolicial;
import com.app.gerenciamento.repository.PessoaPoliciaRepository;


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

}
