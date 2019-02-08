package com.thais.cursojava.aula43.exercicios;

public class TesteZoo {

	public static void main(String[] args) {
		
		System.out.println("Zoo: \n----------------");
		
		Animal camelo= new Animal();
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidade(2);
		
		Peixe tubarao=new Peixe();
		tubarao.setNome("Tubarao");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(1.5);
		
		Mamifero urso=new Mamifero();
		urso.setNome("Urso-do-Canada");
		urso.setComprimento(180);
		urso.setCor("Vermelho");
		urso.setVelocidade(0.5);
		
		Animal[] animais= new Animal[3];
		animais[0]=camelo;
		animais[1]=tubarao;
		animais[2]=urso;
		for(int i=0; i<animais.length;i++) {
			System.out.println(animais[i].toString());
			System.out.println("----------------");
		}
		
		
		

	}

}
