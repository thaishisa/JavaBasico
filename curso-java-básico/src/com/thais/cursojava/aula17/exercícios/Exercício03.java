package com.thais.cursojava.aula17.exerc�cios;

import java.util.Scanner;

public class Exerc�cio03 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Insira seu nome: ");
		String nome= scan.next();
		
		while(nome.length()<=3) {
			System.out.println("Nome inv�lido, digite novamente! ");
			System.out.println("Insira seu nome: ");
			nome= scan.next();	
		}
		
		System.out.println("Insira sua idade: ");
		int idade= scan.nextInt();
		
		while(idade<0 || idade>150) {
			System.out.println("Idade inv�lida, digite novamente! ");
			System.out.println("Insira sua idade: ");
			idade= scan.nextInt();
			
		}
		
		System.out.println("Insira seu sal�rio: ");
		double salario= scan.nextDouble();
		
		while(salario<0) {
			System.out.println("Sal�rio inv�lido, digite novamente! ");
			System.out.println("Insira seu sal�rio: ");
		    salario= scan.nextDouble();
		}
		
		System.out.println("Insira seu sexo F-Feminino M-Masculino: ");
		String sexo= scan.next();
		
		while(!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m") ) {
			System.out.println("Sexo inv�lido, digite novamente! ");
			System.out.println("Insira seu sexo F-Feminino M-Masculino: ");
			sexo= scan.next();
			
		}
		
		System.out.println("Insira seu estado civil S-Solteiro C-Casado D-Divorciado V-Vi�vo: ");
		String estado= scan.next();
		
		while(!estado.equalsIgnoreCase("s") && !estado.equalsIgnoreCase("c") && !estado.equalsIgnoreCase("v") && !estado.equalsIgnoreCase("d") ) {
			System.out.println("Estado civil inv�lido, digite novamente! ");
			System.out.println("Insira seu estado civil S-Solteiro C-Casado D-Divorciado V-Vi�vo: ");
			estado= scan.next();
		}
		System.out.println("Seu nome �: "+nome);
		System.out.println("Sua idade �: "+idade);
		System.out.println("Seu sal�rio �: "+salario);
		System.out.println("Seu sexo �: "+sexo);
		System.out.println("Seu estado civil �: "+estado);
	
	}
	
}
