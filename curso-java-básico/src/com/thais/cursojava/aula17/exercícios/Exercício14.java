package com.thais.cursojava.aula17.exerc�cios;

import java.util.Scanner;

public class Exerc�cio14 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int par=0;
		int impar=0;
		for(int i=0; i<10; i++) {
			System.out.println("Digite um numero: ");
			int num=scan.nextInt();
			
			if(num%2==0) {
				par++;
			}else {
				impar++;
			}
			
	}
		System.out.println("Tem "+par+" pares!");
		System.out.println("Tem "+impar+" �mpares !");
}
	
}
