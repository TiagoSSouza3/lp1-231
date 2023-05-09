package semana11.exercicios;

public class Aquario{
    float altura, largura, comprimento;

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