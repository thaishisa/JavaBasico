package com.thais.cursojava.aula13;

public class OperadoresAritm�ticos {

	public static void main(String[] args) {
	
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado -1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Esta � ";
		String segundoNome = "uma string concatenada";
		String terceiroNome = primeiroNome+ segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		
		System.out.println(resultado++);
		//� a mesma coisa que
		//System.out.println(resultado);
		//resultado = resultado +1;
		//resultado + = 1;
		
		System.out.println(++resultado);
		//� a mesma coisa que
		//resultado += 1;
		//System.out.println(resultado);
		
		resultado--;
		System.out.println(resultado);
		
		System.out.println(resultado--);
		System.out.println(--resultado);
		
		
		

	}

}
