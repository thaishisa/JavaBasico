package com.thais.cursojava.aula17.exercícios;

import java.util.Scanner;

public class Exercício15 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Quantos termos terá a sua série? ");
		int termos=scan.nextInt();
		
		int termoAnterior=0;
		int termoAtual= 1;
		
		System.out.println("Termo 1 Valor "+termoAtual);
		
		for(int i=2; i<=termos; i++) {
		
			int soma=termoAnterior+termoAtual;
			System.out.println("Termo "+i+" Valor "+soma );
			termoAnterior=termoAtual;
			termoAtual=soma;
						
			
		}
		
	}
	
}