package semana14.exercicios;

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

        assertEquals(conta1.getCodigo(), 345);
    }

    @Test
    public void criarContaParaTestarCorrentista(){
        Conta conta1 = new Conta(345, "Tiago Souza");

        assertEquals(conta1.getCorrentista(), "Tiago Souza");
    }

    @Test
    public void testarGetSaldo(){
        Conta conta1 = new Conta(345, "Tiago Souza");

        assertEquals(conta1.getSaldo(), 0);
    }

    @Test
    public void sacarComSaldoPositivo(){
        Conta conta1 = new Conta(345, "Tiago Souza");
        conta1.depositar(300);

        conta1.sacar(200);

        assertEquals(100, conta1.getSaldo());
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

        assertEquals(conta1.getSaldo(), 300);
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

        conta1.depositar(500);
        conta1.transferir(conta2, 200);

        assertEquals(conta2.getSaldo(), 200);
    }

    @Test void transferirEntreContasverificarOSaldoDaContaUm(){
        Conta conta1 = new Conta(345, "Tiago Souza");
        Conta conta2 = new Conta(346, "Tiago Santos"); 

        conta1.depositar(500);
        conta1.transferir(conta2, 200);

        assertEquals(conta1.getSaldo(), 300);
    }
}
