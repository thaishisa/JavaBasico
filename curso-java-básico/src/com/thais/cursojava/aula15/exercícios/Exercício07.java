package com.thais.cursojava.aula15.exerc�cios;

import java.util.Scanner;

public class Exerc�cio07 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite a primeiro n�mero: ");
		int num1= scan.nextInt();
		
		System.out.println("Digite a segundoo n�mero: ");
		int num2= scan.nextInt();
		
		System.out.println("Digite a terceiro n�mero: ");
		int num3= scan.nextInt();
		
		if((num1>num2 && num1>num3)&& (num2<num3)) {
			System.out.println("O primeiro n�mero "+num1+" � o maior e o segundo "+num2+" � o menor");
		}else if ((num1>num2 && num1>num3)&& (num2>num3)) {
			System.out.println("O primeiro n�mero "+num1+" � o maior e o terceiro "+num3+" � o menor");
		}else if ((num2>num1 && num2>num3)&& (num1<num3)) {
			System.out.println("O segundo n�mero "+num2+" � o maior e o primeiro "+num1+" � o menor");
		}else if ((num2>num1 && num2>num3)&& (num1>num3)) {
			System.out.println("O segundo n�mero "+num2+" � o maior e o terceiro "+num3+" � o menor");
		}else if ((num3>num1 && num3>num2)&& (num1<num2)) {
			System.out.println("O terceiro n�mero "+num3+" � o maior e o primeiro "+num1+" � o menor");
		}else {
			System.out.println("O terceiro n�mero "+num3+" � o maior e o segundo "+num2+" � o menor");
		}
		
	}
	
}
		
