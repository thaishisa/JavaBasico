package com.thais.cursojava.aula17.exercícios;

public class Exercício16 {

	public static void main(String[] args) {
		
		System.out.println("Sequência de Fibonacci");
		
		int termoAnterior=0;
		int termoAtual= 1;
		int soma=0;
		int i=2;
		System.out.println("Termo 1 Valor "+termoAtual);
		
		while(soma<=500) {
			soma=termoAnterior+termoAtual;
			System.out.println("Termo "+i+" Valor "+soma );
			termoAnterior=termoAtual;
			termoAtual=soma;
			i++;
		}
		

	}

}
