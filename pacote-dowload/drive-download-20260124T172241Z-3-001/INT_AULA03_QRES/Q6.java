package aula03;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("IDENTIFICADOR DE DIA DA SEMANA");
		System.out.println("Insira o dia da semana");
		int semana = s.nextInt();
		if (semana > 7) {
			System.out.println("Número inválido para dia da semana!!");
		}
		if (semana < 1) {
			System.out.println("Número inválido para dia da semana!!");
		}
		if (semana == 1) {
			System.out.println("Domingo");
		} else
		if (semana == 2) {
			System.out.println("Segunda-feira");
		} else
		if (semana == 3) {
			System.out.println("Terça-feira");
		} else
		if (semana == 4) {
			System.out.println("Quarta-feira");
		} else
		if (semana == 5) {
			System.out.println("Quinta-feira");
		} else
		if (semana == 6) {
			System.out.println("Sexta-feira");
		} else
		if (semana == 7) {
			System.out.println("Sábado");
		}
	}
}
