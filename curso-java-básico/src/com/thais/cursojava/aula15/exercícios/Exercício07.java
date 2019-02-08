package com.thais.cursojava.aula15.exercícios;

import java.util.Scanner;

public class Exercício07 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite a primeiro número: ");
		int num1= scan.nextInt();
		
		System.out.println("Digite a segundoo número: ");
		int num2= scan.nextInt();
		
		System.out.println("Digite a terceiro número: ");
		int num3= scan.nextInt();
		
		if((num1>num2 && num1>num3)&& (num2<num3)) {
			System.out.println("O primeiro número "+num1+" é o maior e o segundo "+num2+" é o menor");
		}else if ((num1>num2 && num1>num3)&& (num2>num3)) {
			System.out.println("O primeiro número "+num1+" é o maior e o terceiro "+num3+" é o menor");
		}else if ((num2>num1 && num2>num3)&& (num1<num3)) {
			System.out.println("O segundo número "+num2+" é o maior e o primeiro "+num1+" é o menor");
		}else if ((num2>num1 && num2>num3)&& (num1>num3)) {
			System.out.println("O segundo número "+num2+" é o maior e o terceiro "+num3+" é o menor");
		}else if ((num3>num1 && num3>num2)&& (num1<num2)) {
			System.out.println("O terceiro número "+num3+" é o maior e o primeiro "+num1+" é o menor");
		}else {
			System.out.println("O terceiro número "+num3+" é o maior e o segundo "+num2+" é o menor");
		}
		
	}
	
}
		
