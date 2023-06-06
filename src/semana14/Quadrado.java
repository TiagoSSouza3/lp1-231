package semana14;

public class Quadrado {
    private double lado;

    // Construtor
    public Quadrado(double lado){
        this.lado = lado;
    }

    public double calcularArea(){
        return lado * lado;
    }

    public double calcularPerimetro(){
        return 4 * lado;
    }

    // Getter
    public double getLado(){
        return lado;
    }

    // Setter
    public void setLado(double lado){
        if(lado <= 0){
            throw new RuntimeException("Lado invalido!!!");
        }

        this.lado = lado;
    }
}
