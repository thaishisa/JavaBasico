package com.thais.cursojava.aula20.exercícios;

public class Exercício02 {

	public static void main(String[] args) {

		int[][] m = new int[10][10];
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int maior2 = Integer.MIN_VALUE;
		int menor2 = Integer.MAX_VALUE;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) Math.round(Math.random() * 9);
			}
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {

				System.out.print(m[i][j] + " ");
			}

			System.out.println();
		}

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				// eu poderia colocar só o for debaixo:
				// for (int j=0; j<m[5].length; j++)
				if (m[5][j] > maior) {
					maior = m[5][j];

				}
				if (m[5][j] < menor) {
					menor = m[5][j];
				}
			}
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				// poderia fazer:
				// for(int i=0;i<m.length;i++) {
				// if(m[i][7]>maior2) {
				if (j == 7) {
					if (m[i][j] > maior2) {
						maior2 = m[i][j];
					}
					if (m[i][j] < menor2) {
						menor2 = m[i][j];
					}
				}
			}

		}
		System.out.println("O maior valor da linha 5 é " + maior + " e o menor valor da linha 5 é " + menor);
		System.out.println("O maior valor da coluna 7 é " + maior2 + " e o menor valor da coluna 7 é " + menor2);
	}
}