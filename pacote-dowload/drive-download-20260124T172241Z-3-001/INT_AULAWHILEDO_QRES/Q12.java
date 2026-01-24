package whiledo;

public class Q12 {
	public static void main(String[] args) {
		int i = 26;
		int soma = 0;
		while (i <= 200) {
			soma += i;
			i++;
			i++;
		}
		System.out.println(soma);
	}
}