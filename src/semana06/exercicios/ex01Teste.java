package semana06.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ex01Teste {
    
    @Test
    public void calculaVolumeAquarioTresPositivos(){
        double comprimento = 30;
        double largura = 20;
        double altura = 40;

        double volLitros = ex01.volume(altura, largura, comprimento);

        assertEquals(24.0, volLitros);
    }

    @Test
    public void calculaVolumeAquarioDoisPositivosEZero() {
        double comprimento = 30;
        double largura = 0;
        double altura = 40;

        double volLitros = ex01.volume(altura, largura, comprimento);

        assertEquals(0.0, volLitros);
    }

    @Test
    public void calcularTermostatoTodosPositivos(){
        double volLitros = 60;
        double tempAquario = 30;
        double tempAmbiente = 17;

        double termostato = ex01.potencia(tempAquario, tempAmbiente, volLitros);

        assertEquals(39.0, termostato);
    }

    @Test
    public void calcularTermostatoDoisPositivosTemperaturaIdealNegativa(){
        double volLitros = 60;
        double tempAquario = -5;
        double tempAmbiente = 20;

        double termostato = ex01.potencia(tempAquario, tempAmbiente, volLitros);

        assertEquals(75.0, termostato);
    }

    @Test
    public void calcularTermostatoVolumeNegativo(){
        double volLitros = 0;
        double tempAquario = 30;
        double tempAmbiente = 25;

        double termostato = ex01.potencia(tempAquario, tempAmbiente, volLitros);

        assertEquals(0.0, termostato);
    }
}
