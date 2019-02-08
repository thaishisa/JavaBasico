package com.thais.cursojava.aula25;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double conCombustivel;
	
	void exibirAutonomia() { //nome de método sempre comeca com verbo
		System.out.println("A autonomia do carro é: "+capCombustivel*conCombustivel+" km");
	}
}



