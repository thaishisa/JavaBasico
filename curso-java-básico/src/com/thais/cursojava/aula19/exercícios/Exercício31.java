package com.thais.cursojava.aula19.exerc�cios;

import java.util.Scanner;

public class Exerc�cio31 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		
		int [] a=new int [10];
		int [] b= new int[10];
		
		int j=0;
		
		
		for(int i=0;i<a.length ;i++) {
			
			System.out.println("Digite um n�mero: ");
			a[i]= scan.nextInt();
			
			if (a[i]%2 ==0) {
				b[j]=a[i];
				j++;
				
			}
			
		}
		
		
		for (int i=0;i<b.length;i++) {
			
			if(a[i]%2!=0) {
				b[j]=a[i];
				j++;
			}
		}
		for (int i=0; i<b.length; i++) {
			System.out.println("B: "+b[i]);
		}
	}
	
}