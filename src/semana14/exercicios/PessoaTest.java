package semana14.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    public void testarConstrutorPesoEGetPeso(){
        Pessoa pessoa1 = new Pessoa(1.80, 60);

        assertEquals(60, pessoa1.getPeso());
    }

    @Test
    public void testarConstrutorAlturaEGetAltura(){
        Pessoa pessoa1 = new Pessoa(1.80, 60);

        assertEquals(1.80, pessoa1.getAltura());
    }

    @Test
    public void testarSetAltura(){
        Pessoa pessoa1 = new Pessoa(1.80, 60);
        
        pessoa1.setAltura(1.90);

        assertEquals(1.90, pessoa1.getAltura());
    }

    @Test
    public void testarSetPeso(){
        Pessoa pessoa1 = new Pessoa(1.80, 60);
        
        pessoa1.setPeso(80);

        assertEquals(80, pessoa1.getPeso());
    }

    @Test
    public void calcularIMCComNumerosBaixos(){
        Pessoa pessoa1 = new Pessoa(1.80, 60);

        double IMC = pessoa1.calcularIMC();

        assertEquals(18.51, IMC, 0.01);
    }

    @Test
    public void calcularIMCComNumerosAltos(){
        Pessoa pessoa1 = new Pessoa(1.60, 120);

        double IMC = pessoa1.calcularIMC();

        assertEquals(46.87, IMC, 0.01);
    }

    @Test
    public void calcularFaixaDeIMCAbaixoDoPeso(){
        Pessoa pessoa1 = new Pessoa(1.80, 50);

        String faixa = pessoa1.getFaixa();
        String esperado = "abaixo do peso";

        assertEquals(esperado, faixa);
    }

    @Test
    public void calcularFaixaDeIMCPesoIdeal(){
        Pessoa pessoa1 = new Pessoa(1.80, 65);

        String faixa = pessoa1.getFaixa();
        String esperado = "peso ideal";

        assertEquals(esperado, faixa);
    }

    @Test
    public void calcularFaixaDeIMCAcimaDoPeso(){
        Pessoa pessoa1 = new Pessoa(1.80, 90);

        String faixa = pessoa1.getFaixa();
        String esperado = "acima do peso";

        assertEquals(esperado, faixa);
    }

    @Test
    public void calcularFaixaDeIMCObesidadqClasse1(){
        Pessoa pessoa1 = new Pessoa(1.80, 100);

        String faixa = pessoa1.getFaixa();
        String esperado = "obesidade classe 1";

        assertEquals(esperado, faixa);
    }

    @Test
    public void calcularFaixaDeIMCObesidadqClasse2(){
        Pessoa pessoa1 = new Pessoa(1.80, 120);

        String faixa = pessoa1.getFaixa();
        String esperado = "obesidade classe 2";

        assertEquals(esperado, faixa);
    }

    @Test
    public void calcularFaixaDeIMCObesidadqClasse3(){
        Pessoa pessoa1 = new Pessoa(1.80, 140);

        String faixa = pessoa1.getFaixa();
        String esperado = "obesidade classe 3";

        assertEquals(esperado, faixa);
    }

    @Test
    public void calcularSituacaoGanhar(){
        Pessoa pessoa1 = new Pessoa(1.80, 50);

        String situacao = pessoa1.getSituacao();
        String esperado = "GANHAR";

        assertEquals(esperado, situacao);
    }

    @Test
    public void calcularSituacaoPerder(){
        Pessoa pessoa1 = new Pessoa(1.80, 90);

        String situacao = pessoa1.getSituacao();
        String esperado = "PERDER";

        assertEquals(esperado, situacao);
    }

    @Test
    public void calcularSituacaoNormal(){
        Pessoa pessoa1 = new Pessoa(1.80, 60);

        String situacao = pessoa1.getSituacao();
        String esperado = "NORMAL";

        assertEquals(esperado, situacao);
    }
}

