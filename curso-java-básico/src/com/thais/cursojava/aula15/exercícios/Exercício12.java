package com.thais.cursojava.aula15.exercícios;

import java.util.Scanner;

public class Exercício12 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Informe quanto vale a hora trabalhada: ");
		double valorHora= scan.nextDouble();
		
		System.out.println("Informe quantas horas você trabalhou: ");
		double horasTrabalho= scan.nextDouble();
		double salarioBruto= valorHora*horasTrabalho;
		
		if (salarioBruto<=900) {
		double sindicato= (salarioBruto*3)/100;
		double fgts= (salarioBruto*11)/100;
		double ir=0;
		double totalDescontos= sindicato;
		double salarioLiquido= salarioBruto - totalDescontos;
		System.out.println("Salário Bruto: ("+valorHora+"*"+horasTrabalho+")    : R$"+salarioBruto);
		System.out.println("(-) IR (isento)               : R$"+ir);
		System.out.println("(-) Sindicato (3%)            : R$"+sindicato);
		System.out.println("FGTS (11%)                    : R$"+fgts);
		System.out.println("Total de descontos            : R$"+totalDescontos);
		System.out.println("Salário Liquido               : R$"+salarioLiquido);
		}else if (salarioBruto>900 && salarioBruto<=1500) {
			double sindicato= (salarioBruto*3)/100;
			double fgts= (salarioBruto*11)/100;
			double ir=(salarioBruto*5)/100;
			double totalDescontos= sindicato+ir;
			double salarioLiquido= salarioBruto - totalDescontos;
			System.out.println("Salário Bruto: ("+valorHora+"*"+horasTrabalho+")    : R$"+salarioBruto);
			System.out.println("(-) IR (5%)                   : R$"+ir);
			System.out.println("(-) Sindicato (3%)            : R$"+sindicato);
			System.out.println("FGTS (11%)                    : R$"+fgts);
			System.out.println("Total de descontos            : R$"+totalDescontos);
			System.out.println("Salário Liquido               : R$"+salarioLiquido);
			
		}else if (salarioBruto>1500 && salarioBruto<=2500) {
			double sindicato= (salarioBruto*3)/100;
			double fgts= (salarioBruto*11)/100;
			double ir=(salarioBruto*10)/100;
			double totalDescontos= sindicato+ir;
			double salarioLiquido= salarioBruto - totalDescontos;
			System.out.println("Salário Bruto: ("+valorHora+"*"+horasTrabalho+")    : R$"+salarioBruto);
			System.out.println("(-) IR (10%)                  : R$"+ir);
			System.out.println("(-) Sindicato (3%)            : R$"+sindicato);
			System.out.println("FGTS (11%)                    : R$"+fgts);
			System.out.println("Total de descontos            : R$"+totalDescontos);
			System.out.println("Salário Liquido               : R$"+salarioLiquido);

		}else if (salarioBruto>2500) {
			double sindicato= (salarioBruto*3)/100;
			double fgts= (salarioBruto*11)/100;
			double ir=(salarioBruto*20)/100;
			double totalDescontos= sindicato+ir;
			double salarioLiquido= salarioBruto - totalDescontos;
			System.out.println("Salário Bruto: ("+valorHora+"*"+horasTrabalho+")    : R$"+salarioBruto);
			System.out.println("(-) IR (20%)                  : R$"+ir);
			System.out.println("(-) Sindicato (3%)            : R$"+sindicato);
			System.out.println("FGTS (11%)                    : R$"+fgts);
			System.out.println("Total de descontos            : R$"+totalDescontos);
			System.out.println("Salário Liquido               : R$"+salarioLiquido);
		}
		
	}
	
}
