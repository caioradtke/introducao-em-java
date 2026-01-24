package aula_whiledo;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Q1 {
	public static void main(String[] args) {
		DecimalFormat d = new DecimalFormat("R$ ###,#0.00");
		Scanner s = new Scanner(System.in);
		
		System.out.println("Converter número S/N");
		String continua = s.next();
		while(continua.equalsIgnoreCase("S")) {
			//converter para número binário
			System.out.println("Informe um valor no intervalo 0..255");
			int val = s.nextInt();
			while (val < 0 || val > 255) {
				System.out.println("VALOR INVÀLIDO! Informe um valor no intervalo");
				val = s.nextInt();
			}
			
			String seq = "";
			while (val >= 2) {
				//Gerar mais um digito binário
				int resto = val % 2;
				val = val / 2;
				seq = resto + seq;
			}
			seq = val + seq;
			System.out.println(seq);
		}
	}
}