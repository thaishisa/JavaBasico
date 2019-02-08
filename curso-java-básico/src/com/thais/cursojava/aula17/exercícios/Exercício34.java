package com.thais.cursojava.aula17.exercícios;


import java.util.Scanner;

public class Exercício34 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Imprimindo os termos da séries: ");
		int num=scan.nextInt();
		
		
		double soma=0;
		double divisão=0;
		System.out.print("S= ");
		
		for (int i=1;i<=num;i++) {
			
			divisão=1/i;
			soma=soma+divisão;
			System.out.print(" 1/"+i+"+");
		}
		
		System.out.print(" = "+soma);

	}

}