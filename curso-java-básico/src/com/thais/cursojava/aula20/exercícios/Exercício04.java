package com.thais.cursojava.aula20.exercícios;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][] agendaCompromissos = new String[31][24];
		int dia;
		int hora;
		String agenda;

		for (int i = 0;; i++) {
			System.out.println("Agenda de compromissos pessoais!");

			System.out.println();

			System.out.println("Deseja agendar ou consultar um compromisso ou sair? ");
			agenda = scan.next();

			switch (agenda) {
			case "agendar":
				System.out.println("Deseja agendar o compromisso para qual dia? ");
				dia = scan.nextInt();

				System.out.println("Deseja agendar o compromisso para qual hora? ");
				hora = scan.nextInt();

				System.out.println("Digite o seu compromisso: ");
				String compromisso = scan.next();

				agendaCompromissos[(dia - 1)][(hora - 1)] = compromisso;

				System.out.println();

				break;

			case "consultar":
				System.out.println("Deseja consultar o compromisso de qual dia? ");
				dia = scan.nextInt();

				System.out.println("Deseja consultar o compromisso de qual hora? ");
				hora = scan.nextInt();

				System.out.println("Compromisso do dia " + dia + " hora " + hora + " : "
						+ agendaCompromissos[(dia - 1)][(hora - 1)]);

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
