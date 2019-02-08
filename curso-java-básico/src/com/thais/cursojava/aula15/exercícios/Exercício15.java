package com.thais.cursojava.aula15.exercícios;

import java.util.Scanner;

public class Exercício15 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Insira o primeiro lado do triângulo: ");
		double lado1= scan.nextDouble();
		
		System.out.println("Insira o segundo lado do triângulo: ");
		double lado2= scan.nextDouble();
		
		System.out.println("Insira o terceiro lado do triângulo: ");
		double lado3= scan.nextDouble();
		
		
		
		if( ((lado1+lado2)>lado3)&& ((lado1+lado3)>lado2)&&((lado2+lado3)>lado1) ) {
			if (lado1!=lado2 && lado1!=lado3 && lado3!=lado2) {
				System.out.println("Esses valores podem ser um triângulo");
				System.out.println("Esse triângulo é escaleno");
			}else if (lado1==lado2 && lado1==lado3) {
				System.out.println("Esses valores podem ser um triângulo");
				System.out.println("Esse triângulo é equilátero");
			}else {
				System.out.println("Esses valores podem ser um triângulo");
				System.out.println("Esse triângulo é isósceles");
			}
			
		}else {
			System.out.println("Esses valores não formam um triângulo");
		}
		
	}
}