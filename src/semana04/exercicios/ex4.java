package semana04.exercicios;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        System.out.println("Programa para validar o codigo do funcionario");

        Scanner sc = new Scanner(System.in);

        System.out.println("entre com o codigo: ");
        String cod = sc.nextLine();
        sc.close();


        if (cod.startsWith("BR") && cod.endsWith("X") && cod.length() == 7 && !cod.equals("BR0000X")){
            String numeros = cod.substring(2,6);
            try {
                int codint = Integer.parseInt(numeros);
                System.out.println("Código Valido");
            } catch (Exception e){
                System.out.println("Código Invalido");
            }
        } 
        else{
            System.out.println("Codigo Invalido");
        }
        
    }
}
