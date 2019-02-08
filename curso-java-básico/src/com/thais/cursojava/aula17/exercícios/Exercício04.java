package com.thais.cursojava.aula17.exercícios;

public class Exercício04 {

	public static void main(String[] args) {
		
		System.out.println("A cidade A tem 80000 habitantes");
		System.out.println("A cidade B tem 200000 habitantes");
		double a=80000;
		double b=200000;
		int i=1;
		
		while ( a<b) {
			double anoA=(a*3)/100;
			double anoB=(b*1.5)/100;
			double habA= a+anoA;
			double habB= b+anoB;
			System.out.println("Quantidades de habitantes em A depois de "+i+" anos: "+habA);
			System.out.println("Quantidades de habitantes em B depois de "+i+" anos: "+habB);
			
			a=habA;
			b=habB;
			i++;
		}
		System.out.println("Ano final: "+i);
	}

}
