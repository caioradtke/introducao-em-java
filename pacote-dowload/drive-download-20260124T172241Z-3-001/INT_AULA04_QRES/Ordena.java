package aula005;

import java.util.Scanner;

public class Ordena {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Selecione o tipo de ordem: [1]DECRESCENTE [2]CRESCENTE");
		int ordem = s.nextInt();
		System.out.println("Insira o primeiro valor");
		int v1 =  s.nextInt();
		System.out.println("Insira o segundo valor");
		int v2 =  s.nextInt();
		System.out.println("Insira o terceiro valor");
		int v3 =  s.nextInt();
		int um = 0;
		int dois = 0;
		int tres = 0;
		if(ordem == 1) {
		if(v1 > v2 && v1 > v3 && v2 > v3) { 
			um = v1;
			dois = v2;
			tres = v3;
			System.out.println(um+ " , " +dois+ " , " +tres);
			} else
		if(v1 > v2 && v1 > v3 && v3 > v2) { 
			um = v1;
			dois = v3;
			tres = v2;
			System.out.println(um+ " , " +dois+ " , " +tres);
			} else
		if(v2 > v1 && v2 > v3 && v1 > v3 ) { 
			um = v2;
			dois = v1;
			tres = v3;
			System.out.println(um+ " , " +dois+ " , " +tres);
			} else
		if(v2 > v1 && v2 > v3 && v3 > v1) { 
			um = v2;
			dois = v3;
			tres = v1;
			System.out.println(um+ " , " +dois+ " , " +tres);
			} else
		if(v3 > v1 && v3 > v2 && v1 > v2) { 
			um = v3;
			dois = v1;
			tres = v2;
			System.out.println(um+ " , " +dois+ " , " +tres);
			} else
		if(v3 > v1 && v3 > v2 && v2 > v1) { 
			um = v3;
			dois = v2;
			tres = v1;
			System.out.println(um+ " , " +dois+ " , " +tres);
			}
		}
		if (ordem == 2) {

			if(v1 > v2 && v1 > v3 && v2 > v3) { 
				um = v1;
				dois = v2;
				tres = v3;
				System.out.println(tres+ " , " +dois+ " , " +um);
				} else
			if(v1 > v2 && v1 > v3 && v3 > v2) { 
				um = v1;
				dois = v3;
				tres = v2;
				System.out.println(tres+ " , " +dois+ " , " +um);
				} else
			if(v2 > v1 && v2 > v3 && v1 > v3 ) { 
				um = v2;
				dois = v1;
				tres = v3;
				System.out.println(tres+ " , " +dois+ " , " +um);
				} else
			if(v2 > v1 && v2 > v3 && v3 > v1) { 
				um = v2;
				dois = v3;
				tres = v1;
				System.out.println(tres+ " , " +dois+ " , " +um);
				} else
			if(v3 > v1 && v3 > v2 && v1 > v2) { 
				um = v3;
				dois = v1;
				tres = v2;
				System.out.println(tres+ " , " +dois+ " , " +um);
				} else
			if(v3 > v1 && v3 > v2 && v2 > v1) { 
				um = v3;
				dois = v2;
				tres = v1;
				System.out.println(tres+ " , " +dois+ " , " +um);
				}
		}	
	}
}