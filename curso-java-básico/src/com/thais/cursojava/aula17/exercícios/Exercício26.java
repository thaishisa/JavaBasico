package com.thais.cursojava.aula17.exerc�cios;

import java.util.Scanner;

public class Exerc�cio26 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite um n�mero que deseja fazer fatora��o: " );
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