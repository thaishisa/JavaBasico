package com.thais.cursojava.aula20.exercícios;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][][] agendaCompromissos = new String[12][30][8];
		int dia;
		int hora;
		int mes;
		String agenda;

		for (int i = 0;; i++) {
			System.out.println("Agenda de compromissos pessoais!");

			System.out.println();

			System.out.println("Deseja agendar ou consultar um compromisso? ");
			agenda = scan.next();

			switch (agenda) {
			case "agendar":
				System.out.println("Deseja agendar o compromisso para qual mês do ano? ");
				mes = scan.nextInt();

				System.out.println("Deseja agendar o compromisso para qual dia? ");
				dia = scan.nextInt();

				System.out.println("Deseja agendar o compromisso para qual hora? ");
				hora = scan.nextInt();

				System.out.println("Digite o seu compromisso: ");
				String compromisso = scan.next();

				agendaCompromissos[(mes - 1)][(dia - 1)][(hora - 1)] = compromisso;

				System.out.println();

				break;

			case "consultar":
				System.out.println("Deseja consultar o compromisso de qual mês do ano? ");
				mes = scan.nextInt();

				System.out.println("Deseja consultar o compromisso de qual dia? ");
				dia = scan.nextInt();

				System.out.println("Deseja consultar o compromisso de qual hora? ");
				hora = scan.nextInt();

				System.out.println("Compromisso do mês " + mes + " dia " + dia + " hora " + hora + " : "
						+ agendaCompromissos[(mes - 1)][(dia - 1)][(hora - 1)]);

				System.out.println();

				break;
			}

			/*
			 * for(int j=0; j<agendaCompromissos.length;j++) { for (int k=0;
			 * k<agendaCompromissos[j].length;k++) {
			 * System.out.print(agendaCompromissos[j][k]+" "); } System.out.println(); }
			 * System.out.println();
			 */
		}
	}

}