package com.thais.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite o raio do círculo: ");
		double raio= scan.nextDouble();
		
		double area1=Math.PI * Math.pow(raio, 2);
		//double area= 3.1415*raio*raio;
		System.out.println("A área do círculo é: "+area1);

	}

}
