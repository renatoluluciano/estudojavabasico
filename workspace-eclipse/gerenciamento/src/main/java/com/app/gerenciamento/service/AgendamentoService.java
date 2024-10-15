package com.app.gerenciamento.service;




import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.app.gerenciamento.dto.AgendamentoDTO;
import com.app.gerenciamento.model.Agendamento;
import com.app.gerenciamento.repository.AgendamentoRepository;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AgendamentoService {
	
	private final AgendamentoRepository agendamentoRepository;
	private final ModelMapper modellMapper;
	

	public AgendamentoDTO agendarFolga(AgendamentoDTO dto) {
		
		Agendamento agendamento = modellMapper.map(dto, Agendamento.class);
		
		
		
		agendamentoRepository.save(agendamento);
		
		return modellMapper.map(agendamento, AgendamentoDTO.class);
		
		
	}

}
