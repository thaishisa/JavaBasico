package com.thais.cursojava.aula19.exercícios;

public class Exercício04 {

	public static void main(String[] args) {
		
		int [] a = new int [15];
		a [0]= 1;
		a [1]= 4;
		a [2]= 9;
		a [3]= 16;
		a [4]= 25;
		a [5]= 36;
		a [6]= 49;
		a [7]= 64;
		a [8]= 81;
		a [9]= 100;
		a [10]= 121;
		a [11]= 144;
		a [12]= 169;
		a [13]= 196;
		a [14]= 225;
		
		double [] b = new double[15];
		
		for (int i=0; i< a.length ; i++) {
			b[i]= Math.sqrt(a[i]);
			
			System.out.println("A: " +a[i]);
			System.out.println("B: "+ b[i]);
		}
	}

}