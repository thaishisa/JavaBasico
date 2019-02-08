package com.thais.cursojava.aula19.exercícios;

public class Exercício14 {

	public static void main(String[] args) {
		
		int [] a = new int [10];
		a [0]= 1;
		a [1]= 1;
		a [2]= 1;
		a [3]= 1;
		a [4]= 1;
		a [5]= 1;
		a [6]= 1;
		a [7]= 1;
		a [8]= 1;
		a [9]= 1;
		
		int soma=0;
		int j=0;
		double media=0;
		
		for (int i=0; i< a.length; i++) {
			
			if(a[i] % 2 !=0) {
				
				soma=a[i]+soma;	
				j++;
				media= soma/j;
			}
			
		}
		
		System.out.println("A média aritmética dos elementos ímpares desse vetor é: "+ media);

	}

}