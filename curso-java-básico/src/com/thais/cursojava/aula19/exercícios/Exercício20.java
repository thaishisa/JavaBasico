package com.thais.cursojava.aula19.exercícios;


public class Exercício20 {

	public static void main(String[] args) {
		
		
		
		double [] a= new double[20];
	
		
		for(int i=0;i<a.length ;i++) {
			
			a[i]=3.3669*(i+1);
			
			System.out.println("A cotação do dólar é : U$"+a[i]+" para R$"+i+",00");
				
			}
		}
	}