package semana14.exercicios;

public class Pessoa {
    private double altura, peso;

    public Pessoa(double altura, double peso){
        this.altura = altura;
        this.peso = peso;
    }

    public double calcularIMC(){
        double IMC = peso / (altura * altura);
        return IMC;
    }

    public String getFaixa(){
        if (calcularIMC() < 18.5){
            return "abaixo do peso";
        }if (calcularIMC() >= 18.5 && calcularIMC() < 25) {
            return "peso ideal";
        }if (calcularIMC() >= 25 && calcularIMC() < 30) {
            return "acima do peso";
        }if (calcularIMC() >= 30 && calcularIMC() < 35) {
            return "obesidade classe 1";
        }if (calcularIMC() >= 35 && calcularIMC() < 40) {
            return "obesidade classe 2";        
        }else{
            return "obesidade classe 3";        
        }
    }

    public String getSituacao(){
        double pesoideal = peso - (24.9 * altura * altura);

        if(calcularIMC() > 18.5 && calcularIMC() < 25){
            return "NORMAL";
        }else{
            if (pesoideal < 0){
                return "GANHAR";
            }else {
                if (pesoideal > 0){
                    return "PERDER";
                }
            }
        }

        return "Fora de Escala";
    }

    public double getAltura(){
        return altura;
    }

    public double getPeso(){
        return peso;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }
}
