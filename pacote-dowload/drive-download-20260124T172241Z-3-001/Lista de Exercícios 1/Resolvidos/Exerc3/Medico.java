package br.udesc.Exerc3;

public class Medico extends Civil {
    
    public Medico (String nome, int idade) {
        super(nome, idade);
        getBonus();
    }

    @Override
    public void getBonus() {
        bonusProfissao = 500.00;
    }
}
