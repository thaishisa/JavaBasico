package com.thais.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
	//programa que conta de um at� dez (se fosse pra come�ar de outro n�mero o valor de i mudaria e se fosse pra ir at� outro n�mero o valor de max mudaria
		int i= 1; // count ou cont
		int max = 10;
				
		System.out.println("Contando at� "+max);
		
		while (i<= max) {
			System.out.println("Valor de i: "+i);
			i++; // i = i + 1; ou i += 1;
		}
		
		System.out.println("O que est� fora do banco e valor de i= "+i); //valor de 11
		
		// o do while vai primeiro executar o bloco e depois verificar� a express�o
		do {
			i++;
			System.out.println("Valor de i: "+i);
		}while (i<15);
		
		System.out.println("O que est� fora do banco e valor de i= "+i);
	}

}
