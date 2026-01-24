package whiledo;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Q4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(" ##0.00");
		System.out.println("Insira o código do curso [X para]:");
		String cod = s.next();
		String maiorcod = "";
		int candvag = 0;
		int maior = Integer.MIN_VALUE;
		while (!(cod.equalsIgnoreCase("x"))) {
			System.out.println("Insira o número de vagas:");
			int vagas = s.nextInt();
			System.out.println("Insira o número de candidatos do sexo masculino:");
			int sm = s.nextInt();
			System.out.println("Insira o número de candidatos do sexo feminino:");
			int sf = s.nextInt();
			int cand = sf + sm;
			candvag = cand / vagas;
			Double percfem = (sf * 100.0) / cand;
			System.out.println(candvag+ " Candidatos por vaga.");
			System.out.println(df.format(percfem)+ "% de candidatos do sexo feminino");
			if (candvag > maior) {
				maior = candvag;
				maiorcod = cod;
			}
			
			System.out.println("Insira o código do curso [X para]:");
			cod = s.next();	
		}
		System.out.println("O maior número de candidatos por vaga foi: "  +maior+ " do curso de código " +maiorcod );
		s.close();
	}
}