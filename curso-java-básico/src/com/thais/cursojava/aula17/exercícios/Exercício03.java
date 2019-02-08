package com.thais.cursojava.aula17.exercícios;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Insira seu nome: ");
		String nome= scan.next();
		
		while(nome.length()<=3) {
			System.out.println("Nome inválido, digite novamente! ");
			System.out.println("Insira seu nome: ");
			nome= scan.next();	
		}
		
		System.out.println("Insira sua idade: ");
		int idade= scan.nextInt();
		
		while(idade<0 || idade>150) {
			System.out.println("Idade inválida, digite novamente! ");
			System.out.println("Insira sua idade: ");
			idade= scan.nextInt();
			
		}
		
		System.out.println("Insira seu salário: ");
		double salario= scan.nextDouble();
		
		while(salario<0) {
			System.out.println("Salário inválido, digite novamente! ");
			System.out.println("Insira seu salário: ");
		    salario= scan.nextDouble();
		}
		
		System.out.println("Insira seu sexo F-Feminino M-Masculino: ");
		String sexo= scan.next();
		
		while(!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m") ) {
			System.out.println("Sexo inválido, digite novamente! ");
			System.out.println("Insira seu sexo F-Feminino M-Masculino: ");
			sexo= scan.next();
			
		}
		
		System.out.println("Insira seu estado civil S-Solteiro C-Casado D-Divorciado V-Viúvo: ");
		String estado= scan.next();
		
		while(!estado.equalsIgnoreCase("s") && !estado.equalsIgnoreCase("c") && !estado.equalsIgnoreCase("v") && !estado.equalsIgnoreCase("d") ) {
			System.out.println("Estado civil inválido, digite novamente! ");
			System.out.println("Insira seu estado civil S-Solteiro C-Casado D-Divorciado V-Viúvo: ");
			estado= scan.next();
		}
		System.out.println("Seu nome é: "+nome);
		System.out.println("Sua idade é: "+idade);
		System.out.println("Seu salário é: "+salario);
		System.out.println("Seu sexo é: "+sexo);
		System.out.println("Seu estado civil é: "+estado);
	
	}
	
}
