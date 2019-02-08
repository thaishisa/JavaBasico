package com.thais.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercício13 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite o quanto você ganha por hora: ");
		double salarioHora= scan.nextDouble();
		
		System.out.println("Digite quantas horas você trabalhou no mês: ");
		int horasTrabalhadas= scan.nextInt();
		
	    double salarioMes= salarioHora*horasTrabalhadas;
	    System.out.println("O seu salário mensal bruto foi: "+salarioMes);
	    
	    double inss= (salarioMes*8)/100;
	    System.out.println("O valor do INSS foi: "+inss);
	    
	    double sindicato= (salarioMes*5)/100;
	    System.out.println("O valor do sindicato foi: "+sindicato);
	    
	    double impostoRenda= (salarioMes*11)/100;
	    double salarioLiquido= salarioMes-inss-sindicato-impostoRenda;
	    System.out.println("O seu salário mensal liquido foi: "+salarioLiquido);

	}

}