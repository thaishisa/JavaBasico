package com.thais.cursojava.aula43.exercicios;

public class Peixe extends Animal{
	
	private String caracteristicas;
	
	public Peixe() {
		super();
		this.setNumPatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cinzenta");
		this.caracteristicas="Barbatanas e cauda";
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		
		String s= super.toString();
		s+="\nCaracteristicas: " + caracteristicas;
		return s;
	}
	
	

}
