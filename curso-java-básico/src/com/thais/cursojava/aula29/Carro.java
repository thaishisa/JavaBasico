package com.thais.cursojava.aula29;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double conCombustivel;
	
	Carro(){
		System.out.println("A classe carro foi instanciada");
		numPassageiros=4;
	}
	
	Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double conCombustivel_){
		marca=marca_;
		modelo=modelo_;
		numPassageiros=numPassageiros_;
		capCombustivel=capCombustivel_;
		conCombustivel=conCombustivel_;
		
	}
	
	public Carro(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	void exibirAutonomia() { //nome de método sempre comeca com verbo
		System.out.println("A autonomia do carro é: "+capCombustivel*conCombustivel+" km");
	}
	
	double obterAutonomia() {
		
		System.out.println("Metodo autonomia foi chamado");
		return capCombustivel*conCombustivel;
	}
	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel= km/conCombustivel;
		
		return qtdCombustivel;
		
	}
}



