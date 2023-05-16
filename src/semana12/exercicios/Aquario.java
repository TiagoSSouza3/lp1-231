package semana12.exercicios;

public class Aquario{
    float altura, largura, comprimento;

    public Aquario(float altura, float largura, float comprimento) {
        if(altura <= 0f){
            throw new IllegalArgumentException("Altura Invalida");
        }
        if(largura <= 0f){
            throw new IllegalArgumentException("Largura Invalida");
        }
        if(comprimento <= 0f){
            throw new IllegalArgumentException("Comprimento Invalida");
        }

        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public Aquario(float lado){
        this(lado, lado, lado);

        if(lado <= 0){
            throw new IllegalArgumentException("Lado Invalida");
        }
    }

    public float calcularVolume(){
        return (altura * largura * comprimento) / 1000;
    }

    public float calcularPotenciaDoTermostato(float ideal, float aquario){
        return calcularVolume() * 0.05f * Math.abs(ideal - aquario);
    }

    public float [] calcularQuantidadeLitrosFiltro(){
        float [] volumeDois = {calcularVolume() * 2, calcularVolume() * 3};
        return volumeDois;
    }
}