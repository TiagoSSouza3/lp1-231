package semana03;

import java.util.Scanner;

public class Introducao {
    
    public static void main(String[] args){
            // Comentario de uma linha 

            /*
             * Comentario de varias
             * linhas
             */

            /* Tipos primitivos
             * Inteiros
             * byte, short, int, long
             */

            //byte n1 = 100; // 1 byte - -128 a 127
            //short n2 = 3000; // 2 bytes - -32768 a 32767
            //int n3 = 21321321; // 4 bytes - 2 bilhoes
            //long n4 = 32322323; // 8 bytes

            //Ponto flutuante
            //float nota1 = 10.34343f; // 4 bytes
            //double nota2 = 10.276354915; // 8 bytes

            //Char
            //char letra = 'A';

            //Boolean
            //boolean ligado = true;
            //Java 10 - inferência de tipo com var
            //var idade3 = 15;
            //var nome2 = "maria";

            //Constante - keyword final
            //final double teste = 20.2;
            //final double PI = 3;

            //Entrada e saída de dados
            //Entrada - Classe Scanner
            //Saída - System.out

            Scanner sc = new Scanner(System.in);

            System.out.println("entre com seu nome");
            String nomeinformado = sc.nextLine();

            System.out.println("entre com a sua idade");
            int idadeinformada = sc.nextInt();

            System.out.println(nomeinformado + " " + idadeinformada);
            System.out.printf("%s %d \n", nomeinformado, idadeinformada);

            sc.close();


    }

}
