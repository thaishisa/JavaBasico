package com.thais.cursojava.aula19.exercícios;

import java.util.Scanner;

public class Exercício17 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		
		int [] idade= new int[10];
		int j=0;
		
		for(int i=0;i<idade.length ;i++) {
			
			System.out.println("Digite a sua idade: ");
			idade[i]=scan.nextInt();
			
			if(idade[i]>35) {
				j++;
			}
		}
		System.out.println("A quantidade de pessoas com idade superior a 25 é: "+j);
	}

}
