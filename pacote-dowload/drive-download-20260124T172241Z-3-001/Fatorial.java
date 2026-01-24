package subprogramas;

import java.util.Scanner;

public class Fatorial {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Insira um número para fatorar:");
		int fat = s.nextInt();
		int t = fat;
		int f = 0;
		
		for (t = fat; t > 1 ;t--) {
		f = t - 1;
		fat *=  f;
	}
}
}