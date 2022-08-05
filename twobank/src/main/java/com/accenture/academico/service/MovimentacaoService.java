package com.accenture.academico.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.academico.model.Movimentacao;
import com.accenture.academico.repository.MovimentacaoRepository;


@Service
public class MovimentacaoService {
	
	@Autowired
	
	MovimentacaoRepository movimentacaoRepository;
	public List<Movimentacao> getAllMovimentacao() {
		List<Movimentacao> movimentacoes = new ArrayList<Movimentacao>();
		movimentacaoRepository.findAll().forEach(movimentacao -> movimentacoes.add(movimentacao));
		return movimentacoes;
	}

	public Movimentacao getMovimentacaoById(int id) {
		// TODO Auto-generated method stub
		return movimentacaoRepository.findById((long) id).get();
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		movimentacaoRepository.deleteById((long) id);
		
	}

	public void saveOrUpdate(Movimentacao movimentacao) {
		// TODO Auto-generated method stub
		movimentacaoRepository.save(movimentacao);
		
	}

}
