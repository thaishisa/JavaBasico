package com.thais.cursojava.aula35.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Digite ate qual numero deseja somar: ");
		int num=scan.nextInt();
		
		int somatorio=gerarSomatorio(num);
		System.out.println("O somatorio de 1 a "+num+" e: "+somatorio);

	}
	
	public static int gerarSomatorio(int n) {
		
		if(n==1) {
			return 1;
		}
		return n+gerarSomatorio(n-1);
	}

}
