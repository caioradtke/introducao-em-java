package aula_whiledo;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Q2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.##");
		System.out.println("Digite apartir de que número deseja converter: (50 - 150)");
		Double tab = s.nextDouble();
		while (tab < 150) {
			Double cel = (5 *(tab - 32)) / 9;
			System.out.println("Fahrenheit: " +tab+ " Celsius: " +df.format(cel));
			
			tab++;
		}
	}
}