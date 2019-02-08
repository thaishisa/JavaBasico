package com.thais.cursojava.aula27.exercicios;

import java.util.Scanner;

public class Exer03Aluno {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		double[] nota= new double[3];
		String[] disciplina= new String [3];
		
		
		Aluno aluno1= new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		aluno1.nome=scan.nextLine();
		
		System.out.println("Digite o curso do aluno: ");
		aluno1.curso=scan.nextLine();
		
		System.out.println("Digite a matricula do aluno: ");
		aluno1.matricula=scan.nextInt();
		
		aluno1.disciplinas= new String [3]; //ou instanciar na classe aluno msm String[] disciplinas= new String [3]
		
		for(int i=0; i<aluno1.disciplinas.length;i++) {
		
		System.out.println("Digite a disciplina "+(i+1)+" :");
		aluno1.disciplinas[i]=scan.nextLine();
		
		}
		
		aluno1.notas= new double[3][4];
		
		for(int i=0; i<aluno1.notas.length;i++) {
			
			System.out.println("Obtendo notas da disciplina "+aluno1.disciplinas[i]);
			for(int j=0;j<aluno1.notas[i].length;j++) {
			
			System.out.println("Digite a nota "+(j+1)+" :");
			aluno1.notas[i][j]=scan.nextDouble();
			
			}	
		}
		aluno1.mostrarInfo();
		
		for (int i=0;i<aluno1.disciplinas.length;i++) {
			if (aluno1.verificarAprovado(i)) {
				System.out.println("APROVADO");
			}else {
				System.out.println("REPROVADO");
			}
		}
	}

}
