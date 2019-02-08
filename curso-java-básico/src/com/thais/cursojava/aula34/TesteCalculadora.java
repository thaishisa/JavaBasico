package com.thais.cursojava.aula34;

public class TesteCalculadora {
	
	static int resulSoma;

	public static void main(String[] args) {
		
		int  resultSoma=MinhaCalculadora.soma(1,2);
		//MinhaCalculadora calc=new MinhaCalculadora();
		
		//calc.soma(1, 2);
		//calc.soma(1.0, 2.0);
		
		MinhaCalculadora.soma(1, 2); 
		
		soma2Valores(1,2);
		
	}
	
	static int soma2Valores(int num1, int num2) {
		return MinhaCalculadora.soma(num1, num2);
	}

}
