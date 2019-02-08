package com.thais.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercício10 {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celcius: ");
		int tempCelcius=scan.nextInt();
		
		double conversaoFarenheit= (9*tempCelcius/5+ 32);
		System.out.println("A temperatura em Farenheits é: "+ conversaoFarenheit);
	
	}

}