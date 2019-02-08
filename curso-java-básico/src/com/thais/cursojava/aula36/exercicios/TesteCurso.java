package com.thais.cursojava.aula36.exercicios;

import java.util.Scanner;

public class TesteCurso {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite o nome do curso: ");
		String nomeCurso=scan.nextLine();
		
		System.out.println("Digite o horario do curso: ");
		String horario=scan.nextLine();
		
		System.out.println("Digite o nome do professor: ");
		String nomeProfessor=scan.nextLine();
		
		System.out.println("Digite o departamento do professor: ");
		String departamento=scan.nextLine();
		
		System.out.println("Digite o email do professor: ");
		String email=scan.nextLine();
		
		
		Curso curso1=new Curso();
		
		curso1.setNomeCurso(nomeCurso);
		curso1.setHorario(horario);
		
		Professor professor1=new Professor();
		
		professor1.setNomeProfessor(nomeProfessor);
		professor1.setDepartamento(departamento);
		professor1.setEmail(email);
		
		curso1.setProfessor(professor1);
		
		System.out.println("---------Alunos---------");
		
		
		Aluno[] alunos=new Aluno[5];
		
		for (int i=0;i<alunos.length;i++) {
			
			scan.nextLine();
			
			System.out.println("Entre com as informacoes do aluno "+(i+1));
			
 			Aluno aluno=new Aluno();
			
			System.out.println("Entre com o nome: ");
			String nome=scan.nextLine();
			aluno.setNomeAluno(nome);
 			
			System.out.println("Entre com o numero da matricula: ");
			String matricula=scan.nextLine();
			aluno.setMatricula(matricula);
			
			double[] notas= new double[4];
			
			for (int j=0;j<notas.length;j++) {
				System.out.println("Digite a nota "+ (j+1)+" :");
				notas[j]=scan.nextDouble();
			}
			aluno.setNotas(notas);
			
			alunos[i]=aluno;
				
			
		}
		
		curso1.setAlunos(alunos);
		System.out.println(curso1.obterInfo());
	}

}
