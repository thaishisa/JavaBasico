package com.thais.cursojava.aula19.exercícios;

public class Exercício27 {

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
		
		char [] b= new char [10];
		
		
		for (int i=0; i< a.length; i++) {
			
			if (a[i]< 7) {
				b[i]='a';
			}else if (a[i]==7) {
				b[i]='b';
			}else if (a[i]>7 && a[i]<10) {
				b[i]='c';
			}else if (a[i]==10) {
				b[i]='d';
			}else {
				b[i]='e';
			}
			System.out.println("B: "+b[i]);
		}
		
	}
	
}