package com.thais.cursojava.aula43.exercicios;

public class PessoaJuridica extends Contribuinte{
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		
		return this.getRendaBruta()*0.1;
		//return (this.getRendaBruta()*10)/100;
	}

	@Override
	public String toString() {
		String s= "Pessoa Juridica: \n"+super.toString()+ "\n";
		s+="CNPJ: " + cnpj;
		s+="\nImposto a ser pago: "+calcularImposto();
		return s;
		
	}
	
	
	
	

}
