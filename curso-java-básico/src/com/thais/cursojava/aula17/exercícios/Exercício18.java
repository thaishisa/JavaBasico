package com.thais.cursojava.aula17.exerc�cios;

import java.util.Scanner;

public class Exerc�cio18 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		int num=scan.nextInt();
		int j=0;
		
		for(int i=1;i<=num;i++) {
			if (num%i==0) {
				j++;
			}
			
		}
			
			if(j>2) {
				System.out.println("Esse n�mero n�o � primo");
			}else {
				System.out.println("Esse n�mero � primo");
			}
			
		
		
	}
	
}