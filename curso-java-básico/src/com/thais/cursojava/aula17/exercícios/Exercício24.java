package com.thais.cursojava.aula17.exerc�cios;

import java.util.Scanner;

public class Exerc�cio24 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite o valor do p�o: ");
		double valorPao=scan.nextDouble();
		
		System.out.println("Pre�o do p�o: "+valorPao);
		
		System.out.println("Loja Quase Dois - Tabela de Pre�os");
		
		
		for(int i=1; i<=50;i++) {
			
			double valor=valorPao*i;
			System.out.println(i+" - R$"+valor);
			
			
		}
		
	}

}
