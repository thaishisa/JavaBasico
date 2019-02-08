package com.thais.cursojava.aula43.exercicios;

public class ContaBancaria {
	
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "ContaBancaria: \nNome do Cliente: " + nomeCliente + "\nNumero da Conta: " + numConta + "\nSaldo: R$" + saldo;
	}
	
	public void depositar(double deposito) {
		this.saldo=saldo+deposito;
		
	};
	
	public boolean sacar(double saque) {
		if ((saldo-saque)>=0){
			saldo=saldo-saque;
			return true;
		}else {
			return false;
		}	
	};
	

}
