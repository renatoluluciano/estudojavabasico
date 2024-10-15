package br.com.cursomatheus.pizzariadankicode.pizza;



import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;


@Controller
@RequestMapping("/pizzas")
@AllArgsConstructor
public class PizzaController {
	
	private final PizzaService pizzaService;
	
	@PostMapping
	public void cadastrar(@RequestBody @Valid PizzaDTO dto) {
		pizzaService.criarPizza(dto);
		
	}
	
	@GetMapping
	public List<PizzaDTO> bucarTodos(){
		return pizzaService.buscarTodos();
		
	}
	
	@GetMapping("/{id}")
	public PizzaDTO bucarPorID(@PathVariable @NotNull Long id){
		return pizzaService.buscarPorID(id);
		
	}
	
	@PutMapping("/{id}")
	public PizzaDTO atualizarPorID(@PathVariable @NotNull Long id, @RequestBody @Valid PizzaDTO dto ){
		PizzaDTO pizzaAtualizada = pizzaService.atualizarPorID(id, dto);
		return pizzaAtualizada;
		
	}
	
	@DeleteMapping("/{id}")
	public void excluir(@PathVariable @NotNull Long id) {
		pizzaService.excluir(id);
		
	}
	
	@GetMapping("/cadastro")
	public String cadastro(){
		return "cadastro";
		
	}
	
	

}
