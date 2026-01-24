package whiledo;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Sequência de Fibonacci");
		System.out.println("Insira até qual termo deseja gerar:");
		int termo = s.nextInt();
		int i = 3;
		int n1 = 1;
		int n2 = 1;
		int res = 0;
		String fibo = "";
			while (i <= termo) {
				int soma = n1 + n2;
				n1 = n2;
				n2 = soma; 
				
				res = soma;
				
				fibo += " "+res; 
				i++;
			}
			System.out.println("1 1"+fibo);
		s.close();
	}

}
