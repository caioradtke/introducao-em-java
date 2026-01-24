package aula006;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		System.out.println("Insira um valor inteiro e positivo:");
		int v = s.nextInt();
		int x = v;
		int fac = 0;
		for (x = v; x >= 1; x--) {
			fac = v * x;
			System.out.println(fac);
		}
		
			
		//!n = n . (n-1) . 1

	}
}