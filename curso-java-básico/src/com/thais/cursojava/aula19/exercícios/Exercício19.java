package com.thais.cursojava.aula19.exerc�cios;

import java.util.Scanner;

public class Exerc�cio19 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		
		double [] nota1= new double[10];
		double [] nota2= new double[10];
		double [] result= new double [10];
		
		for(int i=0;i<nota1.length ;i++) {
			
			System.out.println("Digite a primeira nota: ");
			nota1[i]=scan.nextDouble();
			
			System.out.println("Digite a segunda nota: ");
			nota2[i]=scan.nextDouble();
			
			result[i]=(nota1[i]+nota2[i])/2;
			
			System.out.println("Sua primeira nota foi: "+nota1[i]);
			
			System.out.println("Sua segunda nota foi: "+nota2[i]);
			
			System.out.println("Sua m�dia foi: "+result[i]);
		
			
			if(result[i]<7) {
				System.out.println("Voc� foi reprovado\n ");
				
			}else {
				System.out.println("Voc� foi aprovado\n");
				
			}
		}
		
	}
	
	
}