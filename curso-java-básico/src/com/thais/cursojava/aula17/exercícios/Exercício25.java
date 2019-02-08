package com.thais.cursojava.aula17.exercícios;

import java.util.Scanner;

public class Exercício25 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lojas Tabajara");
		
		double soma=0;
		
		for (int i=1; ;i++) {
			System.out.print("Produto "+i+": R$ ");
			double valorProduto= scan.nextDouble();
			
			if(valorProduto==0) {
				double valorFinal=soma;
				i=0;
				
				System.out.println("Total: R$"+valorFinal);
				System.out.print("Dinheiro: R$");
				double pagamento=scan.nextDouble();
				double troco=pagamento-valorFinal;
				
				if (troco<0) {
					System.out.println("Troco: Falta dinheiro R$"+troco);
				}else if (troco==0) {
					System.out.println("Troco: Não precisa de troco");
				}else {
					System.out.println("Troco: R$"+troco);
				}
				soma=0;
				System.out.println("Nova compra! \nLojas Tabajara");
			}
			soma=soma+valorProduto;
		}

	}

}
