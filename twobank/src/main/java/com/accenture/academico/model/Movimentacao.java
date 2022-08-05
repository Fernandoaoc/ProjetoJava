package com.accenture.academico.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table
public class Movimentacao {

	@Id
	@Column
	private Long movimentacaoid;
	private DateTimeFormat datahoramovimento;
	private boolean operacao;
	private double valoroperacao;
	private Long conta_idconta;
	
	
    @ManyToOne   
    @JoinColumn(name = "idConta") 
    private ContaCorrente conta;
	
	public DateTimeFormat getDatahoramovimento() {
		return datahoramovimento;
	}
	public void setDatahoramovimento(DateTimeFormat datahoramovimento) {
		this.datahoramovimento = datahoramovimento;
	}
	public boolean isOperacao() {
		return operacao;
	}
	public void setOperacao(boolean operacao) {
		this.operacao = operacao;
	}
	public double getValoroperacao() {
		return valoroperacao;
	}
	public void setValoroperacao(double valoroperacao) {
		this.valoroperacao = valoroperacao;
	}
	public int getConta_idconta() {
		return conta_idconta;
	}
	public void setConta_idconta(Long conta_idconta) {
		this.conta_idconta = conta_idconta;
	}
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
}

