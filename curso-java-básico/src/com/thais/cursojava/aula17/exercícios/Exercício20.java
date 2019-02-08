package com.thais.cursojava.aula17.exercícios;

import java.util.Scanner;

public class Exercício20 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Quantas pessoas existem na turma? ");
		int quantidadePessoas=scan.nextInt();
		
		double soma=0;
		double media=0;
		
		for(int i=1; i<=quantidadePessoas;i++) {
			System.out.println("Pessoa "+i+" digite a sua idade: ");
			int idade=scan.nextInt();
			
			soma=idade+soma;
			media= soma/quantidadePessoas;
			
			
		}
		if (media>=0 && media<=25) {
			System.out.println("Essa turma é jovem");
			
		}else if (media>=26 && media<=60) {
			System.out.println("Essa turma é adulta");
		}else {
			System.out.println("Essa turma é idosa");
		}
	}
	
}