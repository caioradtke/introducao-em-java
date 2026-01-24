package whiledo;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Forneça os 2 números inicias para começar a sequência:");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int i = 0;
		int res = 0;
		boolean termoImpar = true;
		String fetu = n1+ " " +n2;
		while (i < 18) {
			if (termoImpar == true) {
				res = n1 + n2;
			}
			else {
				res = n1 - n2;
			}
			termoImpar = !termoImpar;
			fetu += " " + res;
			n1 = n2;
			n2 = res;
			i += 2;
		}
		System.out.println(fetu);
		s.close();
	}
}