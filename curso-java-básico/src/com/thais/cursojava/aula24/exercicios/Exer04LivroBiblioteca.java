package com.thais.cursojava.aula24.exercicios;

import java.util.Date;

public class Exer04LivroBiblioteca {

	public static void main(String[] args) {
	
		LivroBiblioteca livro= new LivroBiblioteca();
		
		livro.titulo= "Crime e castigo";
		livro.autor= "Dostoievsky";
		livro.emprestado=true;
		livro.dataEntrega=new Date();
		livro.emprestadoA="Thais";
		
		System.out.println(livro.titulo);
		System.out.println(livro.emprestadoA);

	}

}
