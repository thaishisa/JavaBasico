package com.thais.cursojava.aula19.exercícios;

public class Exercício32 {

	public static void main(String[] args) {
	
		int [] a= new int [5];
		
		a [0]=1;
		a [1]=2;
		a [2]=3;
		a [3]=4;
		a [4]=5;
		
		int tabuada=0;
		
		for (int i=0; i< a.length;i++) {
			System.out.println("Tabuada do "+a[i]+"\n");
			for (int j=1; j<=10; j++) {
				tabuada= a[i]*j;
				System.out.println(+a[i]+" X "+j+" = "+tabuada);
			}
		}
	}

}
