package com.thais.cursojava.aula43.exercicios;

public class TesteConta {

	public static void main(String[] args) {
		
		System.out.println("*** Teste Conta Bancaria***");
		
		ContaBancaria contaSimples= new ContaBancaria();
		
		contaSimples.setNomeCliente("Seila");
		contaSimples.setNumConta("1111");
		
		contaSimples.depositar(100);
	
		realizarSaque(contaSimples, 50);
		realizarSaque(contaSimples, 70);
		
		System.out.println(contaSimples);
		
		System.out.println("*** Teste Conta Poupanca***");
		
		ContaPoupanca contaPoupanca= new ContaPoupanca();
		
		contaPoupanca.setNomeCliente("Seila");
		contaPoupanca.setNumConta("22222");
		contaPoupanca.setDiaRendimento(4);
		
		contaPoupanca.depositar(100);
	
		realizarSaque(contaPoupanca, 50);
		realizarSaque(contaPoupanca, 70);
		
		if(contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Novo rendimento aplicado, novo saldo e de: "+contaPoupanca.getSaldo());
		}else {
			System.out.println("Hoje nao e dia de rendimento, novo saldo nao calculado");
		}
		
		System.out.println(contaPoupanca);
		
		System.out.println("*** Teste Conta Especial***");
		
		ContaEspecial contaEspecial= new ContaEspecial();
		
		contaEspecial.setNomeCliente("Seila");
		contaEspecial.setNumConta("333333");
		contaEspecial.setLimite(50);
		
		contaEspecial.depositar(100);
	
		realizarSaque(contaEspecial, 50);
		realizarSaque(contaEspecial, 70);
		realizarSaque(contaEspecial,80);
		
		System.out.println(contaEspecial);
	}

	public static void realizarSaque (ContaBancaria conta, double saque) {//para utilizar a conta poupanca e especial nao e necessario mudar o atributo ContaBancaria conta, pq ambas as classe estendem a ContaBancaria
		
		if(conta.sacar(saque)) {
			System.out.println("Saque Efetuado com sucesso! Novo saldo: "+ conta.getSaldo());	
		}else {
			System.out.println("Saldo insuficiente para saque de: "+saque+" ; saldo de : "+conta.getSaldo());
		}
		
	}
}
