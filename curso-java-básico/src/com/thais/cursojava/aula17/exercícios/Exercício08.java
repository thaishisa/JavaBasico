package com.thais.cursojava.aula17.exerc�cios;

import java.util.Scanner;

public class Exerc�cio08 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int soma=0;
		for(int i=0; i<5; i++) {
			System.out.println("Digite um numero: ");
			int num=scan.nextInt();
			
			soma=soma+num;
		}
		double media=soma/5;
       System.out.println(" A soma dos valores �: "+soma);
       System.out.println("A m�dia dos valores �: "+media);
	}

}
