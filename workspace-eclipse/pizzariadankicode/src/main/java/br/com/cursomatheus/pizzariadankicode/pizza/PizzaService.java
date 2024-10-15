package br.com.cursomatheus.pizzariadankicode.pizza;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PizzaService {
	
	private final PizzaRepository pizzaRepository;
	
	private final ModelMapper modelMapper;
	
	
	public PizzaDTO criarPizza(PizzaDTO dto) {
		Pizza pizza = modelMapper.map(dto, Pizza.class);
		
		pizzaRepository.save(pizza);
		
		return modelMapper.map(pizza, PizzaDTO.class);		
		
	}


	public List<PizzaDTO> buscarTodos() {
		
		return pizzaRepository.findAll().stream().map(p -> modelMapper.map(p, PizzaDTO.class)).
				collect(Collectors.toList());
	}


	public PizzaDTO buscarPorID(Long id) {
		Pizza pizza = pizzaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
		return modelMapper.map(pizza, PizzaDTO.class);
	}


	public PizzaDTO atualizarPorID(Long id, PizzaDTO dto) {
		Pizza pizza = modelMapper.map(dto, Pizza.class);
		pizza.setId(id);
		pizza = pizzaRepository.save(pizza);
		
		return modelMapper.map(pizza, PizzaDTO.class);
		
	}


	public void excluir(@NotNull Long id) {
		pizzaRepository.deleteById(id);
		
	}
	
	
	
	
	
		
		
		
	}
	
	
	
		
	


