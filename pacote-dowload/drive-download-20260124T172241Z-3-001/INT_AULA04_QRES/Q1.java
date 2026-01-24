package lista002;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Q1 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("###0.00");
		System.out.println("CALCULADORA DE MÉDIA");
		System.out.println("SELECIONE O TIPO DE MÉDIA: [1] ARITIMÉTICA SIMPLES [2] ARITIMÉTICA PONDERADA");
		int media = s.nextInt();
		if (media == 1) {
			System.out.println("Insira sua primeira nota:");
			Double n1 = s.nextDouble();
			System.out.println("Insira sua segunda nota:");
			Double n2 = s.nextDouble();
			System.out.println("Insira sua terceira nota:");
			Double n3 = s.nextDouble();
			Double res = (n1 + n2 + n3) / 3;
			System.out.println("Sua média aritimética simples é igual à: " + df.format(res));
		} else
		if (media == 2) {
			System.out.println("Insira sua primeira nota:");
			Double n1 = s.nextDouble();
			System.out.println("Insira o peso da primeira nota:");
			int p1 = s.nextInt();
			System.out.println("Insira sua segunda nota:");
			Double n2 = s.nextDouble();
			System.out.println("Insira o peso da segunda nota:");
			int p2 = s.nextInt();
			System.out.println("Insira sua terceira nota:");
			Double n3 = s.nextDouble();
			System.out.println("Insira o peso da terceira nota:");
			int p3 = s.nextInt();
			Double res = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 + p3);
			System.out.println("Sua média aritimética ponderada é igual à: " + df.format(res));
		}
	}

}
