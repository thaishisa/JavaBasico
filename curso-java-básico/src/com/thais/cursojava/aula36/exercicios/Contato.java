package com.thais.cursojava.aula36.exercicios;

public class Contato {
	
	private String nome;
	private String telefone;
	private String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Contato() {
	
	}
	public Contato(String nome, String telefone, String email) {
		
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public String obterInfo() {
		return "Nome= "+ nome +";"+
				"Telefone= "+ telefone + ";"+
				"Email= "+ email ;
	}
	
	
	

}
