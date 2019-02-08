package com.thais.cursojava.aula29;


public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		
		van.marca= "Fiat";
		van.modelo="Ducato";
		//van.numPassageiros= 10;
		van.capCombustivel= 30;
		van.conCombustivel=0.15;
		
		System.out.println("Numero de passageiros: "+van.numPassageiros);
		
		Carro van2= new Carro("Fiat", "Ducato", 10,100,0.2);
		
		System.out.println(van2.marca);

		System.out.println(van2.modelo);

		System.out.println(van2.numPassageiros);

		System.out.println(van2.capCombustivel);

		System.out.println(van2.conCombustivel);
		
		}
	}

