package com.thais.cursojava.aula43.exercicios;

public abstract class Contribuinte {
	//abstract porque nao se cria de fato um contribuinte
	private String nome;
	private double rendaBruta;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	@Override
	public String toString() {
		return "Contribuinte: \nNome: " + nome + " \nRenda Bruta: " + rendaBruta;
	}
	
	public abstract double calcularImposto();//pra forçar as classes PF e PJ a sobrescrever o metodo 
	
	

}
