package com.thais.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exerc�cio08 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite o quanto voc� ganha por hora: ");
		double salarioHora= scan.nextDouble();
		
		System.out.println("Digite quantas horas voc� trabalhou no m�s: ");
		int horasTrabalhadas= scan.nextInt();
		
	    double salarioMes= salarioHora*horasTrabalhadas;
	    System.out.println("O seu sal�rio mensal foi: "+salarioMes);

	}

}
