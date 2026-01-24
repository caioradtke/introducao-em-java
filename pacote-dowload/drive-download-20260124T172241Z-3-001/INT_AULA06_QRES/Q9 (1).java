package aula007;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Q9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.00");
		byte contaex = 0;
		byte contabom = 0;
		for (int i = 1; i <= 5; i++) {
			String medias10 = "";
			byte conta10 = 0;
			System.out.println("Informe a média do bimedtre 1:");
			double b1 = s.nextDouble();
			if (b1 == 10) {
				conta10++; 
				medias10 = "Bimestre1";
			}
			System.out.println("Informe a média do bimedtre 2:");
			double b2 = s.nextDouble();
			if (b2 == 10) {
				conta10++;
				medias10 = "Bimestre2";
			}
			System.out.println("Informe a média do bimedtre 3:");
			double b3 = s.nextDouble();
			if (b3 == 10) {
				conta10++;
				medias10 = "Bimestre3";	
			}
			System.out.println("Informe a média do bimedtre 4:");
			double b4 = s.nextDouble();
			if (b4 == 10) {
				conta10++;
				medias10 = "Bimestre4";
			}
			double md = (b1+b2+b3+b4)/4;
			
			String citacao = "";
			if (md >= 9) {
				if (conta10 >= 2) {
					citacao = "EXEMPLAR!!!!! Médias 10: " + medias10;
					contaex++;}
				else {
					citacao = "Honras pelo exxcelente aproveitamento";
				}
			}
			else
				if (md >= 8) {
					citacao = "Honras pelo ótimo aproveitamento";
				}
				else{
					citacao = "Honras pelo bom aproveitamento";
					contabom++;
				}
			System.out.println(citacao);
		}
		System.out.println("Quantidade de BOM APROV.: " + contabom);
		System.out.println("Perc de EXEMPLARES: " + (double)(contaex/5)* 100);
	}

}
