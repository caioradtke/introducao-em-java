package aula006;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int bonsaproveitamentos = 0;
		int alunosexemplares = 0;
		for (int y = 0; y < 5; y++) {
			Double soma = 0.0;
			int dez = 0;
			System.out.println("Aluno N°" +(y+1));
		for (int x = 1; x <= 4; x++) {
			System.out.println("Insira sua média do " +x+ "º bimestre");
			Double v = s.nextDouble();
			if (v == 10) {dez++;}
			soma += v;
		}
			Double media = soma / 4;	
			System.out.println("média anual: "+media);
		if (media < 7.0) {
		} else {
		if (media >= 7.0 && media <= 7.9) {
			System.out.println("Honras pelo bom aproveitamento!");
			bonsaproveitamentos++;
		}
		if (media >= 8.0 && media <= 8.9) {
			System.out.println("Honras pelo ótimo aproveitamento!");
		}
		if (media >= 9.0 && media <= 10.0) {
			if (dez >= 2) {
				System.out.println("Aluno exemplar!");
				alunosexemplares++;
				System.out.println("Você obteve nota dez nos seguintes bimestres: "); 
			} else {
				System.out.println("Honras pelo excelente aproveitamento!");
			}
		}
		}
		}
		int porcalex = alunosexemplares * 100 / 5; 
		System.out.println("Quantidade de alunos que obtiveram 'honra por bom aproveitamento': "+bonsaproveitamentos);
		System.out.println("Porcentagem de alunos exemplares: "+porcalex+"%");
		s.close();
		}
}