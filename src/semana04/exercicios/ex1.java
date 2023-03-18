package semana04.exercicios;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("Programa para pegar antecessor e sucessor de um numero");
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o numero: ");
        int numero = sc.nextInt();
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);

        sc.close();
    }
}