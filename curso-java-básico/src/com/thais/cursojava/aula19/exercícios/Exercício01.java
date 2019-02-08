package com.thais.cursojava.aula19.exercícios;

public class Exercício01 {

	public static void main(String[] args) {
		
		int [] a = new int [5];
		
		a [0]=1;
		a [1]=2;
		a [2]=3;
		a [3]=4;
		a [4]=5;
		
		int [] b = new int [5];
		
		for (int i=0; i<=(a.length-1);i++) {
			//ou só i<a.length
			b[i]=a[i];
			System.out.println("A: "+ a[i]);
			System.out.println("B: "+ b[i]);
			
		}
		
		
	}

}
