package com.thais.cursojava.aula17.exercícios;

import java.util.Scanner;

public class Exercício26 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite um número que deseja fazer fatoração: " );
		int num=scan.nextInt();
		System.out.print(num+"! = "+num+".");
		
		int fatorial=0;
		
		for(int i=num-1;i>0;i--) {
			fatorial=num*i;
			num=fatorial;
			System.out.print(i+".");
			
		}
		
		System.out.println("="+fatorial);
	}
	
}