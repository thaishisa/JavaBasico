package com.thais.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exerc�cio06 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite o raio do c�rculo: ");
		double raio= scan.nextDouble();
		
		double area1=Math.PI * Math.pow(raio, 2);
		//double area= 3.1415*raio*raio;
		System.out.println("A �rea do c�rculo �: "+area1);

	}

}
