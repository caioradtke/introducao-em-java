package br.udesc.Exerc1;

// Modificadores de visibilidade são termos que definem o acesso a classes e metodos em Java. Controlando quem pode acessar ou modificar os dados e comportamentos de um programa. Sendo eles: public - Totalmente acessivel, private - Somente acessivel dentro da propria classe, protected - Acessivel dentro do mesmo pacote e subclasses.

public class Exerc1 
{
    public static void main( String[] args ) //método main public consegue realizar a chamada dos outros métodos
    {
        System.out.println( "Este é um método público, totalmente acessível." );
        metodoPrivado();
        metodoProtected();
    }

    private static void metodoPrivado() {
        System.out.println("Este é um método privado, acessível apenas dentro desta classe.");
    }

    protected static void metodoProtected() {
        System.out.println("Este é um método protected, acessível apenas dentro desta subclasse ou package");
    }
}
