package br.com.FinTech.model;

import java.util.List;

import br.com.FinTech.Conta;

public class Cliente implements Conta {
	
	String nome;
	String email;
	String cpf;
	List<Conta> contas; // Lista de contas associadas ao cliente
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Cliente(String nome, String email, String cpf) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}
}
