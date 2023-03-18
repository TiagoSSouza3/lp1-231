package semana04.exercicios;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        System.out.println("Programa para aplicar desconto");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double compra = sc.nextDouble();

        if (compra <= 9.99){
            System.out.println("Desconto de 0%, Valor final: " + compra);
        }

        if (compra <= 99.99 && compra >= 10) {
            double desconto5 = compra - (compra * 0.05);
            System.out.println("Desconto de 5%, Valor final: " + desconto5);
        }

        if (compra <= 499.99 && compra >= 100) {
            double desconto10 = compra - (compra * 0.1);
            System.out.println("Desconto de 10%, Valor final: " + desconto10);
        }

        if (compra >= 500) {
            double desconto15 = compra - (compra * 0.15);
            System.out.println("Desconto de 15%, Valor final: " + desconto15);
        }

        sc.close();
    }
}