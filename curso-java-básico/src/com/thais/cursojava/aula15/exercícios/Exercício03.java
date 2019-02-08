package com.thais.cursojava.aula15.exercícios;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite F para feminino ou M para masculino: ");
		char sexo= scan.next().charAt(0);
		
		switch (sexo){
		case 0106: System.out.println("O sexo digitado é feminino");break;
		case 0115: System.out.println("O sexo digitado é masculino");break;
		default:System.out.println("Sexo inválido");
		
		}
		
	
	}

}