package com.accenture.academico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.academico.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
	

}
