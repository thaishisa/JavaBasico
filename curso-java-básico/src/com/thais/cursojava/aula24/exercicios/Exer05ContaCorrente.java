package com.thais.cursojava.aula24.exercicios;

public class Exer05ContaCorrente {
	
	public static void main(String [] args) {
		
		ContaCorrente conta= new ContaCorrente();
		
		conta.numeroConta="4545";
		conta.saldoConta=-122;
		conta.limiteConta= 1000.00;
		
		System.out.println(conta.saldoConta);
	}

}
