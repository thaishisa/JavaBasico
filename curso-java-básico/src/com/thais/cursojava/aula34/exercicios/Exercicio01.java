package com.thais.cursojava.aula34.exercicios;

public class Exercicio01 {
	
	

	public static void main(String[] args) {
		
		imprimirValor();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		imprimirValor();
		Contador.zerar();
		imprimirValor();
		
		Contador c1=new Contador();
		Contador c2=new Contador();
		Contador c3=new Contador(); // a variavel static é a mesma para todos os objetos por isso ela
		//continua incrementando
		imprimirValor();
	}
	static void imprimirValor() {
		System.out.println(Contador.RetornarValorContador());
	}

}
