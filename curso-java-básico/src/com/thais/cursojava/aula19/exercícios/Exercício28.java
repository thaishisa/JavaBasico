package com.thais.cursojava.aula19.exercícios;

public class Exercício28 {

	public static void main(String[] args) {
		
		int [] a = new int [10];
		a [0]= 2;
		a [1]= 4;
		a [2]= 6;
		a [3]= 8;
		a [4]= 3;
		a [5]= 10;
		a [6]= 8;
		a [7]= 5;
		a [8]= 4;
		a [9]= 15;
		
		int [] b= new int [10];
		
		
		for (int i=0, j=(a.length-1); i< a.length; i++, j--) {
			
			b[i]=a[j];
			System.out.println("B: "+b[i]);
		}
		
	}
	
}
