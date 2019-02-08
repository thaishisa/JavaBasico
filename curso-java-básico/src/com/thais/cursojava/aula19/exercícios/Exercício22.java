package com.thais.cursojava.aula19.exercícios;

import java.util.Scanner;

public class Exercício22 {

	public static void main(String[] args) {
		
		
		
		double [] a= new double[10];
		int j=0;
		int percentual0;
		int percentual1;
		
		for(int i=0;i<a.length ;i++) {
			
			a[i]=(int)Math.round(Math.random()*1);
			//se eu quisesse sortear um numero de 0 a 100 eu faria Math.round(Math.random()*100);
			
			System.out.println("Valor: "+a[i]);
			
			if(a[i]==0) {
				j++;
			}
					
		}
		
		percentual0=(j*100)/a.length;
		percentual1=100-percentual0;
		System.out.println("O percentual de 0 é: "+percentual0);
		System.out.println("O percentual de 1 é: "+percentual1);
	}
	
}