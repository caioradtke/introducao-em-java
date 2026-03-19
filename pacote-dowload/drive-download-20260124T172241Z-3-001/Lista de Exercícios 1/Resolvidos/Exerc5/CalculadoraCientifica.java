package Exerc5;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraCientifica extends Exerc5 {

    @Override
    public double somar(double n1, double n2) {
        double soma = n1 + n2;
        while (true) {
            System.out.println("Deseja somar mais números? (s/n)");
            String resp = s.next();

            if (resp.equals("s")) {
                System.out.println("Insira o número que deseja somar:");
                soma += s.nextDouble();
            } else {
                break;
            }
        }
        return soma;
    }
}
