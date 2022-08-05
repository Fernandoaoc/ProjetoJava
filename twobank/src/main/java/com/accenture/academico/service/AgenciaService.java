package com.accenture.academico.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.accenture.academico.model.Agencia;
import com.accenture.academico.repository.AgenciaRepository;

@Service
public class AgenciaService {
	private AgenciaRepository agenciaRepository;
	
	public Page<Agencia> findAllAgencias(Pageable pageable) {
        return agenciaRepository.findAll(pageable);
    }
	
	public Optional<Agencia> findById(Long id){
		return agenciaRepository.findById(id);
	}
	
	 public Agencia save(Agencia agencia) {
	        return agenciaRepository.save(agencia);
	    }
	 public Agencia update(Agencia agencia) {
	        return agenciaRepository.save(agencia);
	    }
	 public boolean delete(Long id) {
		 if(agenciaRepository.findById(id).isPresent()) {
			 agenciaRepository.deleteById(id);
			 return true;
		 }
	     return false;
	    }
}
