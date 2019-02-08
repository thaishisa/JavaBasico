package com.thais.cursojava.aula20.exercícios;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][] jogoDaVelha = new String[3][3];
		int linha;
		int coluna;
		String simbolo;
		int jogador = 0;
		int empate = 0;

		for (int i = 0; i < jogoDaVelha.length; i++) {
			for (int j = 0; j < jogoDaVelha[i].length; j++) {
				System.out.print(jogoDaVelha[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= 2; i++) {
			System.out.println("Jogador " + i + " digite a linha onde deseja colocar o X ou O: ");
			linha = scan.nextInt();

			while (linha > 3 || linha < 1) {
				System.out.println("Jogador " + i + " digite novamente a linha onde deseja colocar o X ou O: ");
				linha = scan.nextInt();

			}
			System.out.println("Jogador " + i + " digite a coluna onde deseja colocar o X ou O: ");
			coluna = scan.nextInt();

			while (coluna > 3 || coluna < 1) {
				System.out.println("Jogador " + i + " digite novamente a coluna onde deseja colocar o X ou O: ");
				coluna = scan.nextInt();

			}

			System.out.println("Jogador " + i + " digite o seu símbolo: ");
			simbolo = scan.next();

			while (!simbolo.equalsIgnoreCase("X") && !simbolo.equalsIgnoreCase("O")) {
				System.out.println("Jogador " + i + " digite novamente o seu símbolo: ");
				simbolo = scan.next();
			}

			while (jogoDaVelha[(linha - 1)][(coluna - 1)] != null) {

				System.out.println("Jogador " + i + " digite novamente a linha onde deseja colocar o X ou O: ");
				linha = scan.nextInt();

				while (linha > 3 || linha < 1) {
					System.out.println("Jogador " + i + " digite novamente a linha onde deseja colocar o X ou O: ");
					linha = scan.nextInt();

				}

				System.out.println("Jogador " + i + " digite novamente a coluna onde deseja colocar o X ou O: ");
				coluna = scan.nextInt();

				while (coluna > 3 || coluna < 1) {
					System.out.println("Jogador " + i + " digite novamente a coluna onde deseja colocar o X ou O: ");
					coluna = scan.nextInt();

				}

				System.out.println("Jogador " + i + " digite novamente o seu símbolo: ");
				simbolo = scan.next();

				while (!simbolo.equalsIgnoreCase("X") && !simbolo.equalsIgnoreCase("O")) {
					System.out.println("Jogador " + i + " digite novamente o seu símbolo: ");
					simbolo = scan.next();
				}
			}

			jogoDaVelha[(linha - 1)][(coluna - 1)] = simbolo;

			for (int j = 0; j < jogoDaVelha.length; j++) {
				for (int k = 0; k < jogoDaVelha[j].length; k++) {
					System.out.print(jogoDaVelha[j][k] + " ");

				}
				System.out.println();
			}

			System.out.println();

			if (("X".equalsIgnoreCase(jogoDaVelha[0][0]) && "X".equalsIgnoreCase(jogoDaVelha[0][1])
					&& "X".equalsIgnoreCase(jogoDaVelha[0][2]))
					|| ("O".equalsIgnoreCase(jogoDaVelha[0][0]) && "O".equalsIgnoreCase(jogoDaVelha[0][1])
							&& "O".equalsIgnoreCase(jogoDaVelha[0][2]))) {
				jogador = i;
				break;
			} else if (("X".equalsIgnoreCase(jogoDaVelha[1][0]) && "X".equalsIgnoreCase(jogoDaVelha[1][1])
					&& "X".equalsIgnoreCase(jogoDaVelha[1][2]))
					|| ("O".equalsIgnoreCase(jogoDaVelha[1][0]) && "O".equalsIgnoreCase(jogoDaVelha[1][1])
							&& "O".equalsIgnoreCase(jogoDaVelha[1][2]))) {
				jogador = i;
				break;
			} else if (("X".equalsIgnoreCase(jogoDaVelha[2][0]) && "X".equalsIgnoreCase(jogoDaVelha[2][1])
					&& "X".equalsIgnoreCase(jogoDaVelha[2][2]))
					|| ("O".equalsIgnoreCase(jogoDaVelha[2][0]) && "O".equalsIgnoreCase(jogoDaVelha[2][1])
							&& "O".equalsIgnoreCase(jogoDaVelha[2][2]))) {
				jogador = i;
				break;
			} else if (("X".equalsIgnoreCase(jogoDaVelha[0][0]) && "X".equalsIgnoreCase(jogoDaVelha[1][0])
					&& "X".equalsIgnoreCase(jogoDaVelha[2][0]))
					|| ("O".equalsIgnoreCase(jogoDaVelha[0][0]) && "O".equalsIgnoreCase(jogoDaVelha[1][0])
							&& "O".equalsIgnoreCase(jogoDaVelha[2][0]))) {
				jogador = i;
				break;
			} else if (("X".equalsIgnoreCase(jogoDaVelha[0][1]) && "X".equalsIgnoreCase(jogoDaVelha[1][1])
					&& "X".equalsIgnoreCase(jogoDaVelha[2][1]))
					|| ("O".equalsIgnoreCase(jogoDaVelha[0][1]) && "O".equalsIgnoreCase(jogoDaVelha[1][1])
							&& "O".equalsIgnoreCase(jogoDaVelha[2][1]))) {
				jogador = i;
				break;
			} else if (("X".equalsIgnoreCase(jogoDaVelha[0][2]) && "X".equalsIgnoreCase(jogoDaVelha[1][2])
					&& "X".equalsIgnoreCase(jogoDaVelha[2][2]))
					|| ("O".equalsIgnoreCase(jogoDaVelha[0][2]) && "O".equalsIgnoreCase(jogoDaVelha[1][2])
							&& "O".equalsIgnoreCase(jogoDaVelha[2][2]))) {
				jogador = i;
				break;
			} else if (("X".equalsIgnoreCase(jogoDaVelha[0][0]) && "X".equalsIgnoreCase(jogoDaVelha[1][1])
					&& "X".equalsIgnoreCase(jogoDaVelha[2][2]))
					|| ("O".equalsIgnoreCase(jogoDaVelha[0][0]) && "O".equalsIgnoreCase(jogoDaVelha[1][1])
							&& "O".equalsIgnoreCase(jogoDaVelha[2][2]))) {
				jogador = i;
				break;
			} else if (("X".equalsIgnoreCase(jogoDaVelha[0][2]) && "X".equalsIgnoreCase(jogoDaVelha[1][1])
					&& "X".equalsIgnoreCase(jogoDaVelha[2][0]))
					|| ("O".equalsIgnoreCase(jogoDaVelha[0][2]) && "O".equalsIgnoreCase(jogoDaVelha[1][1])
							&& "O".equalsIgnoreCase(jogoDaVelha[2][0]))) {
				jogador = i;
				break;
			}

			if (i == 2) {
				i = 0;
			}

			empate++;
			if (empate == 9) {
				System.out.println("Deu empate!!");
				jogador = 0;
				break;
			}
		}

		System.out.println("O jogador " + jogador + " venceu!");
	}

}

// não deixar jogador 1 e jogador 2 usarem a mesma figura
