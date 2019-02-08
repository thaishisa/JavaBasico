package com.thais.cursojava.aula36.exercicios;

public class Agenda {
	
	private String nomeAgenda;
	private Contato[] contatos;
	
	public String getNomeAgenda() {
		return nomeAgenda;
	}
	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}
	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	public Agenda() {
		
	}
	
	public Agenda(String nomeAgenda, Contato[] contatos) {
		super();
		this.nomeAgenda = nomeAgenda;
		this.contatos = contatos;
	}
	
	public String obterInfo() {
		String info= "Nome= "+ nomeAgenda+ "\n";
		if (contatos!=null) {
			for(int i=0; i<contatos.length;i++) {
				info+=contatos[i].obterInfo()+ "\n";
			}
		}
		
		return info;
	}
	
	
	

}
