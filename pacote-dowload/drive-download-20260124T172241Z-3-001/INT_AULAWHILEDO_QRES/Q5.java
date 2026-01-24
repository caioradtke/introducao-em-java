package whiledo;

import java.util.Scanner;
import java.text.DecimalFormat;
		

public class Q5 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("R$ ###,##0");
		Scanner s = new Scanner(System.in);
		Double maiorconsumo = -1.0;
		Double menorconsumo = Double.MAX_VALUE;
		Double total1 = 0.0;
		Double total2 = 0.0;
		Double total3 = 0.0;
		int i = 0;
		Double total = 0.0;
		
		System.out.println("Informe o preço do kWh.");
		Double precokw = s.nextDouble();
		
		System.out.println("Computar mais um consumidor? S/N");
		String continua = s.next();
		while (continua.equalsIgnoreCase("S")){
			//Gera calculos
			System.out.println("Quantos kWh foram consumidos?");
			Double quantkw = s.nextDouble();
			
			Double valorconta = precokw * quantkw;
			
			System.out.println("Valor a pagar: "+ df.format(valorconta));
			
			System.out.println("Qual o tipo do consumidor: [1]RESIDENCIAL [2]COMERCIAL [3]INDUSTRIAL");
			int tipo = s.nextInt();
			total += valorconta;
			if (tipo == 1) {
				total1 += valorconta;
			}
			if (tipo == 2) {
				total2 += valorconta;
			}
			if (tipo == 3) {
				total3 += valorconta;
			}
			if (valorconta > maiorconsumo) {
				maiorconsumo = valorconta;
			}
			if (valorconta < menorconsumo) {
				menorconsumo = valorconta;
			}
			i++;
			System.out.println("Computar mais um consumidor? S/N");
			continua = s.next();
		}
		System.out.println("Maior consumo verificado: "+maiorconsumo);
		System.out.println("Menor consumo verificado: "+menorconsumo);
		System.out.println("Total de consumos por tipo: [1] "+total1+ " [2] "+total2+ " [3] " +total3);
		System.out.println("Média Geral: " + total / i );
		s.close();
	}
}