package com.thais.cursojava.aula17.exerc�cios;

import java.util.Scanner;

public class Exerc�cio21 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Quantas turmas existem na escola? ");
		int quantidadeTurmas=scan.nextInt();
		
		double soma=0;
		double media=0;
		
		for (int i=1; i<=quantidadeTurmas; i++) {
			System.out.println("Digite a quantidade de alunos da turma "+i+": ");
			int quantidadeAlunos=scan.nextInt();
			
			while(quantidadeAlunos>40) {
				System.out.println("N�mero de alunos inv�lido, digite novamente! ");
				System.out.println("Digite a quantidade de alunos da turma "+i+": ");
				quantidadeAlunos=scan.nextInt();
			}
			soma=soma+quantidadeAlunos;
			media=soma/quantidadeTurmas;
			
				
		}
		
		System.out.println("A m�dia de alunos por turma �: "+media);
		
	}
	
}