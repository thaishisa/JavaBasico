package com.thais.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			System.out.println("i tem valor: "+i);
		}
		
		// System.out.println(i); vai dar erro pois a variável i foi criada apenas para ser utilizada
		// dentro do comando for
		
		for(int i=5; i>=0; i--) {
			System.out.println("i tem valor: "+i);
		}
		
		for(int i=0, j=10; i<j; i++, j--) {
			System.out.println("i tem valor: "+i+" j tem valor: "+j);
		}
		
		int count=0;
		for ( ;count<10; ) {
			System.out.println("valor de count: "+ count);
			count+=2;
		}
		
		for (int cont=0; cont< 10; cont+= 2) {
			System.out.println("valor de cont: "+ cont);
			cont+=2;
		}
		
		// somar 1+2+3+4+5 etc
		int soma = 0;
		for (int i=1; i<5; soma+= i++);
		System.out.println("O valor da soma é: "+soma);
		
		
		//se não tem as chaves "{}" o for executa somente o comando dado na linha abaixo dele com a condição
		//e a segunda linha ele não considera parte do bloco
		for (int i=0; i<5; i++)
			System.out.println("i tem valor: "+i);
			System.out.println("i tem valor: ");
		
		//já aqui ele executa as duas linhas abaixo da condição cada vez que elas passam pelo loop	
		for (int i=0; i<5; i++) {
			System.out.println("i tem valor: "+i);
			System.out.println("i tem valor: ");
		}
		
		

	}

}
