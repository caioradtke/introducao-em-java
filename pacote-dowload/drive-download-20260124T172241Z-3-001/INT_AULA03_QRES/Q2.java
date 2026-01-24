package aula03;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("VERIFICADOR DE IMC");
		System.out.println("Insira seu peso:");
		double peso = s.nextDouble();
		System.out.println("Insira sua altura:");
		double altura = s.nextDouble();
		double imc = peso / (altura * altura);
		if(imc < 18.5) {
			System.out.println("Classificação do IMC = Magreza");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("Classificação do IMC = Normal");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Classificação do IMC = Sobrepeso");
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println("Classificação do IMC = Obesidade. \nGrau de Obesidade = I");
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Classificação do IMC = Obesidade. \nGrau de Obesidade = II");
		} else if (imc > 40) {
			System.out.println("Classificação do IMC = Obesidade. \nGrau de Obesidade = III");
			}
		}
	}