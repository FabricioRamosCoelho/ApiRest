package com.serviços.apirest.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_CONSULTAS")
public class Consultas implements Serializable {
	
	private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nome;
	private BigDecimal cpf;
	private BigDecimal cnpj;
	private BigDecimal salario;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getCpf() {
		return cpf;
	}
	public void setCpf(BigDecimal cpf) {
		this.cpf = cpf;
	}
	public BigDecimal getCnpj() {
		return cnpj;
	}
	public void setCnpj(BigDecimal cnpj) {
		this.cnpj = cnpj;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
}
