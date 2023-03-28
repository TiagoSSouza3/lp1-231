package semana06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void somaDoisNumerosPositivos(){
        // AAA

        // Arrange
        double numero1 = 10.0;
        double numero2 = 2.0;

        // Act
        double soma = Calculadora.somar(numero1, numero2);

        // Assert
        assertEquals(12.0, soma);
    }

    @Test
    public void somaUmNumeroPositivoEUmNegativo(){
        double numero1 = 10.0;
        double numero2 = -2.0;

        double soma = Calculadora.somar(numero1, numero2);

        assertEquals(8.0, soma);
    }

    @Test
    public void somaDoisNumerosNegativos(){
        double numero1 = -10.0;
        double numero2 = -2.0;

        double soma = Calculadora.somar(numero1, numero2);

        assertEquals(-12.0, soma);
    }

    @Test
    public void subtrairDoisNumerosPositivos(){
        double numero1 = 10.0;
        double numero2 = 2.0;

        double subtracao = Calculadora.subtrair(numero1, numero2);

        assertEquals(8.0, subtracao);
    }

    @Test
    public void subtrairUmNumeroNegativoEUmPositivo(){
        double numero1 = 10.0;
        double numero2 = -2.0;

        double subtracao = Calculadora.subtrair(numero1, numero2);

        assertEquals(12.0, subtracao);
    }

    @Test
    public void subtrairDoisNumerosNegativos(){
        double numero1 = -10.0;
        double numero2 = -2.0;

        double subtracao = Calculadora.subtrair(numero1, numero2);

        assertEquals(-8.0, subtracao);
    }



    @Test
    public void multiplicarUmNumeroPositivoEUmNegativo(){
        double numero1 = 10.0;
        double numero2 = -2.0;

        double multiplicacao = Calculadora.multiplicar(numero1, numero2);

        assertEquals(-20.0, multiplicacao);
    }

    @Test
    public void multiplicarDoisNumerosPositivos(){
        double numero1 = 10.0;
        double numero2 = 2.0;

        double multiplicacao = Calculadora.multiplicar(numero1, numero2);

        assertEquals(20.0, multiplicacao);
    }

    @Test
    public void multiplicarDoisNumerosNegativos(){
        double numero1 = -10.0;
        double numero2 = -2.0;

        double multiplicacao = Calculadora.multiplicar(numero1, numero2);

        assertEquals(20.0, multiplicacao);
    }



    @Test
    public void dividirDoisNumerosPositivos(){
        double numero1 = 10.0;
        double numero2 = 2.0;
        
        double divisao = Calculadora.dividir(numero1, numero2);

        assertEquals(5.0, divisao);
    }

    @Test
    public void dividirUmNumeroPositivoEUmNegativo(){
        double numero1 = 10.0;
        double numero2 = -2.0;

        double divisao = Calculadora.dividir(numero1, numero2);

        assertEquals(-5.0, divisao);
    }

    @Test
    public void dividirDoisNumerosNegativos(){
        double numero1 = -10.0;
        double numero2 = -2.0;

        double divisao = Calculadora.dividir(numero1, numero2);

        assertEquals(5.0, divisao);
    }
    
    @Test
    public void dividirUmNumeroPositivoEZero(){
        double numero1 = 10.0;
        double numero2 = 0.0;

        assertThrows(RuntimeException.class, () -> {
            Calculadora.dividir(numero1, numero2);
        });
    }
}
