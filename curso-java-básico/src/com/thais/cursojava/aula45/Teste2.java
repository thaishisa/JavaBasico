package com.thais.cursojava.aula45;

public class Teste2 {

	public static void main(String[] args) {
		
		//OK: RETORNO DO METODO PODE REFERENCIAR STRING
		Object obj1= obterString();
		String s1=(String)obj1;
		
		//OK: REFERENCIA STRING EXPLICITAMENTE
		Object obj2="Minha String";
		String s2= (String) obj2;
		
		//FALHA: NAO REFERENCIA STRING
		Object obj3=new Object();
		String s3=(String) obj3;//nao funciona e o mesmo downcasting do primeiro teste

		//FALHA: NUNCA REFERENCIA STRING JA QUE O RETORNO DO METODO E INT
		Object obj4=obterInteiro();
		String s4=(String) obj4;//nao funciona esta tentando fazer downcasting de um tipo inteiro e transformar em String
	}
	
	public static String obterString() {
		return "Minha String";
	}
	
	public static int obterInteiro() {
		return 1;
	}

}
