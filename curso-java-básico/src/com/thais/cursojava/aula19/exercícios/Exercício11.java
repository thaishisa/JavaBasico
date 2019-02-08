package com.thais.cursojava.aula19.exercícios;

public class Exercício11 {

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
		
		for (int i=0; i< a.length; i++) {
			
			if (a[i]% 2 ==0) {
				j++;
				System.out.println(a[i]+" É par");
			}
		}
		System.out.println("Esse vetor tem "+j+" números pares");

	}

}
