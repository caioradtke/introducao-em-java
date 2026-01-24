package whiledo;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		Double pvtotal = 0.0;
		Double pctotal = 0.0;
		Double lucrototal = 0.0;
		System.out.println("Nome da mercadoria [x = parar]");
		String nome = s.next();
		
		
		while (!(nome.equalsIgnoreCase("x"))) {
		System.out.println("informe o preço de custo:");
		Double pc = s.nextDouble();
		System.out.println("Informe o preço de venda:");
		Double pv = s.nextDouble();
		Double lucro = pv - pc; 
		Double porclucro = lucro / pc;
		if (porclucro < 0.1) {a++;}
		if (porclucro >= 0.1 && porclucro <= 0.2) {b++;}
		if (porclucro > 0.2) {c++;}
		pvtotal += pv;
		pctotal += pc;
		lucrototal += lucro;
		System.out.println("Nome da mercadoria [x = parar]");
		nome = s.next();
		}
		System.out.println("Você teve " +a+ " mercadorias que tiveram o lucro menor que 10% ");
		System.out.println("Você teve " +b+ " mercadorias que tiveram o lucro maior que 10% e menor que 20% ");
		System.out.println("Você teve " +c+ " mercadorias que tiveram o lucro maior que 20% ");
		System.out.println("Valor total de venda: " +pvtotal);
		System.out.println("Valor total de custo: " +pctotal);
		System.out.println("Valor total de lucro: " +lucrototal);
		s.close();
	}
}