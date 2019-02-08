package com.thais.cursojava.aula24.exercicios;

public class Exer01Lampada {

	public static void main(String[] args) {
		Lampada lampada= new Lampada();
		lampada.modelo= "A60";
		lampada.tensao= "Bivolt";
		lampada.garantia=36;
		lampada.potencia=7;
		lampada.cor="Amarela";
		
		lampada.tipos= new String[5];
		lampada.tipos[1]="Abajur";
		lampada.tipos[1]="Luminaria";
	}

}
