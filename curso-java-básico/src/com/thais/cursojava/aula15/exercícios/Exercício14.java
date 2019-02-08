package com.thais.cursojava.aula15.exercícios;

import java.util.Scanner;

public class Exercício14 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite a primeira nota parcial: ");
		double nota1= scan.nextDouble();
		
		System.out.println("Digite a segunda nota parcial: ");
		double nota2=scan.nextDouble();
		
		double media=(nota1+nota2)/2;
		
		if(media>=0 && media<4) {
			System.out.println("Sua primeira nota parcial foi: "+nota1);
			System.out.println("Sua segunda nota parcial foi: "+nota2);
			System.out.println("Sua média final foi: "+media);
			System.out.println("Seu conceito é: E");
			System.out.println("Você foi reprovado");
		}else if (media>=4 && media<6) {
			System.out.println("Sua primeira nota parcial foi: "+nota1);
			System.out.println("Sua segunda nota parcial foi: "+nota2);
			System.out.println("Sua média final foi: "+media);
			System.out.println("Seu conceito é: D");
			System.out.println("Você foi reprovado");
		}else if (media>=6 && media<7.5) {
			System.out.println("Sua primeira nota parcial foi: "+nota1);
			System.out.println("Sua segunda nota parcial foi: "+nota2);
			System.out.println("Sua média final foi: "+media);
			System.out.println("Seu conceito é: C");
			System.out.println("Você foi aprovado");
		}else if (media>=7.5 && media<9) {
			System.out.println("Sua primeira nota parcial foi: "+nota1);
			System.out.println("Sua segunda nota parcial foi: "+nota2);
			System.out.println("Sua média final foi: "+media);
			System.out.println("Seu conceito é: B");
			System.out.println("Você foi aprovado");
		}else if (media>=9 && media<=10) {
			System.out.println("Sua primeira nota parcial foi: "+nota1);
			System.out.println("Sua segunda nota parcial foi: "+nota2);
			System.out.println("Sua média final foi: "+media);
			System.out.println("Seu conceito é: A");
			System.out.println("Você foi aprovado");
		}
	}
	
}