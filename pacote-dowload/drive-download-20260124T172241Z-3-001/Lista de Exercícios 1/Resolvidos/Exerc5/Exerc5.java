package Exerc5;

import java.util.Scanner;

// Sobrecarga de método significa utilizar o mesmo nome para vários métodos ,em uma mesma classe, utilizando paramêtros diferentes.
// A sobrescrita acontece quando uma classe filha redefine um método da classe pai, mantendo a mesma assinatura do método

public class Exerc5 {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Exerc5 calc = new Exerc5();
        System.out.println("Digite 2 números para somar:");
        double valor1 = s.nextInt();
        double valor2 = s.nextInt();        
        System.out.println(calc.somar(valor1, valor2));

        System.out.println("Digite 2 palavras para somar");
        String palavra1 = s.next();
        String palavra2 = s.next();
        System.out.println(calc.somar(palavra1, palavra2));
    }

    public double somar(double n1, double n2) {
        double soma = n1 + n2;
        return soma;
    }

    public String somar(String p1, String p2) {
        String soma = p1 + p2;
        return soma;
    }
}