package com.thais.cursojava.aula19.exercícios;

public class Exercício23 {

	public static void main(String[] args) {
		
		int [] a = new int [10];
		a [0]= 2;
		a [1]= 4;
		a [2]= 6;
		a [3]= 8;
		a [4]= 3;
		a [5]= 10;
		a [6]= 8;
		a [7]= 6;
		a [8]= 4;
		a [9]= 2;
		
		
		for (int i=0; i< a.length; i++) {
			
			System.out.println("Valor: "+a[i]);
			
			if(a[i]%2!=0) {
				
				break;
			
			}
			
		}

	}

}