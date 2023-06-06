package semana14.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.Assert.assertThrows;

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

    @Test
    public void getValorAltura(){
        Aquario aqua1 = new Aquario(100, 20, 30);

        float altura1 = aqua1.getAltura();

        assertEquals(100, altura1);
    }

    @Test
    public void getValorComprimento(){
        Aquario aqua1 = new Aquario(100, 20, 30);

        float comprimento1 = aqua1.getComprimento();

        assertEquals(30, comprimento1);
    }

    @Test
    public void getValorLargura(){
        Aquario aqua1 = new Aquario(100, 20, 30);

        float largura1 = aqua1.getLargura();

        assertEquals(20, largura1);
    }

    @Test
    public void setComValorPositivoLargura(){
        Aquario aqua1 = new Aquario(100, 20, 30);

        aqua1.setLargura(50);
        float largura1 = aqua1.getLargura();

        assertEquals(50, largura1);
    }

    @Test
    public void setComValorZeroLargura(){
        Exception ex = assertThrows(
            RuntimeException.class,
            () -> {Aquario aqua1 = new Aquario(100, 20, 30);
                    aqua1.setLargura(0f);}
        );

        assertEquals("Largura Invalida", ex.getMessage());
    }

    @Test
    public void setComValorNegativoLargura(){
        Exception ex = assertThrows(
            RuntimeException.class,
            () -> {Aquario aqua1 = new Aquario(100, 20, 30);
                    aqua1.setLargura(-10f);}
        );

        assertEquals("Largura Invalida", ex.getMessage());
    }

    @Test
    public void setComValorPositivoComprimento(){
        Aquario aqua1 = new Aquario(100, 20, 30);

        aqua1.setComprimento(50);
        float comprimento1 = aqua1.getComprimento();

        assertEquals(50, comprimento1);
    }

    @Test
    public void setComValorZeroComprimento(){
        Exception ex = assertThrows(
            RuntimeException.class,
            () -> {Aquario aqua1 = new Aquario(100, 20, 30);
                    aqua1.setComprimento(0f);}
        );

        assertEquals("Comprimento Invalida", ex.getMessage());
    }

    @Test
    public void setComValorNegativoComprimento(){
        Exception ex = assertThrows(
            RuntimeException.class,
            () -> {Aquario aqua1 = new Aquario(100, 20, 30);
                    aqua1.setComprimento(-10f);}
        );

        assertEquals("Comprimento Invalida", ex.getMessage());
    }

    @Test
    public void setComValorPositivoAltura(){
        Aquario aqua1 = new Aquario(100, 20, 30);

        aqua1.setAltura(50);
        float altura1 = aqua1.getAltura();

        assertEquals(50, altura1);
    }

    @Test
    public void setComValorZeroAltura(){
        Exception ex = assertThrows(
            RuntimeException.class,
            () -> {Aquario aqua1 = new Aquario(100, 20, 30);
                    aqua1.setAltura(0f);}
        );

        assertEquals("Altura Invalida", ex.getMessage());
    }

    @Test
    public void setComValorNegativoAltura(){
        Exception ex = assertThrows(
            RuntimeException.class,
            () -> {Aquario aqua1 = new Aquario(100, 20, 30);
                    aqua1.setAltura(-10f);}
        );

        assertEquals("Altura Invalida", ex.getMessage());
    }
}
