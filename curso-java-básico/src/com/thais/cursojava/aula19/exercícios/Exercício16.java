package com.thais.cursojava.aula19.exercícios;

public class Exercício16 {

	public static void main(String[] args) {
		
		int [] a = new int [10];
		a [0]= 15;
		a [1]= 15;
		a [2]= 15;
		a [3]= 15;
		a [4]= 15;
		a [5]= 15;
		a [6]= 15;
		a [7]= 15;
		a [8]= 15;
		a [9]= 15;
		
		int soma=0;
		int j=0; 
		int	k=0;
		int soma2=0;
		double media=0;
		
		for (int i=0; i< a.length; i++) {
			
			if(a[i]<15) {
				soma=a[i]+soma;	
			}else if(a[i]==15) {
				j++;
			}else {
				k++;
				soma2=a[i]+soma2;
				media=soma2/k;
			}
			
		}
		
		System.out.println("A soma dos elementos menores que 15 desse vetor é: "+ soma);
		System.out.println("A quantidade de elementos igual a 15 é: "+ j);
		System.out.println("A media de elementos maiores que 15  é: "+ media);
		
		

	}

}