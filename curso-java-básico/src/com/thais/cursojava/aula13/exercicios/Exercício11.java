package com.thais.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercício11 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero1= scan.nextInt();
		
		System.out.println("Digite um número inteiro: ");
		int numero2= scan.nextInt();
		
		System.out.println("Digite um número real: ");
		double numero3= scan.nextDouble();
		
		double opcaoA= (numero1*2)*(numero2/2);
		double opcaoB= (numero1*3)+ numero3;
		double opcaoC= numero3*numero3*numero3;
		
		System.out.println("O dobro do primeiro vezes a metade do segundo: "+opcaoA);
		System.out.println("O triplo do primeiro mais o terceiro: "+opcaoB);
		System.out.println("O terceiro ao cubo: "+opcaoC);
		
		

	}

}
