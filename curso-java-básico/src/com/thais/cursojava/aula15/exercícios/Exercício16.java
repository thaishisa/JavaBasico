package com.thais.cursojava.aula15.exercícios;

import java.util.Scanner;

public class Exercício16 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Insira o valor de A aqui: ");
		double a= scan.nextDouble();
		
		if(a==0) {
			
		}else {
			System.out.println("Insira o valor de B aqui: ");
			double b= scan.nextDouble();
			
			System.out.println("Insira o valor de C aqui: ");
			double c= scan.nextDouble();
			
			double delta= (Math.pow(b, 2))- (4*a*c);
			
			if (delta<0) {
				System.out.println("A equação não possui raízes reais");
			}else if (delta==0) {
			
				double raiz1= (-b+Math.sqrt(delta))/(2*a);
				System.out.println("A raiz dessa equação é: "+raiz1);
	
			}else {
				double raiz1= (-b+Math.sqrt(delta))/(2*a);
				System.out.println("A primeira raiz dessa equação é: "+raiz1);
				
				double raiz2= (-b-Math.sqrt(delta))/(2*a);
				System.out.println("A segunda raiz dessa equação é: "+raiz2);
			}
			
		}
		
	}
	
}
