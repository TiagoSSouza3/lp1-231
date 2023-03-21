package semana05;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        System.out.println("Avaliar o seu IMC");

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com primeiro sua altura: ");
        float altura = sc.nextFloat();
        System.out.println("Agora entre com seu peso: ");
        float peso = sc.nextFloat();

        float IMC = peso / (altura * altura);

        if (IMC < 18.5){
            System.out.println("Seu IMC é: " + IMC + ("\n Voce esta abaixo do peso"));
        }

        if (IMC >= 18.5 && IMC <= 24.9) {
        System.out.println("Seu IMC é: " + IMC + ("\n Voce esta no peso ideal"));
        } 

        if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Seu IMC é: " + IMC + ("\n Voce esta acima do peso"));
        }

        if (IMC >= 30 && IMC <= 34.9) {
            System.out.println("Seu IMC é: " + IMC + ("\n Voce esta com obesidade classe 1"));
        }

        if (IMC >= 35 && IMC <= 39.9) {
            System.out.println("Seu IMC é: " + IMC + ("\n Voce esta com obesidade classe 2"));
            
        }
        
        if (IMC >= 40) {
            System.out.println("Seu IMC é: " + IMC + ("\n Voce esta com obesidade classe 3"));
        }  

        if (IMC <= 18.5 || IMC >= 24.9){
            double pesoideal = peso - (24.9 * altura * altura);
            if (pesoideal < 0){
                pesoideal = pesoideal * (-1);
                System.out.printf("Voce deve ganhar %.1f Kg", pesoideal);
            }else {
                if (pesoideal > 0){
                    System.out.printf("Voce deve perder %.1f Kg", pesoideal);
                }
            }
        }

        sc.close();
    }
}
