package com.thais.cursojava.aula39;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private String telefoneCelular;
	//String nomeVisibilidade;//modificador default padrao--tem visibilidade dentro do mesmo pacote e mesmo diretorio
	//public String nomeVisibilidade;//modificador de acesso publico todo mundo consegue ver mesmo de fora do pacote
	//private String nomeVisibilidade;//visto somente dentro da classe;
	
	protected String nomeVisibilidade;
	
	
	public Pessoa() {
		
	}
	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
