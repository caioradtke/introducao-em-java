package lista002;

import java.util.Scanner;

public class Converte1 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Insira quantos anos você tem:");
		int ano = s.nextInt();
		System.out.println("Insira quantos mêses");
		int mes = s.nextInt();
		System.out.println("Insira quantos dias");
		int dias = s.nextInt();
		int res = (ano * 365) + (mes * 30) + dias;
		System.out.println("Você tem " +res+ " dias de idade.");
	}
}
