package com.thais.cursojava.aula17.exerc�cios;

import java.util.Scanner;

public class Exerc�cio02 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Insira um nome de usu�rio: ");
		String nome= scan.next();
		
		System.out.println("Insira uma senha: ");
		String senha= scan.next();
		
		// o .equals compara se uma sequencia de caracteres da string � igual a sequencia de caracteres da outra string
		while (nome.equals(senha)) {
			System.out.println("Usu�rio e senha inv�lidos, digite um usu�rio e senha v�lidos! ");
			
			System.out.println("Insira um nome de usu�rio: ");
			nome= scan.next();
			
			System.out.println("Insira uma senha: ");
			senha= scan.next();
			
			
		}
		
		System.out.println("Seu nome de usu�rio �: "+nome);
		System.out.println("Sua senha �: "+senha);
		
		
	}
	
}