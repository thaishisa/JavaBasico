package com.thais.cursojava.aula43.exercicios;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
	
	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	
	@Override
	public String toString() {
		String s="ContaPoupanca: \nDia do Rendimento: " + diaRendimento+ "\n";
		s+=super.toString();
		return s;
	}

	public boolean calcularNovoSaldo(double taxaRendimento) {
		
		Calendar hoje= Calendar.getInstance();
		if (diaRendimento==hoje.get(Calendar.DAY_OF_MONTH)) {
			//saldo+=saldo*taxaRendimento; mesma coisa que o debaixo, mas como nao consegue acessar diretamente o atributo do saldo acessa-se com o this ou super
			this.setSaldo(this.getSaldo()+(this.getSaldo()*taxaRendimento));
			return true;
		}
		return false;
	};

}
