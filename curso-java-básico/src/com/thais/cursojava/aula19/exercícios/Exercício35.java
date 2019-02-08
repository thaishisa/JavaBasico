package com.thais.cursojava.aula19.exercícios;

public class Exercício35 {

	public static void main(String[] args) {
	
		int [] a= new int [10];
		
		a [0]=1;
		a [1]=2;
		a [2]=21;
		a [3]=4;
		a [4]=5;
		a [5]=6;
		a [6]=11;
		a [7]=8;
		a [8]=13;
		a [9]=10;
		
		for (int i=0; i< a.length;i++) {
			
			System.out.println("Divisores até "+a[i]+" :");
			
			for (int j=1; j<=a[i]; j++) {
				if (a[i]%j==0) {
				
					System.out.println(j);
				}		
			}
		}
	}
}