package com.thais.cursojava.aula19.exerc�cios;

public class Exerc�cio12 {

	public static void main(String[] args) {
		
		int [] a = new int [10];
		a [0]= 1;
		a [1]= 2;
		a [2]= 3;
		a [3]= 4;
		a [4]= 5;
		a [5]= 6;
		a [6]= 7;
		a [7]= 8;
		a [8]= 9;
		a [9]= 10;
		
		int soma=0;
		
		for (int i=0; i< a.length; i++) {
			
			soma=a[i]+soma;
			
			}
		
		System.out.println("A soma dos elementos desse vetor �: "+ soma);

	}

}
