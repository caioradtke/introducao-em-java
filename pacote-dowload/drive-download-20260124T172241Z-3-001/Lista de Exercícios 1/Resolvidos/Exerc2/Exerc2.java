package br.udesc.Exerc2;

// Modificadores de escopo definem onde uma classe, atributo ou método pode ser acessado dentro do programa. Eles controlam a visibilidade dos elementos no código.

public class Exerc2 {
    
    static int totalContas = 0;

    String titular;
    double saldoInicial;

    public Exerc2 (String titular, double saldoInicial) {
        this.titular = titular;
        this.saldoInicial = saldoInicial;
        totalContas++;
    }

    public static void main(String[] args) {
        Exerc2 banco = new Exerc2("Caio", 560.00);
        System.out.println(totalContas); // totalContas é um atributo que pertence a classe inteira podendo ser chamado diretamente sem a dependecia de um obejto.
        System.out.println(banco.saldoInicial); // Saldo inicial é um atributo pertencente ao obejto banco.
    }
}
