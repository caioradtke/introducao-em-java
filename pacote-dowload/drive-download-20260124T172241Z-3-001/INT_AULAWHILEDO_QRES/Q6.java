package whiledo;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Insira um número inteiro:");
		int n = s.nextInt();
		int y = n;
		int res = Integer.MAX_VALUE;
		int i = 3;
		int contador = 1;
		n = n - 1;
		while (res > 0) {
		res =  n - i;
		n = res;
		i += 2;
		contador++;
		}
		System.out.println ("A raiz quadrada de " +y+ " é igual à " +contador+ " aproximadamente.");
		s.close();
	}
} 