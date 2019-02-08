package com.thais.cursojava.aula15.exercícios;

import java.util.Scanner;

public class Exercício11 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Informe o salário do colaborador antes do reajuste: ");
		double salarioSemReajuste= scan.nextDouble();
		
		if (salarioSemReajuste<=280) {
		double valorAumento= ((salarioSemReajuste*20)/100);
		double salarioComReajuste= salarioSemReajuste+valorAumento;
		System.out.println("O salário antes do reajuste era: "+salarioSemReajuste);
		System.out.println("O percentual de aumento aplicado é de 20% ");
		System.out.println("O valor do aumento é de: "+valorAumento);
		System.out.println("O valor do salário após o aumento é de: "+salarioComReajuste);
			
		}else if (salarioSemReajuste>280 && salarioSemReajuste<=700) {
			double valorAumento= ((salarioSemReajuste*15)/100);
			double salarioComReajuste= salarioSemReajuste+valorAumento;
			System.out.println("O salário antes do reajuste era: "+salarioSemReajuste);
			System.out.println("O percentual de aumento aplicado é de 15% ");
			System.out.println("O valor do aumento é de: "+valorAumento);
			System.out.println("O valor do salário após o aumento é de: "+salarioComReajuste);
			
		}else if (salarioSemReajuste>700 && salarioSemReajuste<=1500) {
			double valorAumento= ((salarioSemReajuste*10)/100);
			double salarioComReajuste= salarioSemReajuste+valorAumento;
			System.out.println("O salário antes do reajuste era: "+salarioSemReajuste);
			System.out.println("O percentual de aumento aplicado é de 10% ");
			System.out.println("O valor do aumento é de: "+valorAumento);
			System.out.println("O valor do salário após o aumento é de: "+salarioComReajuste);
			
		}else if (salarioSemReajuste>1500) {
			double valorAumento= ((salarioSemReajuste*5)/100);
			double salarioComReajuste= salarioSemReajuste+valorAumento;
			System.out.println("O salário antes do reajuste era: "+salarioSemReajuste);
			System.out.println("O percentual de aumento aplicado é de 5% ");
			System.out.println("O valor do aumento é de: "+valorAumento);
			System.out.println("O valor do salário após o aumento é de: "+salarioComReajuste);
			
		}
		
		
	}
	
}
		