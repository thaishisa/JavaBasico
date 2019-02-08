package com.thais.cursojava.aula17.exercícios;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite a quantidade de habitantes da cidade A: ");
		double a=scan.nextDouble();
		
		System.out.println("Digite a quantidade de habitantes da cidade B: ");
		double b=scan.nextDouble();
		
		
		while(a>b) {
			System.out.println("Digite novamente a quantidade de habitantes em cada cidade ");
			
			System.out.println("Digite a quantidade de habitantes da cidade A: ");
			a=scan.nextDouble();
			
			System.out.println("Digite a quantidade de habitantes da cidade B: ");
			b=scan.nextDouble();

		}
		System.out.println("Digite a taxa de crescimento da cidade A: ");
		double taxaA=scan.nextDouble();
		
		System.out.println("Digite a taxa de crescimento da cidade B: ");
		double taxaB=scan.nextDouble();
		
		while (taxaB>taxaA) {
			System.out.println("Digite novamente a taxa de crescimento de cada cidade ");
			
			System.out.println("Digite a quantidade de habitantes da cidade A: ");
			taxaA=scan.nextDouble();
			
			System.out.println("Digite a quantidade de habitantes da cidade B: ");
			taxaB=scan.nextDouble();
	
		}
		
		int i=1;
		while ( a<b) {
			double anoA=(a*taxaA)/100;
			double anoB=(b*taxaB)/100;
			double habA= a+anoA;
			double habB= b+anoB;
			System.out.println("Quantidades de habitantes em A depois de "+i+" anos: "+habA+" na taxa "+taxaA);
			System.out.println("Quantidades de habitantes em B depois de "+i+" anos: "+habB+" na taxa "+taxaB);
			
			a=habA;
			b=habB;
			i++;
		}
		System.out.println("Ano final: "+i);
	}

}