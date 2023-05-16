package semana12;

public class Retangulo {
    public double base;
    public double altura;
    
    public Retangulo(double valor){
        this(valor, valor);
        
        if(valor <= 0){
            throw new IllegalArgumentException("Valor Invalido");
        }
    }
    
    public Retangulo(double base, double altura){
        if(altura <= 0){
            throw new IllegalArgumentException("Altura Invalida");
        }

        if(base <= 0){
            throw new IllegalArgumentException("Base Invalida");
        }    

        this.base = base;
        this.altura = altura;
    }
    
    public double calcularArea(){
        return base * altura;
    }
    
    public double calcularPerimetro(){
        return 2 * (base + altura);
    }
}
