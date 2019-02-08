package com.thais.cursojava.aula17.exercícios;

import java.util.Scanner;

public class Exercício13 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Insira um numero de base ");
		int base=scan.nextInt();

		System.out.println("Insira um numero de expoente ");
		int expoente=scan.nextInt();
		
		int inicio=1;
		
		for(int i=0; i<expoente; i++) {
			int calculo=base*inicio;
			
			inicio=calculo;
			
		}
		
		System.out.println("O valor da base elevado ao expoente é: "+inicio);
	}
	
}