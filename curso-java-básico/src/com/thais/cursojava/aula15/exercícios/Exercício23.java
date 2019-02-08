package com.thais.cursojava.aula15.exercícios;

import java.util.Scanner;

public class Exercício23 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Qual tipo de carne deseja comprar? \n(F)-Filé duplo \n(A)-Alcatra \n(P)-Picanha ");
		char tipoCarne=scan.next().charAt(0);
		
		System.out.println("Quantos quilos de carne você comprou? ");
		double quilosCarne= scan.nextDouble();
		
		
		switch (tipoCarne) {
		case 0106:
			if(quilosCarne<=5) {
				System.out.println("Deseja pagar com cartão? \n(S)-Sim \n(N)-Não ");
				char tipoPagamento=scan.next().charAt(0);
				
				switch(tipoPagamento) {
				case 0123:
					double valorSemDesconto1= quilosCarne*4.90;
					double desconto1=(valorSemDesconto1*5)/100;
					double valorTotal1= valorSemDesconto1 - desconto1;
					System.out.println("A carne escolhida foi: Filé Duplo ");
					System.out.println("O valor total da compra foi foi: R$"+valorSemDesconto1);
					System.out.println("O tipo de pagamento foi: Cartão ");
					System.out.println("O valor do desconto foi: R$"+desconto1);
					System.out.println("O valor a pagar foi: R$"+valorTotal1);break;
					
				case 0116:
					double valorSemDesconto2= quilosCarne*4.90;
					double desconto2= 0;
					double valorTotal2= valorSemDesconto2 - desconto2;
					System.out.println("A carne escolhida foi: Filé Duplo ");
					System.out.println("O valor total da compra foi foi: R$"+valorSemDesconto2);
					System.out.println("O tipo de pagamento foi: Dinheiro ");
					System.out.println("O valor do desconto foi: R$"+desconto2);
					System.out.println("O valor a pagar foi: R$"+valorTotal2);break;
				}
				
				
			}else {
				System.out.println("Deseja pagar com cartão? \n(S)-Sim \n(N)-Não ");
				char tipoPagamento=scan.next().charAt(0);
				
				switch(tipoPagamento) {
				case 0123:
					double valorSemDesconto3= quilosCarne*5.80;
					double desconto3=(valorSemDesconto3*5)/100;
					double valorTotal3= valorSemDesconto3 - desconto3;
					System.out.println("A carne escolhida foi: Filé Duplo ");
					System.out.println("O valor total da compra foi foi: R$"+valorSemDesconto3);
					System.out.println("O tipo de pagamento foi: Cartão ");
					System.out.println("O valor do desconto foi: R$"+desconto3);
					System.out.println("O valor a pagar foi: R$"+valorTotal3);break;
					
				case 0116:
					double valorSemDesconto4= quilosCarne*5.80;
					double desconto4= 0;
					double valorTotal4= valorSemDesconto4 - desconto4;
					System.out.println("A carne escolhida foi: Filé Duplo ");
					System.out.println("O valor total da compra foi foi: R$"+valorSemDesconto4);
					System.out.println("O tipo de pagamento foi: Dinheiro ");
					System.out.println("O valor do desconto foi: R$"+desconto4);
					System.out.println("O valor a pagar foi: R$"+valorTotal4);break;
				}
				
			}break;
		case 0101:
			if(quilosCarne<=5) {
				System.out.println("Deseja pagar com cartão? \n(S)-Sim \n(N)-Não ");
				char tipoPagamento=scan.next().charAt(0);
				
				switch(tipoPagamento) {
				case 0123:
					double valorSemDesconto5= quilosCarne*5.90;
					double desconto5=(valorSemDesconto5*5)/100;
					double valorTotal5= valorSemDesconto5 - desconto5;
					System.out.println("A carne escolhida foi: Alcatra ");
					System.out.println("O valor total da compra foi foi: R$"+valorSemDesconto5);
					System.out.println("O tipo de pagamento foi: Cartão ");
					System.out.println("O valor do desconto foi: R$"+desconto5);
					System.out.println("O valor a pagar foi: R$"+valorTotal5);break;
					
				case 0116:
					double valorSemDesconto6= quilosCarne*5.90;
					double desconto6= 0;
					double valorTotal6= valorSemDesconto6 - desconto6;
					System.out.println("A carne escolhida foi: Alcatra ");
					System.out.println("O valor total da compra foi foi: R$"+valorSemDesconto6);
					System.out.println("O tipo de pagamento foi: Dinheiro ");
					System.out.println("O valor do desconto foi: R$"+desconto6);
					System.out.println("O valor a pagar foi: R$"+valorTotal6);break;
				}
				
				
			}else {
				System.out.println("Deseja pagar com cartão? \n(S)-Sim \n(N)-Não ");
				char tipoPagamento=scan.next().charAt(0);
				
				switch(tipoPagamento) {
				case 0123:
					double valorSemDesconto7= quilosCarne*6.80;
					double desconto7=(valorSemDesconto7*5)/100;
					double valorTotal7= valorSemDesconto7 - desconto7;
					System.out.println("A carne escolhida foi: Alcatra ");
					System.out.println("O valor total da compra foi foi: R$"+valorSemDesconto7);
					System.out.println("O tipo de pagamento foi: Cartão ");
					System.out.println("O valor do desconto foi: R$"+desconto7);
					System.out.println("O valor a pagar foi: R$"+valorTotal7);break;
					
				case 0116:
					double valorSemDesconto8= quilosCarne*6.80;
					double desconto8= 0;
					double valorTotal8= valorSemDesconto8 - desconto8;
					System.out.println("A carne escolhida foi: Alcatra ");
					System.out.println("O valor total da compra foi foi: R$"+valorSemDesconto8);
					System.out.println("O tipo de pagamento foi: Dinheiro ");
					System.out.println("O valor do desconto foi: R$"+desconto8);
					System.out.println("O valor a pagar foi: R$"+valorTotal8);break;
				}
				
			}break;
			
		case 0120:
			if(quilosCarne<=5) {
				System.out.println("Deseja pagar com cartão? \n(S)-Sim \n(N)-Não ");
				char tipoPagamento=scan.next().charAt(0);
				
				switch(tipoPagamento) {
				case 0123:
					double valorSemDesconto9= quilosCarne*6.90;
					double desconto9=(valorSemDesconto9*5)/100;
					double valorTotal9= valorSemDesconto9 - desconto9;
					System.out.println("A carne escolhida foi: Picanha ");
					System.out.println("O valor total da compra foi foi: R$"+valorSemDesconto9);
					System.out.println("O tipo de pagamento foi: Cartão ");
					System.out.println("O valor do desconto foi: R$"+desconto9);
					System.out.println("O valor a pagar foi: R$"+valorTotal9);break;
					
				case 0116:
					double valorSemDesconto10= quilosCarne*6.90;
					double desconto10= 0;
					double valorTotal10= valorSemDesconto10 - desconto10;
					System.out.println("A carne escolhida foi: Picanha ");
					System.out.println("O valor total da compra foi foi: R$"+valorSemDesconto10);
					System.out.println("O tipo de pagamento foi: Dinheiro ");
					System.out.println("O valor do desconto foi: R$"+desconto10);
					System.out.println("O valor a pagar foi: R$"+valorTotal10);break;
				}
				
				
			}else {
				System.out.println("Deseja pagar com cartão? \n(S)-Sim \n(N)-Não ");
				char tipoPagamento=scan.next().charAt(0);
				
				switch(tipoPagamento) {
				case 0123:
					double valorSemDesconto11= quilosCarne*7.80;
					double desconto11=(valorSemDesconto11*5)/100;
					double valorTotal11= valorSemDesconto11 - desconto11;
					System.out.println("A carne escolhida foi: Picanha ");
					System.out.println("O valor total da compra foi foi: R$"+valorSemDesconto11);
					System.out.println("O tipo de pagamento foi: Cartão ");
					System.out.println("O valor do desconto foi: R$"+desconto11);
					System.out.println("O valor a pagar foi: R$"+valorTotal11);break;
					
				case 0116:
					double valorSemDesconto12= quilosCarne*7.80;
					double desconto12= 0;
					double valorTotal12= valorSemDesconto12 - desconto12;
					System.out.println("A carne escolhida foi: Picanha ");
					System.out.println("O valor total da compra foi foi: R$"+valorSemDesconto12);
					System.out.println("O tipo de pagamento foi: Dinheiro ");
					System.out.println("O valor do desconto foi: R$"+desconto12);
					System.out.println("O valor a pagar foi: R$"+valorTotal12);break;
				}
				
			}break;
		}
		
	}
	
}
