package com.thais.cursojava.aula19.exerc�cios;

public class Exerc�cio05 {

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
	
		
		int [] b = new int[10];
		
		for (int i=0; i< a.length ; i++) {
			
			b[i]=a[i]*i;
			System.out.println("A: " +a[i]);
			System.out.println("B: "+ b[i]);
		}
	}

}