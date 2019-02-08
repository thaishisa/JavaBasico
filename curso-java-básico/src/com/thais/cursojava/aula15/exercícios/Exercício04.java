package com.thais.cursojava.aula15.exercícios;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite uma letra do alfabeto: ");
		char letra= scan.next().charAt(0);
		
		switch (letra){
		case 0101: 
		case 0105: 
		case 0111:
		case 0117:
		case 0125:
		case 0141: 
		case 0155: 
		case 0151:
		case 0157:
		case 0165:System.out.println("Essa letra é uma vogal");break;
		default:System.out.println("Essa letra é uma consoante");
		
		//se usar String na variável da letra, no switch a letra é declarada case "a":
		//é possivel limitar o tamanho da String pela função letra.length()
		/*if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||letra.equalsIgnoreCase("u")){
		System.out.println("Essa letra é uma vogal");
		} else {
		System.out.println("Essa letra é uma consoante");
		}*/
		
		}
		
	
	}

}