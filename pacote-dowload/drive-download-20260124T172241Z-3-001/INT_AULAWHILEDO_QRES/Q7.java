package whiledo;

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Insira um número inteiro de 4 algarismos:");
		int n = s.nextInt();
		while (n >= 1000 || n <= 9999) {
		int divi = n / 100;
		int resto = n % 100;
		Double result = Math.pow(divi + resto,2);
		if ( result == n) {
			System.out.println("É um número especial!");
		}
		else {
			System.out.println("Não é um número especial!");
		}
		System.out.println("Insira um número inteiro de 4 algarismos:");
		n = s.nextInt();
		}
		s.close();
	}
}