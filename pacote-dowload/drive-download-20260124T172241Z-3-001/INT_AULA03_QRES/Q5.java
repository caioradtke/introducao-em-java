package aula03;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int vegetariano = 180;
	int peixe = 230;
	int frango = 250;
	int carne = 350;
	int abacaxi = 75;
	int sorvete = 110;
	int mouse = 170;
	int mousec = 200;
	int cha = 20;
	int sucol = 70;
	int sucom = 100; 
	int refri = 65;
	System.out.println("Selecione um prato: [1] VEGETARIANO [2] PEIXE [3] FRANGO [4] CARNE");
	int prato = s.nextInt();
	if(prato == 1)
		prato = vegetariano;
	if(prato == 2)
		prato = peixe;
	if(prato == 3)
		prato = frango;
	if(prato == 4)
		prato = carne;
	System.out.println("Selecione um suco: [1] CHÁ [2] SUCO DE LARANJA [3] SUCO DE MELÃO [4] REFRIGERANTE DIET");
	int suco = s.nextInt();
	if(suco == 1)
		suco = cha;
	if(suco == 2)
		suco = sucol;
	if(suco == 3)
		suco = sucom;
	if(suco == 4)
		suco = refri;
	System.out.println("Selecione uma sobremesa: [1] ABACAXI [2] SORVETE DIET [3] MOUSE DIET [4] MOUSE DE CHOCOLATE");
	int sobremesa = s.nextInt();
	if(sobremesa == 1)
		sobremesa = abacaxi;
	if(sobremesa == 2)
		sobremesa = sorvete;
	if(sobremesa == 3)
		sobremesa = mouse;
	if(sobremesa == 4)
		sobremesa = mousec;
	int res = prato + suco + sobremesa;
	System.out.println("Calorias totais = " +res+ "cal");
	}
}
