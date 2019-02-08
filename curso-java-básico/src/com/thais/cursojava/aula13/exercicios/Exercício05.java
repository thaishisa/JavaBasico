package com.thais.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite quantos metros deseja converter: ");
		double metros= scan.nextDouble();
		
		double centimetros= metros*100;
		System.out.println("Em centímetros são: "+centimetros+"cm");
				

	}

}
