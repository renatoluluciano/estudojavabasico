package com.example.demo.ropository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {
	
	

}
