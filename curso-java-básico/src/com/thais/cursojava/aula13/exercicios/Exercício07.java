package com.thais.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exerc�cio07 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado: ");
		double ladoQuadrado= scan.nextDouble();
		
		//double areaQuadrado= ladoQuadrado*ladoQuadrado;
		double areaQuadrado= Math.pow(ladoQuadrado, 2);
		System.out.println("A �rea do quadrado �: "+areaQuadrado);
		System.out.println("O dobro da �rea do quadrado �: "+areaQuadrado*2);
		
	}

}
