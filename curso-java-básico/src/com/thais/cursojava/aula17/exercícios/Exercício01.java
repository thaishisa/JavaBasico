package com.thais.cursojava.aula17.exerc�cios;

import java.util.Scanner;

public class Exerc�cio01 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Insira uma nota entre 0 e 10: ");
		double nota= scan.nextDouble();
		
		while(nota<0 || nota> 10) {
			System.out.println("Valor inv�lido, digite uma nova nota!");
			System.out.println("Insira uma nota entre 0 e 10: ");
			nota= scan.nextDouble();
				
			
		}
				
		System.out.println("A nota digitada foi: "+nota);

	}

}
