package com.thais.cursojava.aula20.exerc�cios;

import java.util.Scanner;

public class Exerc�cio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] m = new int[3][3];
		int numPares = 0;
		int numImpares = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println("Digite os valores da matriz: " + i);
				m[i][j] = scan.nextInt();
			}
			System.out.println();
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");

				if (m[i][j] % 2 == 0) {
					numPares++;
				} else {
					numImpares++;
				}
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("H� " + numPares + " n�meros pares");
		System.out.println("H� " + numImpares + " n�meros �mpares");
	}

}
