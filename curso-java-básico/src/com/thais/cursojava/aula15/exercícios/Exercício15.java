package com.thais.cursojava.aula15.exerc�cios;

import java.util.Scanner;

public class Exerc�cio15 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Insira o primeiro lado do tri�ngulo: ");
		double lado1= scan.nextDouble();
		
		System.out.println("Insira o segundo lado do tri�ngulo: ");
		double lado2= scan.nextDouble();
		
		System.out.println("Insira o terceiro lado do tri�ngulo: ");
		double lado3= scan.nextDouble();
		
		
		
		if( ((lado1+lado2)>lado3)&& ((lado1+lado3)>lado2)&&((lado2+lado3)>lado1) ) {
			if (lado1!=lado2 && lado1!=lado3 && lado3!=lado2) {
				System.out.println("Esses valores podem ser um tri�ngulo");
				System.out.println("Esse tri�ngulo � escaleno");
			}else if (lado1==lado2 && lado1==lado3) {
				System.out.println("Esses valores podem ser um tri�ngulo");
				System.out.println("Esse tri�ngulo � equil�tero");
			}else {
				System.out.println("Esses valores podem ser um tri�ngulo");
				System.out.println("Esse tri�ngulo � is�sceles");
			}
			
		}else {
			System.out.println("Esses valores n�o formam um tri�ngulo");
		}
		
	}
}