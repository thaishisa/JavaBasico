package com.thais.cursojava.aula45;

public class Teste {

	public static void main(String[] args) {
		
		/*Aluno aluno=new Aluno();
		Pessoa pessoaAluno=aluno;//upcasting
		
		Pessoa aluno2= (Pessoa)new Aluno();// (Pessoa) <- isso e conversao no JAVA upcasting manual
		
		Pessoa aluno3= new Pessoa();
		Aluno aluno4=(Aluno) aluno3;//vai dar erro nem sempre o Downcasting pode ser feito devido aos atributos
		//que diferem da superclasse e da subclasse
		*/
		
		Pessoa pessoa=new Pessoa();
		Aluno aluno=new Aluno();
		Professor prof=new Professor();
		
		if(pessoa instanceof Pessoa) {
			System.out.println("E DO TIPO PESSOA");
		}
		if(aluno instanceof Aluno) {
			System.out.println("E DO TIPO ALUNO");
		}
		if(prof instanceof Professor) {
			System.out.println("E DO TIPO PROFESSOR");
		}
		
		
		
	}

}
