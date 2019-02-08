package com.thais.cursojava.aula15.exercícios;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero= scan.nextInt();
		
		if (numero<0) {
			System.out.println("Esse número é negativo");
			
		}else {
			System.out.println("Esse número é positivo");
			
		}

	}

}