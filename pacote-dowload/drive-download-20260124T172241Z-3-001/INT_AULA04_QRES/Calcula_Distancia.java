package aula005;

import java.util.Scanner;

public class Calcula_Distancia {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Insira o X1:");
		Double x1 = s.nextDouble();
		System.out.println("Insira o Y1:");
		Double y1 = s.nextDouble();
		System.out.println("Insira o X2:");
		Double x2 = s.nextDouble();
		System.out.println("Insira o Y2:");
		Double y2 = s.nextDouble();
		Double sqrt1 = (x2 - x1);
		Double sqrt2 = (y2 - y1); 
		Double d = Math.sqrt((Math.pow(sqrt1, 2) + Math.pow(sqrt2, 2)));
		if (x1 > x2) {
			System.out.println("Valores inválidos!!");
		} else {
			System.out.println("A distância entre os dois pontos é de " +d);
		}
		
		

	}

}
