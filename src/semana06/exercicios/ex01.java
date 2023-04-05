package semana06.exercicios;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        System.out.println("Este programa diz quais as condições favoraveis para seu aquario");

        Scanner sc = new Scanner(System.in);

        double altura, largura, comprimento = 0;

        System.out.println("Digite a altura, a largura e o comprimento do aquario:");
        altura = sc.nextFloat();
        largura = sc.nextFloat();
        comprimento = sc.nextFloat();

        System.out.println("Entre com a temperatura ambiente do local do aquario: ");
        double tempAmbiente = sc.nextInt();
        System.out.println("Entre com a temperatura desejada do aquario: ");
        double tempAquario = sc.nextInt();

        double volLitros = volume(altura, largura, comprimento);
        System.out.println("O volume em litros do aquario é de: " + volLitros + ("L"));

        System.out.println("A temperatura ideal do termostato é de: " + potencia(tempAquario, tempAmbiente, volLitros));

        System.out.println("A filtragem por hora deve ser entre: " + volume2e3(volLitros)[0] +"L e " + volume2e3(volLitros)[1] +"L");

        sc.close();
    }

    public static double volume(double altura, double largura, double comprimento){
        return (comprimento * altura * largura) / 1000;
    }

    public static double potencia(double tempAquario, double tempAmbiente, double volLitros){
        return  volLitros * 0.05 * Math.abs(tempAquario - tempAmbiente);
    }

    public static double [] volume2e3(double volLitros){
        double [] volumeDois = {volLitros * 2, volLitros * 3};
        return volumeDois;
    }
}
