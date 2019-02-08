package com.thais.cursojava.aula17.exercícios;

import java.util.Scanner;

public class Exercício10 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int maior=Integer.MIN_VALUE;
		int menor=Integer.MAX_VALUE;
		for (int i=0; i<2; i++) {
			System.out.println("Digite um número: ");
			int num1=scan.nextInt();
		
		if (maior<num1) {
			maior=num1;
			
				
		} 
		if (menor>num1) {
			menor=num1;
		}
		
		}
		
		
		for (int i=menor+1, j=maior;i<j;i++) {
			System.out.println("Valor de i: "+i);
			
			
		}
		
		
		
		

	}

}
