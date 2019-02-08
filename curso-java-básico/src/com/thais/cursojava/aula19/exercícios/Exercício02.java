package com.thais.cursojava.aula19.exercícios;

public class Exercício02 {

	public static void main(String[] args) {
		
		int [] a = new int [8];
		
		a [0]=1;
		a [1]=2;
		a [2]=3;
		a [3]=4;
		a [4]=5;
		a [5]=6;
		a [6]=7;
		a [7]=8;
		
		int []b = new int [8];
		//int []b = new int [a.length];
		for (int i=0; i<=(a.length-1);i++) {
			//ou só i < length
			b[i]= a[i]*2;
			System.out.println("A: "+ a[i]);
			System.out.println("B: "+ b[i]);
		}

	}

}
