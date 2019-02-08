package com.thais.cursojava.aula17.exercícios;

import java.util.Scanner;

public class Exercício07 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int maior=Integer.MIN_VALUE;
		
		for(int i=0; i<5;i++) {
			System.out.println("Digite um número: ");
			int num=scan.nextInt();
		
			if (num>maior) {
				maior=num;
			}
			
		}
		System.out.println("O maior número foi: "+maior);
	}
}