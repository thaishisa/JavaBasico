package com.thais.cursojava.aula19.exerc�cios;

import java.util.Scanner;

public class Exerc�cio18 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		
		int [] idade= new int[10];
		int j=0, k=0;
		int maior= Integer.MIN_VALUE;
		int menor= Integer.MAX_VALUE;
		
		for(int i=0;i<idade.length ;i++) {
			
			System.out.println("Digite a sua idade: ");
			idade[i]=scan.nextInt();
			
			if (idade[i]>maior) {
				maior=idade[i];
				j=i;
			}else if (idade[i]<menor) {
				menor=idade[i];
				k=i;
			}
			
		}
		System.out.println("O maior n�mero �: "+maior+" e sua posi��o �: "+j);
		System.out.println("O menor n�mero �: "+menor+" e sua posi��o �: "+k);
	}

}