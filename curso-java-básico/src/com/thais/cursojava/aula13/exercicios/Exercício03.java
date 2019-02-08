package com.thais.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int primeiroNumero= scan.nextInt();
	    
		System.out.println("Digite o segundo número: ");
		int segundoNumero= scan.nextInt();
		
		int soma = primeiroNumero+ segundoNumero;
		System.out.println("A soma dos dois números é: "+soma);
		

	}

}
