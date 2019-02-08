package com.thais.cursojava.aula35;

public class TesteCalculadora {

	public static void main(String[] args) {
		double fatorialNR=Calculadora.fatorialNaoRecursivo(5);
		System.out.println(fatorialNR);
		int fatorialR=Calculadora.fatorial(5);
		System.out.println(fatorialR);
	}

}
