package com.thais.cursojava.aula27.exercicios;

public class Lampada {
	
	boolean acesa;
	
	void acenderLampada() {
		acesa=true;
	}
	
	void apagarLampada() {
		acesa=false;
	}
	
	void imprimirEstado() {
	if (acesa==true) {
		System.out.println("ACESA");
	}else{
		System.out.println("APAGADA");
	}
	
	}

}
