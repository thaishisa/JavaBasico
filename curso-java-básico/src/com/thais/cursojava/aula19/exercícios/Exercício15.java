package com.thais.cursojava.aula19.exercícios;

public class Exercício15 {

	public static void main(String[] args) {
		
		int [] a = new int [10];
		a [0]= 1;
		a [1]= 9;
		a [2]= 3;
		a [3]= 4;
		a [4]= 17;
		a [5]= 6;
		a [6]= 7;
		a [7]= 15;
		a [8]= 9;
		a [9]= 10;
		
		int j=0;
		int k=0;
		double percentualPar;
		double percentualImpar;
		for (int i=0; i< a.length; i++) {
			
			if (a[i]% 2 ==0) {
				j++;
				
			}else {
				k++;
			}
			
		}
		
		percentualPar= (j*100)/a.length;
		percentualImpar= (k*100)/a.length;
		System.out.println("O percentual de numeros pares no vetor é de: "+percentualPar+"%");
		System.out.println("O percentual de numeros ímpares no vetor é de: "+percentualImpar+"%");
	}
	
}
