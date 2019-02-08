package com.thais.cursojava.aula43;

import java.util.Arrays;

public class Aluno  {
	
	private String curso;
	private double[] notas;
	
	public Aluno() {
		super();
	
	}
	
	public Aluno(String nome, String endereco, String telefone) {
		//super(nome, endereco, telefone);
		
		this.curso=curso;
	
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public void metodoQualquer() {
		//super.setCpf(cpf);
		//this.setCpf(cpf);
	}
	
	public String obterEtiquetaEndereco() {
	 
		String s= "Endereco do aluno: \n";
		//s+=this.getEndereco();
		
		return s;
	}

	//@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Imprimindo endereço do aluno");
		System.out.println(this.obterEtiquetaEndereco());
		
	}

	/*public String toString() {
		
		String s= curso + "\n";
		for (int i=0;i<notas.length;i++) {
			s+=notas[i]+ " ";
		}
		
		return s;
	}*/
	
		@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Aluno other = (Aluno) obj;
			
			if(curso.equalsIgnoreCase(other.getCurso())) {
				return true;
			}
			return false;
		}
		
		

}
