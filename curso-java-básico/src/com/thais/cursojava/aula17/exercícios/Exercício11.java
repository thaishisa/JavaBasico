package com.thais.cursojava.aula17.exercícios;

import java.util.Scanner;

public class Exercício11 {

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
		
		int soma=0;
		for (int i=menor+1, j=maior;i<j;i++) {
			System.out.println("Valor de i: "+i);
			
			soma=soma+i;
			
			
		}
		
		System.out.println("A soma desses valores é: "+soma);
		
		

	}

}