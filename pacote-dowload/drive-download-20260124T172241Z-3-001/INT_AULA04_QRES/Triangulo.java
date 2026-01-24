package aula005;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Insira o primeiro cateto lado:");
		Double cat1 = s.nextDouble();
		System.out.println("Insira o segundo cateto lado:");
		Double cat2 = s.nextDouble();
		System.out.println("Insira a hipotenusa lado:");
		Double hipo = s.nextDouble();
		if (Math.pow(cat1, 2) + Math.pow(cat2, 2) == Math.pow(hipo, 2)) {
			System.out.println("Este triângulo é retângulo!!");
		}
		if (Math.pow(cat1, 2) + Math.pow(cat2, 2) != Math.pow(hipo, 2)) {
			System.out.println("Este triângulo é retângulo!!");
		}
	}
}