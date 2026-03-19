package br.udesc.testedesoftware;

public class ContaPoupanca extends ContaCorrente {

    public ContaPoupanca(int codigo, String nome, Banco banco) {
        super(codigo,nome, banco);
    }

    @Override
    public boolean sacar(float valor){
        if(getSaldo() < valor)
            return false;
//        super.sacar(valor);
        this.saldo-=valor;
        return true;
    }
}
