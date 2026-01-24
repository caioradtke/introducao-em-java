package aula03;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("VERIFICADOR DE CRÉDITO ESPECIAL DA CEF");
		System.out.println("Insira o seu Saldo Médio:");
		double sm = s.nextDouble();
		double c1 = (sm * 0.3) * 1.02;
		double c2 = (sm * 0.4) * 1.02; 
		double c3 = (sm * 0.5) * 1.02;
		System.out.println("Saldo Médio = R$" +sm );
		if (sm >= 0 && sm <= 500) {
			System.out.println("Sem Crédito Especial.");
		}
		else if (sm > 500 && sm <= 1000 ) {
			System.out.println("Valor de Crédito Especial = R$" +c1 );
		}
		else if (sm > 1000 && sm <= 3000) {
			System.out.println("Valor de Crédito Especial = R$" +c2 );
		}
		else {
			System.out.println("Valor de Crédito Especial = R$" +c3 );
		}
	}
}
// "*1.02" não sei se era isso que ele queria.//