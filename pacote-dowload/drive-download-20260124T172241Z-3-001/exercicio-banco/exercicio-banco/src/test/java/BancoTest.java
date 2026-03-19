/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 09025706924
 */
import br.udesc.testedesoftware.Banco;
import br.udesc.testedesoftware.ContaCorrente;
import br.udesc.testedesoftware.ContaPoupanca;
public class BancoTest {
    
    @Test
    public void deveCriarUmaNovaContaCorrente() {
       //Arrange -> Todos os dados necessários pára chamar o método
       String nomeBanco = "BB";
       String nomeCorrentista = "Aluno 1";
       Banco banco = new Banco(nomeBanco);
       
       //Act -> Chamada do método principal do teste
       ContaCorrente conta = banco.criarContaCorrente(nomeCorrentista);
       
       
       //Assert -> Verificação validar
       assertNotEquals(null, conta);
       assertEquals(nomeCorrentista,conta.getNome());
       assertEquals(0, conta.getSaldo());
    }
    
    @Test
    public void deveCriarBancoComCodigoIncremental() {
        //Arrange
        String nomeBanco1 = "BB";
        String nomeBanco2 = "Inter";
        
        //Act
        Banco banco1 = new Banco(nomeBanco1);
        Banco banco2 = new Banco(nomeBanco2);
        
        //Assert
 
        assertTrue(banco2.getCodigo()== banco1.getCodigo() + 1);
    }
    
    @Test
    public void deveEfetuarSaqueContaCorrente() {
        //Arrange
        Banco banco = new Banco("Inter");
        ContaCorrente conta = banco.criarContaCorrente("Aluno 1");
        conta.depositar(200.0f);
        
        //Act
       Boolean saqueValido = conta.sacar(100.0f);
        
        //Assert
        assertTrue(saqueValido);
        assertEquals(100.0f, conta.getSaldo());
        
    }
    
    @Test
    public void deveFalharAoSacarContaPoupanca() {
        //Arrange
        Banco banco = new Banco("Inter");
        ContaPoupanca conta = banco.criarContaPoupanca("Aluno 1");
        
        //Act
        Boolean saqueValido = conta.sacar(100.0f);
      
        
        //Assert
        assertFalse(saqueValido);
        assertEquals(0, conta.getSaldo());
    }
    
    @Test
    public void deveCriarContasCodigosIguaisEmBancosDiferentes(){
        Banco banco1 = new Banco("Banco 1");
        Banco banco2 = new Banco("Banco 2");
        
        ContaCorrente cc1 = banco1.criarContaCorrente("Cliente do Banco 1");
        ContaCorrente cc2 = banco1.criarContaCorrente("Cliente do Banco 2");
        
        
        assertEquals(cc1.getCodigo(), cc2.getCodigo());
    }
}
