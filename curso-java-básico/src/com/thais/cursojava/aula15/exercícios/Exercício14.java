package com.thais.cursojava.aula15.exerc�cios;

import java.util.Scanner;

public class Exerc�cio14 {

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
			System.out.println("Sua m�dia final foi: "+media);
			System.out.println("Seu conceito �: E");
			System.out.println("Voc� foi reprovado");
		}else if (media>=4 && media<6) {
			System.out.println("Sua primeira nota parcial foi: "+nota1);
			System.out.println("Sua segunda nota parcial foi: "+nota2);
			System.out.println("Sua m�dia final foi: "+media);
			System.out.println("Seu conceito �: D");
			System.out.println("Voc� foi reprovado");
		}else if (media>=6 && media<7.5) {
			System.out.println("Sua primeira nota parcial foi: "+nota1);
			System.out.println("Sua segunda nota parcial foi: "+nota2);
			System.out.println("Sua m�dia final foi: "+media);
			System.out.println("Seu conceito �: C");
			System.out.println("Voc� foi aprovado");
		}else if (media>=7.5 && media<9) {
			System.out.println("Sua primeira nota parcial foi: "+nota1);
			System.out.println("Sua segunda nota parcial foi: "+nota2);
			System.out.println("Sua m�dia final foi: "+media);
			System.out.println("Seu conceito �: B");
			System.out.println("Voc� foi aprovado");
		}else if (media>=9 && media<=10) {
			System.out.println("Sua primeira nota parcial foi: "+nota1);
			System.out.println("Sua segunda nota parcial foi: "+nota2);
			System.out.println("Sua m�dia final foi: "+media);
			System.out.println("Seu conceito �: A");
			System.out.println("Voc� foi aprovado");
		}
	}
	
}