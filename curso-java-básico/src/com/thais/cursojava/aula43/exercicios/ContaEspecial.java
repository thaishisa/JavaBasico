package com.thais.cursojava.aula43.exercicios;

public class ContaEspecial extends ContaBancaria{

	private double limite;
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public String toString() {
		String s= "ContaEspecial: \nLimite: " + limite + "\n";
		s+=super.toString();
		return s;
		
	}

	public boolean sacar (double saque) {
		double saldoComLimite=this.getSaldo()+limite;
		
		if((saldoComLimite-saque>=0)) {
			this.setSaldo(this.getSaldo()-saque);
			return true;
		}
		return false;
		
		
		
	};
}