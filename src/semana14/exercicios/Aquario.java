package semana14.exercicios;

public class Aquario{
    private float altura, largura, comprimento;

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

    //getter e setter
    public float getAltura(){
        return altura;
    }
    
    public float getComprimento(){
        return comprimento;
    } 

    public float getLargura(){
        return largura;
    }
    
    public void setAltura(float altura){
        if(altura <= 0.0){
            throw new RuntimeException("Altura Invalida");
        }
        this.altura = altura;
    } 

    public void setLargura(float largura){
        if(largura <= 0.0){
            throw new RuntimeException("Largura Invalida");
        }
        this.largura = largura;
    } 

    public void setComprimento(float comprimento){
        if(comprimento <= 0.0){
            throw new RuntimeException("Comprimento Invalida");
        }
        this.comprimento = comprimento;
    } 
}