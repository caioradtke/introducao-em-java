package br.udesc.Exerc3;

public abstract class Civil {
    
    private String nome;
    private int idade;
    private String ocupacao;
    private int salario;
    private double impostos = 1000.00;
    protected double bonusProfissao = 0.0;

    public Civil (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void pagarContas() {
        double conta = impostos - bonusProfissao;
    }

    public void getBonus() {}
}
