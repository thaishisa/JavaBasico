package com.thais.cursojava.aula17.exerc�cios;

import java.util.Scanner;

public class Exerc�cio07 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int maior=Integer.MIN_VALUE;
		
		for(int i=0; i<5;i++) {
			System.out.println("Digite um n�mero: ");
			int num=scan.nextInt();
		
			if (num>maior) {
				maior=num;
			}
			
		}
		System.out.println("O maior n�mero foi: "+maior);
	}
}