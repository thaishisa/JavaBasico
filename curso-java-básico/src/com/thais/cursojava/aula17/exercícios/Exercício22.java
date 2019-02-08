package com.thais.cursojava.aula17.exercícios;

import java.util.Scanner;

public class Exercício22 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Qual a quantidade de CDs na sua coleção? ");
		int quantidadeCd=scan.nextInt();
		
		double soma=0;
		double media=0;
		double valorCd;
		
		for (int i=1; i<=quantidadeCd; i++) {
			System.out.println("Quanto você pagou no CD "+i+" ?");
			valorCd=scan.nextDouble();
			
			soma=soma+valorCd;
			media=soma/quantidadeCd;
			
				
		}
		
		System.out.println("O valor total gasto foi: "+soma);
		System.out.println("A media de valor para cada CD foi: "+media);
		
	}
	
}