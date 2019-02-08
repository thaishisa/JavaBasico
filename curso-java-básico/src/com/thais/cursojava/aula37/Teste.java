package com.thais.cursojava.aula37;

public class Teste {

	public static void main(String[] args) {
		
		/*Aluno aluno = new Aluno();
		
		Professor professor= new Professor();
		
		Pessoa pessoa= new Pessoa();
		
		aluno.setNome("THAIS");
		*/
		//professor.setTelefoneCelular(telefoneCelular);
		
		Pessoa aluno= new Aluno(); //<<< quando eu faço isso o objeto aluno somente
		//acessara as informacoes que sao comuns aos do tipo pessoa
		//portanto nao tera acesso as informacoes especificas do aluno
		
		Pessoa professor= new Professor();
		
		

	}

}
