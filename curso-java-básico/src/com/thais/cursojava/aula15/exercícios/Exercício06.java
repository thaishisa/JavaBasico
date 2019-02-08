package com.thais.cursojava.aula15.exercícios;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite a primeiro número: ");
		int num1= scan.nextInt();
		
		System.out.println("Digite a segundoo número: ");
		int num2= scan.nextInt();
		
		System.out.println("Digite a terceiro número: ");
		int num3= scan.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("O primeiro número "+num1+" é o maior");
		}else if (num2>num1 && num2>num3) {
			System.out.println("O segundo número "+num2+" é o maior");
		}else {
			System.out.println("O terceiro número "+num3+" é o maior");
		}
		

	}

}