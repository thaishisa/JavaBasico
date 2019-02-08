package com.thais.cursojava.aula33.exercicios;

public class ContaCorrente {
	
	private String numero;
	private String agencia;
	private boolean especial;
	private double limiteEspecial;
	private double saldo;
	
	
	
	public ContaCorrente() {
	}
	
	public ContaCorrente(String numero, String agencia, boolean especial, double limiteEspecial, double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.especial = especial;
		this.limiteEspecial = limiteEspecial;
		this.saldo = saldo;
	}

	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public boolean isEspecial() {
		return especial;
	}
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	public double getLimiteEspecial() {
		return limiteEspecial;
	}
	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	public double getSaldo() { //consultarSaldo
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double deposito) {
		saldo=saldo+deposito;
	}
	
	public boolean verificarUsoChequeEspecial() {
		return saldo<0;
	}
	
	public boolean saque(double saque) {
		if(saldo>=saque) {
			saldo=saldo-saque;
			return true;
		}else {
			if(especial) {
				double limite=limiteEspecial+saldo;
				if(limite>=saque) {
					saldo=saldo-saque;
					return true;
				}else {
					return false;
				}
			}else {
				return false;
			}
		}
	}
	
	

}
