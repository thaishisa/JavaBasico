package com.thais.cursojava.aula19.exercícios;

public class Exercício37 {

	public static void main(String[] args) {
	
		int [] a= new int [15];
		
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
		a [10]=6;
		a [11]=5;
		a [12]=8;
		a [13]=3;
		a [14]=12;
		
		int [] b= new int [15];
		int fatorial=0;
		
		for (int i=0; i< a.length;i++) {
			
			System.out.println("Fatorial de "+a[i]+" :");
			
			for (int j=(a[i]-1);j>0; j--) {
				fatorial=a[i]*j;
				a[i]=fatorial;
				b[i]=fatorial;
				}
			System.out.println(fatorial);
			}
		}
	}
