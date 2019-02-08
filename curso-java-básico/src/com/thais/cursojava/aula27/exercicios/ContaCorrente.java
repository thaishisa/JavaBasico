package com.thais.cursojava.aula27.exercicios;

public class ContaCorrente {
	
	String numConta;
	double saldo;
	String statusConta;
	double limite;
	
	double realizarSaque(double valorSaque) {
	
		if(valorSaque>saldo) {
			System.out.println("NAO HA SALDO PARA REALIZAR SAQUE");
		}else {
			System.out.println("O SAQUE FOI FEITO");
			saldo=saldo-valorSaque;
			
		}
		return saldo;	
		
	}
	double realizarDeposito(double valorDeposito) {
		
		if((saldo+valorDeposito)>limite) {
			System.out.println("O DEPOSITO NAO PODE SER FEITO");
			return saldo;
		}else {
	
		System.out.println("O DEPOSITO FOI FEITO");
		saldo=saldo+valorDeposito;
			
		return saldo;	
		}
	}
	void consultarSaldo() {
		System.out.println("O saldo da conta é: "+saldo);
	}
	
	void verificarStatus() {
		if(saldo<0) {
			System.out.println("A conta esta usando cheque especial");
		}else {
			System.out.println("A conta não é cheque especial");
		}// a verificacao se esta usando o cheque especial e se o saldo for <0  portanto o cheque especial se faz 
		//necessario
	}
	
	
}
