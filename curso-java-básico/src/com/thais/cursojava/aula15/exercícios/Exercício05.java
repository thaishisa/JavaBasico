package com.thais.cursojava.aula15.exercícios;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite a primeira nota parcial: ");
		double nota1= scan.nextDouble();
		
		System.out.println("Digite a segunda nota parcial: ");
		double nota2=scan.nextDouble();
		
		double media=(nota1+nota2)/2;
		
		if(media>=7 && media<10) {
			System.out.println("Aprovado");
		}else if (media<7) {
			System.out.println("Reprovado");
		}else if (media==10){
			System.out.println("Aprovado com distinção");
		}
		

	}

}
