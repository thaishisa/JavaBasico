package com.thais.cursojava.aula34.exercicios;

public class Contador {
	
	
	static int valorContador;
	
	public Contador() {
		valorContador++;
	}
	
	public static void zerar() {
		valorContador=0;
	}
	
	public static void incrementar() {
		valorContador++;
	}
	public static int RetornarValorContador() {
		return valorContador;
	}
	
}
