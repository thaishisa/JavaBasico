package com.thais.cursojava.aula19.exerc�cios;


public class Exerc�cio20 {

	public static void main(String[] args) {
		
		
		
		double [] a= new double[20];
	
		
		for(int i=0;i<a.length ;i++) {
			
			a[i]=3.3669*(i+1);
			
			System.out.println("A cota��o do d�lar � : U$"+a[i]+" para R$"+i+",00");
				
			}
		}
	}