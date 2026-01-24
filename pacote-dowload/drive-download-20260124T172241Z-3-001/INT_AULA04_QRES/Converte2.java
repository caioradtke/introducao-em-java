package lista002;

import java.util.Scanner;

public class Converte2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Insira sua idade em dias");
		int idade = s.nextInt();
		int anos = idade / 365;
		int ranos = idade % 365;
		int meses = ranos / 30;
		int rmeses = ranos % 30 ;
		
		System.out.println("Você tem " +anos+ " Anos "  +meses+ " Meses e " +rmeses+ " Dias");
		
	}

}
