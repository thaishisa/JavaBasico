package com.thais.cursojava.aula33.exercicios;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Lampada lamp= new Lampada(true);
		lamp.mostrarEstado();
		lamp.setLigada(false);
		lamp.mostrarEstado();
		lamp.mudarEstado();
		lamp.mostrarEstado();
		lamp.mudarEstado();
		lamp.mostrarEstado();
	}

}
