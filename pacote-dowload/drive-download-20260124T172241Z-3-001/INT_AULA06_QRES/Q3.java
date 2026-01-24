package aula006;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int x = 0;
			int negs = 0;
			int intervalo = 0;
			Double soma = 0.0;
			for (x = 0; x < 10; x++) {
				System.out.println("Insira um valor:");
				Double v = s.nextDouble();
				if (v > 0) {soma += v;}
				if (v < 0) {negs++;}
				if (v >= 5 && v <= 50) {intervalo++;}
				}
			Double media = soma / (10 - negs);
			System.out.println("A média dos valores inseridos é igual à: " +media);
			System.out.println("A quantidade de números menores que zero é: "+negs);
			System.out.println("A quantidade de números no intervalo de 5 à 50, incluindo os valores limites é: "+intervalo);
			}
		}
	}