package com.thais.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double primeiraNota= scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double segundaNota= scan.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		double terceiraNota= scan.nextDouble();
		
		System.out.println("Digite a quarta nota: ");
		double quartaNota= scan.nextDouble();
		
		double media = ((primeiraNota+segundaNota+terceiraNota+quartaNota)/4);
		System.out.println("A média de notas foi: "+media);
		

	}

}
