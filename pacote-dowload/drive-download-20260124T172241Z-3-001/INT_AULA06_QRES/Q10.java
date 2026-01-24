package aula006;

//Comércio ou Industria? --> Se Industria então --> Cargo operacional ou Cargo de gerencia?
//informações necessárias: POSTO DE TRABALHO, RESIDI NA CIDADE, TEMPO DE RESIDENCIA,GRAU DE ESCOLARIDADE, EXPERIENCIA COMPROVADA.

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);	
	boolean classificado = false;
	System.out.println("SELECIONE O POSTO DE TRABALHO: [1] COMÉRCIO [2] INDÚSTRIA");
	int posto = s.nextInt();
	System.out.println("RESIDI NA CIDADE: [1] SIM [2] NÃO");
	int residi = s.nextInt();
	System.out.println(" HÁ QUANTO TEMPO RESIDE NA CIDADE ( EM ANOS ):");
	int tempo = s.nextInt();
	System.out.println("QUAL SEU GRAU DE ESCOLARIDADE: [0] SEM ESCOLARIDADE [1] PRIEMIRO GRAU [2] SEGUNDO GRAU [3] TERCEIRO GRAU ");
	int grau = s.nextInt();
	System.out.println("POSSUI EXPERIÊNCIA COMPROVADA: [1] SIM [2] NÃO");
	int exp = s.nextInt();
	if (posto == 1) {
		if(residi == 1) {
			if (tempo < 1 ) { classificado = false;
			} else {if (grau < 2 ) { classificado = false;
			} else { 
				
			} }
		
		}
		else { classificado = false; }
	}
	if (posto == 2) {}
	s.close();
	}
}
