package com.thais.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exerc�cio12 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite a sua altura: ");
		double altura= scan.nextDouble();
		
		double pesoIdeal= (72.7*altura)-58;
		System.out.println("O seu peso ideal �: "+pesoIdeal);
		
	}

}
