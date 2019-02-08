package com.thais.cursojava.aula33.exercicios;

public class Exercicio02 {

	public static void main(String[] args) {
		ContaCorrente conta= new ContaCorrente();
		//ou ja inicializar o construtor com todos os parametros
		conta.setNumero("123456");
		conta.setAgencia("1234");
		conta.setEspecial(true);
		conta.setLimiteEspecial(500);
		conta.setSaldo(-50);
		
		System.out.println("O saldo da conta "+conta.getNumero()+" é: R$"+conta.getSaldo());
		
		boolean saqueEfetuado= conta.saque(10);
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			System.out.println("O saldo da conta é: R$"+conta.getSaldo());
		}else {
			System.out.println("Nao foi possivel realizar saque, saldo insuficiente");
		}
		
		saqueEfetuado=conta.saque(500);
		System.out.println("Tentativa de saque de 500 reais");
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			System.out.println("O saldo da conta é: R$"+conta.getSaldo());
		}else {
			System.out.println("Nao foi possivel realizar saque, saldo insuficiente");
		}
		
		if(conta.verificarUsoChequeEspecial()) {
			System.out.println("Esta usando cheque especial" );
		}else {
			System.out.println("Nao esta usando cheque especial");
		}
		

	}

}
