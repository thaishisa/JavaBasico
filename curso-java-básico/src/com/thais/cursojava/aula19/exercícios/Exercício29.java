package com.thais.cursojava.aula19.exercícios;

public class Exercício29 {

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
		b [0]= 1;
		b [1]= 2;
		b [2]= 8;
		b [3]= 2;
		b [4]= 4;
		b [5]= 5;
		b [6]= 8;
		b [7]= 7;
		b [8]= 3;
		b [9]= 20;
		
		int[] c= new int [20];
		
		
		for (int i=0, j=(i-c.length/2); i< c.length; i++,j++) {
			
			if(i<(c.length/2)) {
				c[i]=a[i];
			}else {
				c[i]=b[j];
			}
			System.out.println("C: "+c[i]);
		
		}
		
	}
	
}