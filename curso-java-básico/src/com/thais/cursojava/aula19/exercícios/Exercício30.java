package com.thais.cursojava.aula19.exerc�cios;

import java.util.Scanner;

public class Exerc�cio30 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		
		int [] a=new int [20];
		int [] b= new int[20];
		int [] c= new int [20];
		int j=0, k=0;
		
		
		for(int i=0;i<a.length ;i++) {
			
			System.out.println("Digite um n�mero: ");
			a[i]= scan.nextInt();
			
			if (a[i]%2 ==0) {
				b[j]=a[i];
				j++;
			}else {
				c[k]=a[i];
				k++;
			}
			
		}
		for (int i=0; i<b.length;i++) {
			System.out.println("B: " +b[i]);
		}
		
		for (int i=0; i<c.length;i++) {
			System.out.println("C: " +c[i]);
		}
	}
	
	
}