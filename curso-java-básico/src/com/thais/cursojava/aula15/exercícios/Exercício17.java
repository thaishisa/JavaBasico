package com.thais.cursojava.aula15.exerc�cios;

import java.util.Scanner;

public class Exerc�cio17 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite o ano: ");
		int ano=scan.nextInt();
		
		if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
			System.out.println(ano + " � um ano Bissexto!");
		}
		else{
			System.out.println(ano + " n�o � um ano Bissexto!");
		}
	}
	
}