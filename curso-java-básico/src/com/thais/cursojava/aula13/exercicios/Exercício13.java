package com.thais.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exerc�cio13 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite o quanto voc� ganha por hora: ");
		double salarioHora= scan.nextDouble();
		
		System.out.println("Digite quantas horas voc� trabalhou no m�s: ");
		int horasTrabalhadas= scan.nextInt();
		
	    double salarioMes= salarioHora*horasTrabalhadas;
	    System.out.println("O seu sal�rio mensal bruto foi: "+salarioMes);
	    
	    double inss= (salarioMes*8)/100;
	    System.out.println("O valor do INSS foi: "+inss);
	    
	    double sindicato= (salarioMes*5)/100;
	    System.out.println("O valor do sindicato foi: "+sindicato);
	    
	    double impostoRenda= (salarioMes*11)/100;
	    double salarioLiquido= salarioMes-inss-sindicato-impostoRenda;
	    System.out.println("O seu sal�rio mensal liquido foi: "+salarioLiquido);

	}

}