package com.thais.cursojava.aula32;

public class Carro {
	
	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capCombustivel;
	private double conCombustivel;
	


	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumPassageiros() {
		return numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}

	public double getCapCombustivel() {
		return capCombustivel;
	}

	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}

	public double getConCombustivel() {
		return conCombustivel;
	}

	public void setConCombustivel(double conCombustivel) {
		this.conCombustivel = conCombustivel;
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



