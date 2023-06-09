package semana14.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class AquarioTest {
    
    @Test
    public void calcularVolumeComTresParametros(){
        Aquario aqua1 = new Aquario(40, 20, 30);

        assertEquals(24.0, aqua1.calcularVolume());
    }

    @Test
    public void calcularVolumeComApenasUmParametro(){
        Aquario aqua1 = new Aquario(30);

        assertEquals(27.0, aqua1.calcularVolume());
    }

    @Test
    public void calcularTermostatoTodosPositivos(){
        Aquario aqua1 = new Aquario(100, 20, 30);

        float tempIdeal = 30;
        float tempAquario = 17;

        assertEquals(39.0, aqua1.calcularPotenciaDoTermostato(tempIdeal, tempAquario));
    }

    @Test
    public void calcularTermostatoDoisPositivosTemperaturaIdealNegativa(){
        Aquario aqua1 = new Aquario(100, 20, 30);

        float tempAquario = -5;
        float tempAmbiente = 20;

        assertEquals(75.0, aqua1.calcularPotenciaDoTermostato(tempAquario, tempAmbiente));
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

        assertEquals(100, aqua1.getAltura());
    }

    @Test
    public void getValorComprimento(){
        Aquario aqua1 = new Aquario(100, 20, 30);

        assertEquals(30, aqua1.getComprimento());
    }

    @Test
    public void getValorLargura(){
        Aquario aqua1 = new Aquario(100, 20, 30);

        assertEquals(20, aqua1.getLargura());
    }

    @Test
    public void setComValorPositivoLargura(){
        Aquario aqua1 = new Aquario(100, 20, 30);

        aqua1.setLargura(50);

        assertEquals(50, aqua1.getLargura());
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

        assertEquals(50, aqua1.getComprimento());
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

        assertEquals(50, aqua1.getAltura());
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
