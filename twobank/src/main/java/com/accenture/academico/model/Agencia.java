package com.accenture.academico.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.io.Serializable;
import java.util.Set;

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
    
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Cliente> clientes;

    public void setIdAgencia(Long idAgencia) {
        this.idAgencia = idAgencia;
    }

    public Long getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Long numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "idAgencia=" + idAgencia +
                ", numeroAgencia=" + numeroAgencia +
                ", nomeAgencia='" + nomeAgencia + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
