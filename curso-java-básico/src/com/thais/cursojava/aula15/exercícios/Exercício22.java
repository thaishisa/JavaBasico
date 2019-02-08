package com.thais.cursojava.aula15.exercícios;

import java.util.Scanner;

public class Exercício22 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Quantos quilos de maçã você comprou? ");
		double quilosMaca= scan.nextDouble();
		
		System.out.println("Quantos quilos de morango você comprou? ");
		double quilosMorango= scan.nextDouble();
		
		if (quilosMorango<=5 && quilosMaca<=5) {
			double valorMorango= 2.50*quilosMorango;
			double valorMaca= 1.80*quilosMaca;
			double valorCompra1=valorMorango+valorMaca;
			if (valorCompra1>25 ||(quilosMorango+quilosMaca)>8) {
				double valorCompra2= valorCompra1 - ((valorCompra1*10)/100);
				System.out.println("O valor da sua compra é: "+valorCompra2);
			}else {
				System.out.println("O valor da sua compra é: "+valorCompra1);
			}
			
		}else if (quilosMorango>5 && quilosMaca>5) {
			double valorMorango= 2.20*quilosMorango;
			double valorMaca= 1.50*quilosMaca;
			double valorCompra1=valorMorango+valorMaca;
			if (valorCompra1>25 ||(quilosMorango+quilosMaca)>8) {
				double valorCompra2= valorCompra1 - ((valorCompra1*10)/100);
				System.out.println("O valor da sua compra é: "+valorCompra2);
			}else {
				System.out.println("O valor da sua compra é: "+valorCompra1);
			}
			
		}else if (quilosMorango<=5 && quilosMaca>5) {
			double valorMorango= 2.50*quilosMorango;
			double valorMaca= 1.50*quilosMaca;
			double valorCompra1=valorMorango+valorMaca;
			if (valorCompra1>25 ||(quilosMorango+quilosMaca)>8) {
				double valorCompra2= valorCompra1 - ((valorCompra1*10)/100);
				System.out.println("O valor da sua compra é: "+valorCompra2);
			}else {
				System.out.println("O valor da sua compra é: "+valorCompra1);
			}
			
		}else if (quilosMorango>5 && quilosMaca<=5) {
			double valorMorango= 2.20*quilosMorango;
			double valorMaca= 1.80*quilosMaca;
			double valorCompra1=valorMorango+valorMaca;
			if (valorCompra1>25 ||(quilosMorango+quilosMaca)>8) {
				double valorCompra2= valorCompra1 - ((valorCompra1*10)/100);
				System.out.println("O valor da sua compra é: "+valorCompra2);
			}else {
				System.out.println("O valor da sua compra é: "+valorCompra1);
			}
		}
	}
	
}