package com.thais.cursojava.aula17.exercícios;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Insira um nome de usuário: ");
		String nome= scan.next();
		
		System.out.println("Insira uma senha: ");
		String senha= scan.next();
		
		// o .equals compara se uma sequencia de caracteres da string é igual a sequencia de caracteres da outra string
		while (nome.equals(senha)) {
			System.out.println("Usuário e senha inválidos, digite um usuário e senha válidos! ");
			
			System.out.println("Insira um nome de usuário: ");
			nome= scan.next();
			
			System.out.println("Insira uma senha: ");
			senha= scan.next();
			
			
		}
		
		System.out.println("Seu nome de usuário é: "+nome);
		System.out.println("Sua senha é: "+senha);
		
		
	}
	
}