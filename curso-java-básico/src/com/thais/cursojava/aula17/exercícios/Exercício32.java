package com.thais.cursojava.aula17.exercícios;

import java.util.Scanner;

public class Exercício32 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Especificação          Código          Preço");
		System.out.println("Cachorro Quente        100             R$1,20");
		System.out.println("Bauru Simples          101             R$1,30");
		System.out.println("Bauru com ovo          102             R$1,50");
		System.out.println("Hambúrguer             103             R$1,20");
		System.out.println("Cheeseburguer          104             R$1,30");
		System.out.println("Regrigerante           105             R$1,00");
		
		double soma=0;

		double valorItem1= 0;
	
		double valorItem2= 0;
	
		double valorItem3= 0;
	
		double valorItem4= 0;
	
		double valorItem5= 0;

		double valorItem6= 0;
		
		for(int i=0;;i++) {
			
			System.out.println("\nInsira aqui o código do item: ");
			int codigo=scan.nextInt();
			
			System.out.println("Insira aqui a quantidade pedida: ");
			int quantidade=scan.nextInt();
			
			switch (codigo){
			case 100:
				valorItem1= quantidade*1.20;
				System.out.println("Cachorro Quente R$1,20 Qtd."+quantidade+" = R$"+valorItem1);
				soma=soma+valorItem1;
				valorItem1=0; break;
			case 101:
				valorItem2= quantidade*1.30;
				System.out.println("Bauru Simples R$1,30 Qtd."+quantidade+" = R$"+valorItem2);
				soma=soma+valorItem2;
				valorItem2=0;break;
			case 102:
				 valorItem3= quantidade*1.50;
				 System.out.println("Bauru com ovo R$1,50 Qtd."+quantidade+" = R$"+valorItem3);
				 soma=soma+valorItem3;
				 valorItem3=0;break;
			case 103:
				 valorItem4= quantidade*1.20;
				 System.out.println("Hambúrguer R$1,20 Qtd."+quantidade+" = R$"+valorItem4);
				 soma=soma+valorItem4;
				 valorItem4=0;break;
			case 104:
				 valorItem5= quantidade*1.30;
				 System.out.println("Cheesebúrguer R$1,30 Qtd."+quantidade+" = R$"+valorItem5);
				 soma=soma+valorItem5;
				 valorItem5=0;break;
			case 105:
				 valorItem6= quantidade*1.00;
				 System.out.println("Refrigerante R$1,00 Qtd."+quantidade+" = R$"+valorItem6);
				 soma=soma+valorItem6;
				 valorItem6=0;break;
			}
			
			if (codigo==0) {
				System.out.println("Valor total:  R$"+soma);
			}
			
			
		}

	}

}
