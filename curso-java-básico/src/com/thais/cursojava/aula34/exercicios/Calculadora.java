package com.thais.cursojava.aula34.exercicios;

public class Calculadora {
	
	private int num1, num2;

	public Calculadora(int num1, int num2) {
		
		this.num1 = num1;
		this.num2 = num2;
	}

	public Calculadora() {
		
	}
	
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int somar() {
		return this.num1+this.num2;
	}
	
	public int subtrair() {
		return this.num1-this.num2;
	}
	
	public int multiplicar() {
		return this.num1*this.num2;
	}
	
	public double dividir() {
		return this.num1/this.num2;
	}
	
	public double elevarPotenciaNum1(int n) {
		int potencia=1;
		for (int i=0; i<n;i++) {
			potencia=potencia*this.num1;
		}
		return potencia;
	}
	
	public double elevarPotenciaNum2(int n) {
		int potencia=1;
		for (int i=0; i<n;i++) {
			potencia=potencia*this.num2;
		}
		return potencia;
	}
	
	public double fatorialNum1() {
		double fatorial=num1;
		if(num1==0) {
			return 1;
		}
		for(int i=(num1-1);i>0;i--) {
			fatorial=fatorial*i;
		}
		return fatorial;
	}
	
	public double fatorialNum2() {
		double fatorial=num2;
		
		if(num2==0) {
			return 1;
		}
		for(int i=(num2-1);i>0;i--) {
			fatorial=fatorial*i;
		}
		return fatorial;
	}

	

}
