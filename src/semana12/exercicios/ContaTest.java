package semana12.exercicios;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTest {
    
    @Test
    public void criarContaComCodigoNegativo(){

        Exception ex = assertThrows(
            IllegalArgumentException.class,
            () -> {new Conta(-23, "Tiago Souza"); }
        );

        assertEquals("Codigo Invalido", ex.getMessage());
    }

    @Test
    public void criarContaParaTestarCodigo(){
        Conta conta1 = new Conta(345, "Tiago Souza");

        assertEquals(conta1.codigo, 345);
    }

    @Test
    public void criarContaParaTestarCorrentista(){
        Conta conta1 = new Conta(345, "Tiago Souza");

        assertEquals(conta1.correntista, "Tiago Souza");
    }

    @Test
    public void sacarComSaldoPositivo(){
        Conta conta1 = new Conta(345, "Tiago Souza");
        conta1.saldo = 300;

        conta1.sacar(200);

        assertEquals(conta1.saldo, 100);
    }

    @Test
    public void sacarComSaldoZero(){
        Exception ex = assertThrows(
            IllegalArgumentException.class,
            () -> {Conta conta1 = new Conta(345, "Tiago Souza"); 
                    conta1.sacar(200); }
        );

        assertEquals("Voce nao tem saldo disponivel suficiente na conta!", ex.getMessage());
    }

    @Test
    public void depositarNaConta(){
        Conta conta1 = new Conta(345, "Tiago Souza");
        conta1.depositar(300);

        assertEquals(conta1.saldo, 300);
    }

    @Test
    public void transferirComSaldoZero(){
        Exception ex = assertThrows(
            IllegalArgumentException.class,
            () -> {Conta conta1 = new Conta(345, "Tiago Souza");
                    Conta conta2 = new Conta(346, "Tiago Santos"); 
                    conta1.transferir(conta2, 200); }
        );

        assertEquals("Voce nao tem saldo disponivel suficiente na conta!", ex.getMessage());
    }

    @Test void transferirEntreContasverificarOSaldoDaContaDois(){
        Conta conta1 = new Conta(345, "Tiago Souza");
        Conta conta2 = new Conta(346, "Tiago Santos"); 

        conta1.saldo = 500;
        conta1.transferir(conta2, 200);

        assertEquals(conta2.saldo, 200);
    }

    @Test void transferirEntreContasverificarOSaldoDaContaUm(){
        Conta conta1 = new Conta(345, "Tiago Souza");
        Conta conta2 = new Conta(346, "Tiago Santos"); 

        conta1.saldo = 500;
        conta1.transferir(conta2, 200);

        assertEquals(conta1.saldo, 300);
    }
}
