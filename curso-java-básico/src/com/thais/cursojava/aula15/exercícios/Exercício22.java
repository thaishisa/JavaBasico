package com.thais.cursojava.aula15.exerc�cios;

import java.util.Scanner;

public class Exerc�cio22 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Quantos quilos de ma�� voc� comprou? ");
		double quilosMaca= scan.nextDouble();
		
		System.out.println("Quantos quilos de morango voc� comprou? ");
		double quilosMorango= scan.nextDouble();
		
		if (quilosMorango<=5 && quilosMaca<=5) {
			double valorMorango= 2.50*quilosMorango;
			double valorMaca= 1.80*quilosMaca;
			double valorCompra1=valorMorango+valorMaca;
			if (valorCompra1>25 ||(quilosMorango+quilosMaca)>8) {
				double valorCompra2= valorCompra1 - ((valorCompra1*10)/100);
				System.out.println("O valor da sua compra �: "+valorCompra2);
			}else {
				System.out.println("O valor da sua compra �: "+valorCompra1);
			}
			
		}else if (quilosMorango>5 && quilosMaca>5) {
			double valorMorango= 2.20*quilosMorango;
			double valorMaca= 1.50*quilosMaca;
			double valorCompra1=valorMorango+valorMaca;
			if (valorCompra1>25 ||(quilosMorango+quilosMaca)>8) {
				double valorCompra2= valorCompra1 - ((valorCompra1*10)/100);
				System.out.println("O valor da sua compra �: "+valorCompra2);
			}else {
				System.out.println("O valor da sua compra �: "+valorCompra1);
			}
			
		}else if (quilosMorango<=5 && quilosMaca>5) {
			double valorMorango= 2.50*quilosMorango;
			double valorMaca= 1.50*quilosMaca;
			double valorCompra1=valorMorango+valorMaca;
			if (valorCompra1>25 ||(quilosMorango+quilosMaca)>8) {
				double valorCompra2= valorCompra1 - ((valorCompra1*10)/100);
				System.out.println("O valor da sua compra �: "+valorCompra2);
			}else {
				System.out.println("O valor da sua compra �: "+valorCompra1);
			}
			
		}else if (quilosMorango>5 && quilosMaca<=5) {
			double valorMorango= 2.20*quilosMorango;
			double valorMaca= 1.80*quilosMaca;
			double valorCompra1=valorMorango+valorMaca;
			if (valorCompra1>25 ||(quilosMorango+quilosMaca)>8) {
				double valorCompra2= valorCompra1 - ((valorCompra1*10)/100);
				System.out.println("O valor da sua compra �: "+valorCompra2);
			}else {
				System.out.println("O valor da sua compra �: "+valorCompra1);
			}
		}
	}
	
}