package com.accenture.academico.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Agencia implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAgencia;

    private Long numeroAgencia;

    private String nomeAgencia;

    private String endereco;

    public Long getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(Long idAgencia) {
        this.idAgencia = idAgencia;
    }

    public Long getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Long numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNomeSgencia() {
        return nomeAgencia;
    }

    public void setNomeSgencia(String nomeSgencia) {
        this.nomeAgencia = nomeSgencia;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "idAgencia=" + idAgencia +
                ", numeroAgencia=" + numeroAgencia +
                ", nomeSgencia='" + nomeAgencia + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
