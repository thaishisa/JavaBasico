package com.thais.cursojava.aula15.exerc�cios;

import java.util.Scanner;

public class Exerc�cio03 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite F para feminino ou M para masculino: ");
		char sexo= scan.next().charAt(0);
		
		switch (sexo){
		case 0106: System.out.println("O sexo digitado � feminino");break;
		case 0115: System.out.println("O sexo digitado � masculino");break;
		default:System.out.println("Sexo inv�lido");
		
		}
		
	
	}

}