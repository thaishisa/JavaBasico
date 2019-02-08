package com.thais.cursojava.aula35;

public class Calculadora {

	public static double fatorialNaoRecursivo(int num) {
		double fatorial=num;
		
		if(num==0) {
			return 1;
		}
		for(int i=(num-1);i>0;i--) {
			fatorial=fatorial*i;
		}
		return fatorial;
	}
	//fatorial(5)=5* fatorial(4)
	//fatorial(4)=4* fatorial(3)
	//fatorial(3)=3* fatorial(2)
	//fatorial(2)=2* fatorial(1)
	//fatorial(1)=1* fatorial(0)
	//fatorial(0)=1
	public static int fatorial(int num) {
		if(num==0) {
			return 1;
		}
		return num*fatorial(num-1);
	}
}
