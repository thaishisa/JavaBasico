package com.thais.cursojava.aula19.exercícios;

public class Exercício26 {

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
		a [9]= 1;
		
		int [] b= new int [10];
		b [0]= 2;
		b [1]= 4;
		b [2]= 6;
		b [3]= 3;
		b [4]= 8;
		b [5]= 11;
		b [6]= 9;
		b [7]= 5;
		b [8]= 1;
		b [9]= 3;
		
		int [] c= new int[10];
		
		for (int i=0; i< a.length; i++) {
			
			if (a[i]> b[i]) {
				c[i]=1;
			}else if (a[i]==b[i]) {
				c[i]=0;
			}else {
				c[i]= -1;
			}
			System.out.println("C: "+c[i]);
		}
		
	}
	
}