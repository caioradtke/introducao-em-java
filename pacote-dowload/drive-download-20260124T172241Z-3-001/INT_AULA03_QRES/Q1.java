package aula03;

import java.util.Scanner; 

public class Q1 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("VERIFICADOR DE DIVISÃO POR: 10 & 5 & 2");
		System.out.println("Digite um valor:");
		int v1 = s.nextInt(); 
		int dez = 10;
		int cinco = 5;
		int dois = 2;
		int resto1 = v1 % dez;
		int resto2 = v1 % cinco;
		int resto3 = v1 % dois;
			if(resto1 != 0 && resto2 != 0 && resto3 != 0) {
				System.out.println("Não é divisivél por nenhuma das opções");
			    } 
				else {
					if (resto1 == 0) {
						System.out.println("É divisivél por 10");
					    }
					if (resto2 == 0) {
						System.out.println("É divisivél por 5");
						}
					if (resto3 == 0) {
						System.out.println("É divisivél por 2");
						}
			}		
		}
	}