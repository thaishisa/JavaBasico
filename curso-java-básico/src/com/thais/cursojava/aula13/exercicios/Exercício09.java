package com.thais.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercício09 {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Farenheits: ");
		int tempFarenheit=scan.nextInt();
		
		double conversaoCelcius= (5*(tempFarenheit- 32)/9);
		System.out.println("A temperatura em Celsius é: "+ conversaoCelcius);
	
	}

}
