package aula006;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int x = 0;
			int maior = Integer.MIN_VALUE;
			int menor = Integer.MAX_VALUE;
			int soma = 0;
			for (x = 0; x < 10; x++) {
			System.out.println("Insira um valor inteiro e positvo:");
			int v = s.nextInt();
			if (v > maior) {
				maior = v;
			}
			if (v < menor) {
				menor = v;
			}
			soma += v;
			}
			Double media = soma / 10.0;
			System.out.println("O maior número inserido foi: "+maior);
			System.out.println("O menor número inserido foi: "+menor);
			System.out.println("A média dos valores inseridos é: "+media);
		}
	}
}