package com.thais.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno= new Aluno();
		
		aluno.setCurso("Ciencia da Computacao");
		
		double[] notas= {10, 9, 8, 7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		String s1="abcdef";
		String s2="abcdeF";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		Aluno aluno2=new Aluno();
		
		aluno2.setCurso("Ciencia da Computacao");
		
		double[] notas2= {9, 9, 5, 7};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));
		
	
	}

}
