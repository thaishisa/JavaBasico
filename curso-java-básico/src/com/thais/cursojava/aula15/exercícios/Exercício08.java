package com.thais.cursojava.aula15.exerc�cios;

import java.util.Scanner;

public class Exerc�cio08 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro produto: ");
		double produto1= scan.nextDouble();
		
		System.out.println("Digite o valor do segundo produto: ");
		double produto2= scan.nextDouble();
		
		System.out.println("Digite o valor do terceiro produto: ");
		double produto3= scan.nextDouble();
		
		if(produto1<produto2 && produto1<produto3) {
			System.out.println("O primeiro produto "+produto1+" � o mais barato");
		}else if (produto2<produto1 && produto2<produto3) {
			System.out.println("O segundo produto "+produto2+" � o mais barato");
		}else {
			System.out.println("O terceiro produto "+produto3+" � o mais barato");
		}
		

	}

}