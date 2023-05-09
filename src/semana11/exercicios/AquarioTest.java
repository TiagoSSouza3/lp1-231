package semana11.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class AquarioTest {
    
    @Test
    public void calcularVolumeTodosPositivos(){
        Aquario aqua1 = new Aquario();

        aqua1.comprimento = 30;
        aqua1.largura = 20;
        aqua1.altura = 40;

        float volume = aqua1.calcularVolume();

        assertEquals(24.0, volume);
    }

    @Test
    public void calcularVolumeUmZeroDoisPositivos(){
        Aquario aqua1 = new Aquario();

        aqua1.comprimento = 30;
        aqua1.largura = 0;
        aqua1.altura = 40;

        float volume = aqua1.calcularVolume();

        assertEquals(0.0, volume);
    }

    @Test
    public void calcularTermostatoTodosPositivos(){
        Aquario aqua1 = new Aquario();

        aqua1.comprimento = 30;
        aqua1.largura = 20;
        aqua1.altura = 100;
        float tempIdeal = 30;
        float tempAquario = 17;

        float termostato = aqua1.calcularPotenciaDoTermostato(tempIdeal, tempAquario);

        assertEquals(39.0, termostato);
    }

    @Test
    public void calcularTermostatoDoisPositivosTemperaturaIdealNegativa(){
        Aquario aqua1 = new Aquario();

        aqua1.comprimento = 30;
        aqua1.largura = 20;
        aqua1.altura = 100;
        float tempAquario = -5;
        float tempAmbiente = 20;

        float termostato = aqua1.calcularPotenciaDoTermostato(tempAquario, tempAmbiente);

        assertEquals(75.0, termostato);
    }
    
    @Test
    public void calcularTermostatoVolumeNegativo(){
        Aquario aqua1 = new Aquario();

        aqua1.comprimento = 30;
        aqua1.largura = 20;
        aqua1.altura = 0;
        float tempAquario = 30;
        float tempAmbiente = 25;

        float termostato = aqua1.calcularPotenciaDoTermostato(tempAquario, tempAmbiente);

        assertEquals(0.0, termostato);
    }

    @Test
    public void calcularQuantidadeDeLitrosNoFiltro(){
        Aquario aqua1 = new Aquario();

        aqua1.comprimento = 30;
        aqua1.largura = 20;
        aqua1.altura = 100;

        float [] litros = aqua1.calcularQuantidadeLitrosFiltro();
        float [] esperado = {120, 180};

        

        assertArrayEquals(esperado , litros);
    }

    @Test
    public void calcularQuantidadeDeLitrosNoFiltroVolumeZero(){
        Aquario aqua1 = new Aquario();

        aqua1.comprimento = 30;
        aqua1.largura = 20;
        aqua1.altura = 0;

        float [] litros = aqua1.calcularQuantidadeLitrosFiltro();
        float [] esperado = {0, 0};

        

        assertArrayEquals(esperado , litros);
    }

}
