package com.thais.cursojava.aula27.exercicios;

public class Exer02ContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta1= new ContaCorrente();
		
		conta1.numConta="000190-7";
		conta1.saldo=100.00;
		conta1.statusConta="especial";
		conta1.limite=2000.00;
		
		conta1.consultarSaldo();
		conta1.verificarStatus();
		conta1.realizarDeposito(2000);
		conta1.realizarDeposito(250);
		conta1.consultarSaldo();
		conta1.realizarSaque(400);
		conta1.realizarSaque(170);
		conta1.consultarSaldo();
	}

}
