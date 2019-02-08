package com.thais.cursojava.aula34.exercicios;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Calculadora calc=new Calculadora();
		
		calc.setNum1(4);
		calc.setNum2(5);
		System.out.println(calc.getNum1());
		System.out.println(calc.getNum2());
		
		System.out.println(calc.somar());
		System.out.println(calc.subtrair());
		System.out.println(calc.multiplicar());
		System.out.println(calc.dividir());
		System.out.println(calc.elevarPotenciaNum1(3));
		System.out.println(calc.elevarPotenciaNum2(2));
		
		System.out.println(calc.fatorialNum1());
	}

}
