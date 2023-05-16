package semana12.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class AquarioTest {
    
    @Test
    public void calcularVolumeComTresParametros(){
        Aquario aqua1 = new Aquario(40, 20, 30);

        float volume = aqua1.calcularVolume();

        assertEquals(24.0, volume);
    }

    @Test
    public void calcularVolumeComApenasUmParametro(){
        Aquario aqua1 = new Aquario(30);

        float volume = aqua1.calcularVolume();

        assertEquals(27.0, volume);
    }

    @Test
    public void calcularTermostatoTodosPositivos(){
        Aquario aqua1 = new Aquario(100, 20, 30);

        float tempIdeal = 30;
        float tempAquario = 17;

        float termostato = aqua1.calcularPotenciaDoTermostato(tempIdeal, tempAquario);

        assertEquals(39.0, termostato);
    }

    @Test
    public void calcularTermostatoDoisPositivosTemperaturaIdealNegativa(){
        Aquario aqua1 = new Aquario(100, 20, 30);

        float tempAquario = -5;
        float tempAmbiente = 20;

        float termostato = aqua1.calcularPotenciaDoTermostato(tempAquario, tempAmbiente);

        assertEquals(75.0, termostato);
    }

    @Test
    public void calcularQuantidadeDeLitrosNoFiltro(){
        Aquario aqua1 = new Aquario(100, 20, 30);

        float [] litros = aqua1.calcularQuantidadeLitrosFiltro();
        float [] esperado = {120, 180};

        assertArrayEquals(esperado , litros);
    }
}
