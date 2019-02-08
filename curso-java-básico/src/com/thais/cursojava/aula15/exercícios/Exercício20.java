package com.thais.cursojava.aula15.exercícios;

import java.util.Scanner;

public class Exercício20 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Telefonou para a vítima? \n(S)-Sim \n(N)-Não ");
		char letraA=scan.next().charAt(0);
		
		System.out.println("Esteve no local do crime? \n(S)-Sim \n(N)-Não ");
		char letraB=scan.next().charAt(0);
		
		System.out.println("Mora perto da vítima? \n(S)-Sim \n(N)-Não ");
		char letraC=scan.next().charAt(0);
		
		System.out.println("Devia para a vítima? \n(S)-Sim \n(N)-Não ");
		char letraD=scan.next().charAt(0);
		
		System.out.println("Já trabalhou com a vítima? \n(S)-Sim \n(N)-Não ");
		char letraE=scan.next().charAt(0);
		
		switch(letraA) {
		
		case 0123:
			switch (letraB) {
			case 0123: 
				switch (letraC) {
				case 0123: 
					switch (letraD) {
					case 0123: 
						switch (letraE) {
						case 0123: 
							System.out.println("Assassina");break;
						case 0116:
							System.out.println("Cúmplice");break;
							}break;
					case 0116:
						switch (letraE) {
						case 0123: 
							System.out.println("Cúmplice");break;
						case 0116:
							System.out.println("Cúmplice");break;
							}break;
						}break;
				case 0116:
					switch (letraD) {
					case 0123: 
						switch (letraE) {
						case 0123: 
							System.out.println("Cúmplice");break;
						case 0116:
							System.out.println("Cúmplice");break;
							}break;
					case 0116:
						switch (letraE) {
						case 0123: 
							System.out.println("Cúmplice");break;
						case 0116:
							System.out.println("Suspeita");break;
							}break;
						}break;
					}break;
			case 0116:
				switch (letraC) {
				case 0123: 
					switch (letraD) {
					case 0123: 
						switch (letraE) {
						case 0123: 
							System.out.println("Cúmplice");break;
						case 0116:
							System.out.println("Cúmplice");break;
							}break;
					case 0116:
						switch (letraE) {
						case 0123: 
							System.out.println("Cúmplice");break;
						case 0116:
							System.out.println("Suspeita");break;
							}break;
						}break;
				case 0116:
					switch (letraD) {
					case 0123: 
						switch (letraE) {
						case 0123: 
							System.out.println("Cúmplice");break;
						case 0116:
							System.out.println("Suspeita");break;
							}break;
					case 0116:
						switch (letraE) {
						case 0123: 
							System.out.println("Suspeita");break;
						case 0116:
							System.out.println("Inocente");break;
							}break;
						}break;
					}break;
			}break;
			
		case 0116:
			switch (letraB) {
			case 0123: 
				switch (letraC) {
				case 0123: 
					switch (letraD) {
					case 0123: 
						switch (letraE) {
						case 0123: 
							System.out.println("Cúmplice");break;
						case 0116:
							System.out.println("Cúmplice");break;
							}break;
					case 0116:
						switch (letraE) {
						case 0123: 
							System.out.println("Cúmplice");break;
						case 0116:
							System.out.println("Suspeita");break;
							}break;
						}break;
				case 0116:
					switch (letraD) {
					case 0123: 
						switch (letraE) {
						case 0123: 
							System.out.println("Cúmplice");break;
						case 0116:
							System.out.println("Suspeita");break;
							}break;
					case 0116:
						switch (letraE) {
						case 0123: 
							System.out.println("Suspeita");break;
						case 0116:
							System.out.println("Inocente");break;
							}break;
						}break;
					}break;
			case 0116:
				switch (letraC) {
				case 0123: 
					switch (letraD) {
					case 0123: 
						switch (letraE) {
						case 0123: 
							System.out.println("Cúmplice");break;
						case 0116:
							System.out.println("Suspeita");break;
							}break;
					case 0116:
						switch (letraE) {
						case 0123: 
							System.out.println("Suspeita");break;
						case 0116:
							System.out.println("Inocente");break;
							}break;
						}break;
				case 0116:
					switch (letraD) {
					case 0123: 
						switch (letraE) {
						case 0123: 
							System.out.println("Suspeita");break;
						case 0116:
							System.out.println("Inocente");break;
							}break;
					case 0116:
						switch (letraE) {
						case 0123: 
							System.out.println("Inocente");break;
						case 0116:
							System.out.println("Inocente");break;
							}break;
						}break;
					}break;
			}break;
			
		
		} 
	
	}
		
}
	
	

		