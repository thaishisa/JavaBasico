package com.thais.cursojava.aula36.exercicios;

public class Aluno {
	
	private String nomeAluno;
	private String matricula;
	private double[] notas;
	
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	 public String obterInfo() {
		 String info= "Nome do Aluno: "+nomeAluno+ "; ";
		 info+= "Matricula = "+ matricula +"; ";
		 info+="Notas: ";
		 
		 double soma=0;
		 for (double nota: notas) {
			 soma+= nota;
			 info+= nota + " ";
		 }
		 
		 double media= soma/4;
		 info+="\n"+ "Média: "+ media+ "-";
		 if(media >=7) {
			 info+="Aprovado";
		 }else {
			 info+="Reprovado";
		 }
		 
		 return info  ;
	 }
	 
	 public double obterMedia() {
		 
		 double soma=0;
		 
		 for (double nota: notas) {
			 soma+= nota;
			 
		 }
		 return soma/4;
		 
	 }

	

	
	

}
