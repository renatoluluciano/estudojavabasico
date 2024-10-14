package com.app.gerenciamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.gerenciamento.model.PessoaPolicial;


public interface PessoaPoliciaRepository extends JpaRepository<PessoaPolicial, Long>{

}
