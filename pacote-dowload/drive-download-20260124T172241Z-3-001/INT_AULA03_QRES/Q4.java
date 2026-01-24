package aula03;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Insira sua idade:");
		int idade =  s.nextInt();
		System.out.println("Sua classe eleitoral é:");
		if (idade < 16) {
			System.out.println("Não eleitor.");
		} 
		else if (idade >= 18 && idade < 65) {
			System.out.println("Eleitor Obrigatório.");
		}
		else {
			System.out.println("Eleitor Facultativo.");
		}
	}
}
