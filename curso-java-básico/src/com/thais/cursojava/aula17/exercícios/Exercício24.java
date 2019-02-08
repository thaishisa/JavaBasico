package com.thais.cursojava.aula17.exercícios;

import java.util.Scanner;

public class Exercício24 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite o valor do pão: ");
		double valorPao=scan.nextDouble();
		
		System.out.println("Preço do pão: "+valorPao);
		
		System.out.println("Loja Quase Dois - Tabela de Preços");
		
		
		for(int i=1; i<=50;i++) {
			
			double valor=valorPao*i;
			System.out.println(i+" - R$"+valor);
			
			
		}
		
	}

}
