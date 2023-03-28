package semana06;

public class Calculadora {

    //somar
    public static double somar(double numero1, double numero2){
        return numero1 + numero2;
    }

    // subtrair 
    public static double subtrair(double numero1, double numero2){
        return numero1 - numero2;
    };

    // multiplicar
    public static double multiplicar(double numero1, double numero2){
        return numero1 * numero2;
    };

    // dividir
    public static double dividir(double numero1, double numero2){
        if(numero2 == 0)
            throw new RuntimeException("O denominador não pode ser 0");

        return numero1 / numero2;
    };
}
