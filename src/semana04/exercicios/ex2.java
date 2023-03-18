package semana04.exercicios;

import java.util.Scanner;

public class ex2 {
    
    public static void main(String[] args) {
        System.out.println("Este programa faz a media aritmetica de tres numeros");

        Scanner sc = new Scanner(System.in);

        double numero1, numero2, numero3 = 0;

        System.out.println("Entre com os tres numeros: ");
        numero1 = sc.nextDouble();
        numero2 = sc.nextDouble();
        numero3 = sc.nextDouble();

        double media = (numero1 + numero2 + numero3)/3;

        System.out.printf("A media aritmetica e: %f", media);

        sc.close();

    }
}
