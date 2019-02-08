package com.thais.cursojava.aula15.exercícios;

import java.util.Scanner;

public class Exercício19 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero1=scan.nextInt();
		
		System.out.println("Digite outro número: ");
		int numero2=scan.nextInt();
		
		System.out.println("Digite uma operação que deseja realizar: \n(S)-Subtração \n(A)-Adição \n(M)-Multiplicação \n(D)-Divisão");
		char operacao=scan.next().charAt(0);
		
		switch (operacao) {
		case 0123:
			int subtracao= numero1 - numero2;
			
			if (subtracao%2==0 && subtracao<0) {
				System.out.println("Esse número é par e negativo ");
			}else if (subtracao%2==0 && subtracao>0) {
				System.out.println("Esse número é par e positivo ");
			}else if (subtracao%2!=0 && subtracao<0) {
				System.out.println("Esse número é ímpar e negativo ");
			}else {
				System.out.println("Esse número é ímpar e positivo ");
			}break;
			
		case 0101:
			int adicao= numero1 + numero2;
			
			if (adicao%2==0 && adicao<0) {
				System.out.println("Esse número é par e negativo ");
			}else if (adicao%2==0 && adicao>0) {
				System.out.println("Esse número é par e positivo ");
			}else if (adicao%2!=0 && adicao<0) {
				System.out.println("Esse número é ímpar e negativo ");
			}else {
				System.out.println("Esse número é ímpar e positivo ");
			}break;
		case 0115:
			int multiplicacao= numero1 * numero2;
			
			if (multiplicacao%2==0 && multiplicacao<0) {
				System.out.println("Esse número é par e negativo ");
			}else if (multiplicacao%2==0 && multiplicacao>0) {
				System.out.println("Esse número é par e positivo ");
			}else if (multiplicacao%2!=0 && multiplicacao<0) {
				System.out.println("Esse número é ímpar e negativo ");
			}else {
				System.out.println("Esse número é ímpar e positivo ");
			}break;
		case 0104:
			int divisao= numero1 / numero2;
			
			if (divisao%2==0 && divisao<0) {
				System.out.println("Esse número é par e negativo ");
			}else if (divisao%2==0 && divisao>0) {
				System.out.println("Esse número é par e positivo ");
			}else if (divisao%2!=0 && divisao<0) {
				System.out.println("Esse número é ímpar e negativo ");
			}else {
				System.out.println("Esse número é ímpar e positivo ");
			}break;
		default: System.out.println("Opção inválida ");
		}
		
		
		
	}
	
}