package com.thais.cursojava.aula15.exerc�cios;

import java.util.Scanner;

public class Exerc�cio21 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Qual o tipo de combust�vel? \n(A)-�lcool \n(G)-Gasolina ");
		char combustivel=scan.next().charAt(0);
		
		System.out.println("Quantos litros deseja abastecer? ");
		double litros=scan.nextDouble();
		
		switch (combustivel) {
		case 0101:
			if(litros<=20) {
				double valorSemDesconto= litros*1.90;
				double desconto=(valorSemDesconto*3)/100;
				double valorComDesconto=valorSemDesconto-desconto;
				System.out.println("O valor a ser pago �: "+valorComDesconto);
			}else {
				double valorSemDesconto= litros*1.90;
				double desconto=(valorSemDesconto*5)/100;
				double valorComDesconto=valorSemDesconto-desconto;
				System.out.println("O valor a ser pago �: "+valorComDesconto);
			}break;
		case 0107:
			if(litros<=20) {
				double valorSemDesconto= litros*2.50;
				double desconto=(valorSemDesconto*4)/100;
				double valorComDesconto=valorSemDesconto-desconto;
				System.out.println("O valor a ser pago �: "+valorComDesconto);
			}else {
				double valorSemDesconto= litros*2.50;
				double desconto=(valorSemDesconto*6)/100;
				double valorComDesconto=valorSemDesconto-desconto;
				System.out.println("O valor a ser pago �: "+valorComDesconto);
			}break;
			
		}
		
	}
	
}