package semana05;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        System.out.println("Este programa diz quais as condições favoraveis para seu aquario");

        Scanner sc = new Scanner(System.in);

        float altura, largura, comprimento = 0;

        System.out.println("Digite a altura, a largura e o comprimento do aquario:");
        altura = sc.nextFloat();
        largura = sc.nextFloat();
        comprimento = sc.nextFloat();

        System.out.println("Entre com a temperatura ambiente do local do aquario: ");
        int tempAmbiente = sc.nextInt();
        System.out.println("Entre com a temperatura desejada do aquario: ");
        int tempAquario = sc.nextInt();

        float volLitros = (comprimento * altura * largura) / 1000;
        System.out.println("O volume em litros do aquario é de: " + volLitros + ("L"));

        double potencia = volLitros * 0.05 * (tempAquario - tempAmbiente);
        System.out.println("A temperatura ideal do termostato é de: " + potencia);

        float volLitros2 = volLitros*2;
        float volLitros3 = volLitros*3;
        System.out.println("A filtragem por hora deve ser entre: " + volLitros2 +"L e " + volLitros3 +"L");

        sc.close();
    }
}
