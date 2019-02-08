package com.thais.cursojava.aula43.exercicios;

public class TesteImposto {

	public static void main(String[] args) {
		
		PessoaFisica pf1= new PessoaFisica();
		pf1.setNome("Contr 1");
		pf1.setRendaBruta(1000);
		pf1.setCpf("544545");
		
		PessoaJuridica pj2= new PessoaJuridica();
		pj2.setNome("Contr 2");
		pj2.setRendaBruta(5000);
		pj2.setCnpj("545435345");
		
		PessoaFisica pf3= new PessoaFisica();
		pf3.setNome("Contr 3");
		pf3.setRendaBruta(2000);
		pf3.setCpf("5645656456");
		
		PessoaJuridica pj4= new PessoaJuridica();
		pj4.setNome("Contr 4");
		pj4.setRendaBruta(3000);
		pj4.setCnpj("4765765");
		
		PessoaFisica pf5= new PessoaFisica();
		pf5.setNome("Contr 5");
		pf5.setRendaBruta(3700);
		pf5.setCpf("23665466");
		
		PessoaJuridica pj6= new PessoaJuridica();
		pj6.setNome("Contr 6");
		pj6.setRendaBruta(4000);
		pj6.setCnpj("145647756");
		
		Contribuinte[] contribuintes=new Contribuinte[6];
		contribuintes[0]=pf1;
		contribuintes[1]=pj2;
		contribuintes[2]=pf3;
		contribuintes[3]=pj4;
		contribuintes[4]=pf5;
		contribuintes[5]=pj6;
		
		for (int i=0;i<contribuintes.length;i++) {
			System.out.println(contribuintes[i].toString());
			System.out.println();
		}
	}

}
