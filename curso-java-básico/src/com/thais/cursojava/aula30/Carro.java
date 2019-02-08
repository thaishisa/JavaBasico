package com.thais.cursojava.aula30;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double conCombustivel;

	public Carro() {
		
	}

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double conCombustivel) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.conCombustivel = conCombustivel;
	}

	
	public Carro(String marca, String modelo, int numPassageiros) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		
		System.out.println("Chamando construtor com 3 parametros");
	}

	public Carro(String marca, String modelo) {
		
		this(marca,modelo,10);
		System.out.println("Chamando construtor com 2 parametros");
	}

	void exibirAutonomia() { //nome de método sempre comeca com verbo
		System.out.println("A autonomia do carro é: "+capCombustivel*conCombustivel+" km");
	}
	
	double obterAutonomia() {
		
		System.out.println("Metodo autonomia foi chamado");
		return this.capCombustivel*this.conCombustivel;
	}
	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel= km/this.conCombustivel;
		
		return qtdCombustivel;
		
	}
}



