package com.thais.cursojava.aula19.exerc�cios;

public class Exerc�cio03 {

	public static void main(String[] args) {
		
		int [] a = new int [15];
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
		a [10]= 11;
		a [11]= 12;
		a [12]= 13;
		a [13]= 14;
		a [14]= 15;
		
		int [] b = new int[15];
		
		for (int i=0; i< a.length ; i++) {
			b[i]= a[i]*a[i];
			System.out.println("A: " +a[i]);
			System.out.println("B: "+ b[i]);
		}
	}

}
