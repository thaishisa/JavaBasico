package com.thais.cursojava.aula17.exercícios;

import java.util.Scanner;

public class Exercício12 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Deseja a tabuada de qual número? ");
		int num=scan.nextInt();
		
		
		while (num<1 || num>10) {
			System.out.println("Digite um número válido!");
			
			System.out.println("Deseja a tabuada de qual número? ");
			num=scan.nextInt();
		
		}
		System.out.println("Tabuada de "+num+" :");
		for(int i=1; i<=10;i++) {
			int multiplicacao=i*num;
			System.out.println(+num+" X "+i+" = "+multiplicacao);
		}
	}

}
