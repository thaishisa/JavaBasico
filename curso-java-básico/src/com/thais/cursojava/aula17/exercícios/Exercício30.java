package com.thais.cursojava.aula17.exerc�cios;

import java.util.Scanner;

public class Exerc�cio30 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro que deseja fazer a tabuada: ");
		int num=scan.nextInt();
		
		System.out.println("Digite o n�mero que deseja iniciar a tabuada: ");
		int numInicial=scan.nextInt();
		
		System.out.println("Digite o n�mero que deseja finalizar a tabuada: ");
		int numFinal=scan.nextInt();
		
		while (numFinal<numInicial) {
			System.out.println("Valores inv�lidos digite novamente um n�mero final menor que o inicial");
			
			System.out.println("Digite o n�mero que deseja iniciar a tabuada: ");
			numInicial=scan.nextInt();
			
			System.out.println("Digite o n�mero que deseja finalizar a tabuada: ");
			numFinal=scan.nextInt();
		}
		
		System.out.println("Montar a tabuada de: "+num);
		System.out.println("Come�ar por: "+numInicial);
		System.out.println("Terminar em: "+numFinal);
		
		int tabuada=0;
		
		for (int i=numInicial; i<=numFinal;i++) {
			tabuada=num*i;
			System.out.println(+num+" X "+i+" = "+tabuada);
			}
			
		}
		
		
	}