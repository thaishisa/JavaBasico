package com.thais.cursojava.aula15.exerc�cios;

import java.util.Scanner;

public class Exerc�cio02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero= scan.nextInt();
		
		if (numero<0) {
			System.out.println("Esse n�mero � negativo");
			
		}else {
			System.out.println("Esse n�mero � positivo");
			
		}

	}

}