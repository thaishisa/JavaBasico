package com.thais.cursojava.aula17.exerc�cios;

import java.util.Scanner;

public class Exerc�cio29 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		int num=scan.nextInt();
	
		
		for (int i=1; i<=num;i++) {
			int k=0;
	
			for(int j=1;j<=i;j++) {
				if (i%j==0) {
					k++;
				}
				
			}
		if (k<=2) {
			System.out.println(i);
		}
			}
			
		}
		
		
	}
	

	