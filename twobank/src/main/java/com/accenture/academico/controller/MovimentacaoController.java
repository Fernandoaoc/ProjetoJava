package com.accenture.academico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.academico.model.Movimentacao;
import com.accenture.academico.service.MovimentacaoService;

@RestController
public class MovimentacaoController {

	//autowire the BooksService class  
	@Autowired 
	MovimentacaoService movimentacaoService;
	
	@GetMapping("/movimentacao")  
	private List<Movimentacao> getAllMovimentacao()   
	{  
	return movimentacaoService.getAllMovimentacao();  
	}
	
	//creating a get mapping that retrieves the detail of a specific student
	@GetMapping("/movimentacao/{id}")
	private Movimentacao getMovimentacao(@PathVariable("id") int id) 
	{
		return movimentacaoService.getMovimentacaoById(id);
	}
	
	//creating a delete mapping that deletes a specific student
	@DeleteMapping("/movimentacao/{id}")
	private void deleteMovimentacao(@PathVariable("id") int id) 
	{
		movimentacaoService.delete(id);
	}
	
	//creating post mapping that post the student detail in the database
	@PostMapping("/movimentacao")
	private int saveMovimentacao(@RequestBody Movimentacao movimentacao) 
	{
		movimentacaoService.saveOrUpdate(movimentacao);
		return movimentacao.getId();
	}
}
