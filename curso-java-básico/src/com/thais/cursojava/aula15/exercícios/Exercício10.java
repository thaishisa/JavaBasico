package com.thais.cursojava.aula15.exerc�cios;

import java.util.Scanner;

public class Exerc�cio10 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Em qual turno voc� estuda? \n(M)-Matutino \n(V)-Vespertino \n(N)-Noturno ");
		char periodo= scan.next().charAt(0);
		
		switch (periodo){
		case 0155:
		case 0115: System.out.println("Bom dia!");break;
		case 0166:
		case 0126: System.out.println("Boa tarde!");break;
		case 0156: 
		case 0116: System.out.println("Boa noite!");break;
		default:System.out.println("Valor inv�lido!");
		
		}
		
	
	}

}