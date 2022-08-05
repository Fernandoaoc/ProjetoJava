package com.accenture.academico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.academico.exception.ResourceNotFoundException;
import com.accenture.academico.model.Agencia;
import com.accenture.academico.service.AgenciaService;

@RestController
public class AgenciaController {

    @Autowired
    private AgenciaService agenciaService;

    @GetMapping("/agencias")
    public ResponseEntity<Page<Agencia>> getAllAgencias(Pageable pageable) {
    	Page<Agencia> list = agenciaService.findAllAgencias(pageable);
        return ResponseEntity.ok(list);
    }

    @PostMapping("/agencias")
    public Agencia createAgencia(@Validated @RequestBody Agencia agencia) {
        return agenciaService.save(agencia);
    }

    @PutMapping("/agencias/{agenciaId}")
    public Agencia updateAgencia(@PathVariable Long agenciaId, @Validated @RequestBody Agencia agenciaRequest) {
        return agenciaService.findById(agenciaId).map(agencia -> {
        	agencia.setNomeAgencia(agenciaRequest.getNomeAgencia());
        	agencia.setNumeroAgencia(agencia.getNumeroAgencia());
           
            return agenciaService.save(agencia);
        }).orElseThrow(()-> new ResourceNotFoundException("AgenciaId " + agenciaId + "Não encontrada"));
    }

    @DeleteMapping("/agencias/{agenciaId}")
    public ResponseEntity<?> deleteAgencia(@PathVariable Long agenciaId) {
        return agenciaService.findById(agenciaId).map(agencia -> {
            agenciaService.delete(agenciaId);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("AgenciaId " + agenciaId + "Não encontrada"));
    }

}

