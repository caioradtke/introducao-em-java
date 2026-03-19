import java.util.ArrayList;

public class Banco {
    private String nome;
    public static int geradorCodigo = 1;
    private int codigo;
    private ArrayList<ContaCorrente> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.codigo = geradorCodigo++;
        contas = new ArrayList<ContaCorrente>();
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public ContaCorrente criarContaCorrente() {
        ContaCorrente contaCorrente = new ContaCorrente(nome, this);
        contas.add(contaCorrente);
        return contaCorrente;
    }

    public ContaPoupanca criarContaPoupanca() {
        ContaPoupanca contaPoupanca = new ContaPoupanca(nome, this);
        contas.add(contaPoupanca);
        return contaPoupanca;
    }

    public ContaCorrente buscaConta(int codigo) {
        for(ContaCorrente conta: contas) {
            if (conta.getCodigo() == codigo) {
                return conta;
            }
        }
        return null;
    } 
}