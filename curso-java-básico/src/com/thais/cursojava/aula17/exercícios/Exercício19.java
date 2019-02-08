package com.thais.cursojava.aula17.exercícios;

import java.util.Scanner;

public class Exercício19 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Quantas notas deseja somar e obter a média? ");
		int quantidadeNotas=scan.nextInt();
		
		double soma=0;
		double media=0;
		
		for(int i=1; i<=quantidadeNotas;i++) {
			System.out.println("Digite a nota "+i+" : ");
			double nota=scan.nextDouble();
			
			soma=nota+soma;
			media= soma/quantidadeNotas;
			
			
		}
		System.out.println("A media final foi: "+media);
	}
	
}