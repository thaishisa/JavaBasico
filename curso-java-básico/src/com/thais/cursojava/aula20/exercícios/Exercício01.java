package com.thais.cursojava.aula20.exercícios;

public class Exercício01 {

	public static void main(String[] args) {

		int[][] m = new int[4][4];
		int maior = Integer.MIN_VALUE;
		int linhaMaior = 0;
		int colunaMaior = 0;

		// outra forma de gerar números aleatorios:
		// Random numeroRandom = new Random ();
		// dentro do for fica:
		// m[i][j]=numeroRandom.nextInt(9);

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) Math.round(Math.random() * 9);
			}
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {

				System.out.print(m[i][j] + " ");

				if (m[i][j] > maior) {
					maior = m[i][j];
					linhaMaior = i;
					colunaMaior = j;
				}
			}
			System.out.println();
		}
		System.out.println("O maior valor é " + maior + " e sua respectiva posição é linha " + linhaMaior + " coluna "
				+ colunaMaior);

	}

}
