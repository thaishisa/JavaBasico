package com.thais.cursojava.aula17.exerc�cios;

import java.util.Scanner;

public class Exerc�cio27 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite quantas temperaturas deseja inserir: ");
		int numTemp=scan.nextInt();
		
		double maior=Double.MIN_VALUE;
		double menor=Double.MAX_VALUE;
		double soma=0;
		double media=0;
		
		for(int i=1;i<=numTemp;i++) {
			System.out.println("Digite a temperatura "+i+":");
			double temperatura=scan.nextDouble();
			
			if(temperatura>maior) {
				maior=temperatura;
			}
			if (temperatura <menor) {
				menor=temperatura;
			}
			soma=soma+temperatura;
			media= soma/numTemp;
			
		}
		System.out.println("A maior �: "+maior);
		System.out.println("A menor �:  "+menor);
		System.out.println("A media �: "+media);
	}
	
}