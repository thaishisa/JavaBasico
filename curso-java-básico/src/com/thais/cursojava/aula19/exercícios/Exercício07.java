package com.thais.cursojava.aula19.exercícios;

public class Exercício07 {

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
		b [0]= 10;
		b [1]= 9;
		b [2]= 8;
		b [3]= 7;
		b [4]= 6;
		b [5]= 5;
		b [6]= 4;
		b [7]= 3;
		b [8]= 2;
		b [9]= 1;
		
		int [] c= new int [10];
		
		
		for (int i=0; i< a.length ; i++) {
			
			c[i]=a[i]-b[i];
			System.out.println(a[i]+"-"+b[i]+"="+c[i]);
			
		}
	}

}