package com.thais.cursojava.aula31;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double conCombustivel;

	
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



