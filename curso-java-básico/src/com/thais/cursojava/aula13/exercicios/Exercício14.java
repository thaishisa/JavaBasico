package com.thais.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercício14 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite o tamanho do arquivo para download: ");
		int tamanhoArquivo= scan.nextInt();
		
		System.out.println("Digite a velocidade do Link de Internet: ");
		int velocidadeLink= scan.nextInt();
		
		double tempoDownload= (tamanhoArquivo/velocidadeLink)/60;
		System.out.println("O tempo do download em minutos é: "+tempoDownload);

	}

}
