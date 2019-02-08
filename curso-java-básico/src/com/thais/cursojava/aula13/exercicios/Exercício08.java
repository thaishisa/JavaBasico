package com.thais.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercício08 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite o quanto você ganha por hora: ");
		double salarioHora= scan.nextDouble();
		
		System.out.println("Digite quantas horas você trabalhou no mês: ");
		int horasTrabalhadas= scan.nextInt();
		
	    double salarioMes= salarioHora*horasTrabalhadas;
	    System.out.println("O seu salário mensal foi: "+salarioMes);

	}

}
