package com.thais.cursojava.aula17.exerc�cios;

import java.util.Scanner;

public class Exerc�cio33 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Imprimindo os termos da s�ries: ");
		int num=scan.nextInt();
		
		
		double soma=0;
		double divis�o=0;
		System.out.print("S= ");
		
		for (int i=1,j=1;i<=num;i++,j+=2) {
			
			divis�o=i/j;
			soma=soma+divis�o;
			System.out.print(" "+i+"/"+j+" + ");
		}
		
		System.out.print(" = "+soma);

	}

}
