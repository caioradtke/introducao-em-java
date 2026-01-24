package whiledo;


public class Q13 {
	public static void main(String[] args) {
		Double a = 5000000.0;
		Double b = 7000000.0;
		int i = 0;
		while (a <= b) {
		a = a * 1.03;
		b = b* 1.02;
		i++;
		}
		System.out.println(i +" Anos");
	}
}