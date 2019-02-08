package com.thais.cursojava.aula19.exercícios;

public class Exercício24 {

	public static void main(String[] args) {
		
		int [] a = new int [10];
		a [0]= 2;
		a [1]= 4;
		a [2]= 6;
		a [3]= 8;
		a [4]= 10;
		a [5]= 10;
		a [6]= 8;
		a [7]= 6;
		a [8]= 4;
		a [9]= 2;
		
		int k=0;
		
		for (int i=0, j=(a.length-1); i< a.length; i++, j--) {
			
			if(a[i]==a[j]) {
				k++;
			
			}
			
		}

		if (k==a.length) {
			System.out.println("É um palíndromo");
		}else {
			System.out.println("Não é um palíndromo");
		}
	}

}