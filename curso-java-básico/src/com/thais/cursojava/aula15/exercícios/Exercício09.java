package com.thais.cursojava.aula15.exerc�cios;

import java.util.Scanner;

public class Exerc�cio09 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite a primeiro n�mero: ");
		int num1= scan.nextInt();
		
		System.out.println("Digite a segundoo n�mero: ");
		int num2= scan.nextInt();
		
		System.out.println("Digite a terceiro n�mero: ");
		int num3= scan.nextInt();
		
		if(num1>num2 && num2>num3){
			System.out.println(""+num1+" "+num2+" "+num3);
		}else if ((num1>num2 && num3>num2)&& (num1>num3)) {
			System.out.println(" "+num1+" "+num3+" "+num2);
		}else if ((num2>num1 && num2>num3)&& (num1>num3)) {
			System.out.println(" "+num2+" "+num1+" "+num3);
		}else if ((num2>num1 && num2>num3)&& (num1<num3)) {
			System.out.println(" "+num2+" "+num3+" "+num1);
		}else if ((num3>num1 && num3>num2)&& (num1>num2)) {
			System.out.println(" "+num3+" "+num1+" "+num2);
		}else {
			System.out.println(" "+num3+" "+num2+" "+num1);
		}
		
	}
	
}