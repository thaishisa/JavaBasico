package com.thais.cursojava.aula17.exerc�cios;

import java.util.Scanner;

public class Exerc�cio31 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("O funcion�rio foi contratado em 1995");
		System.out.println("O funcion�rio ainda trabalha no local em 2018");
		System.out.println("O funcion�rio tem um sal�rio de R$1000,00");
		int anoInicial=1996;
		int anoFinal=2018;
		double percentual=1.5;
		double salarioAntigo =1000;
		double salarioRenovado = 0;
		System.out.println("Em 1995 ele ganhou R$1000,00");
		
		for(int i=anoInicial; i<=anoFinal;i++) {
			double descontoPercentual= (salarioAntigo*percentual)/100;
			salarioRenovado= salarioAntigo+descontoPercentual;
			
			System.out.println("Em "+i+" ele ganhou R$"+salarioRenovado+" e o percentual foi: "+percentual);
			
			salarioAntigo=salarioRenovado;
			percentual=percentual*2;
			
			
		}
		
		 /*percentual=1.5;
		 salarioAntigo =1000;
		
		for(int i=anoInicial; i<=anoFinal;i++) {
			double descontoPercentual= (salarioAntigo*percentual)/100;
			salarioRenovado= salarioAntigo+descontoPercentual;
			
			System.out.println("\n Em "+i+" ele ganhou R$"+salarioRenovado+" e o percentual foi: "+percentual);
			
			percentual=percentual*2;
			
			
		}*/
		
		System.out.println("\n O funcion�rio foi contratado em 1995");
		System.out.println("O funcion�rio ainda trabalha no local em 2018");
		System.out.println("Digite quanto era o sal�rio inicial do funcion�rio: ");
		salarioAntigo =scan.nextDouble();

		percentual=1.5;
		
		System.out.println("Em 1995 ele ganhou R$"+salarioAntigo);
		
		for(int i=anoInicial; i<=anoFinal;i++) {
			double descontoPercentual= (salarioAntigo*percentual)/100;
			salarioRenovado= salarioAntigo+descontoPercentual;
			
			System.out.println("Em "+i+" ele ganhou R$"+salarioRenovado+" e o percentual foi: "+percentual);
			
			percentual=percentual*2;
			
			
		}
		

	}

}
