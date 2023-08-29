package semana21;

import java.util.ArrayList;

// interface = contrato
// conjunto de métodos (somente assinatura, sem corpo)
// classe concreta que IMPLEMENTA a interface

// Quadrado - lado - calcular Area/Perimetro
// Retangulo - base, altura - calcular Area/Perimetro
// Circulo - ...

public class Main{
    public static void main(String[] args) {
        System.out.println("Main...");

        Tela tela = new Tela();
        Quadrado q1 = new Quadrado(10);
        Quadrado q2 = new Quadrado(20);
        Retangulo r1 = new Retangulo(10, 5);

        tela.addFigura(q1);
        tela.addFigura(q2);
        tela.addFigura(r1);

        System.out.println(tela.areaTotal());
        System.out.println(tela.perimetroTotal());
        System.out.println(tela.getNumeroFiguras());

        // List, Set, Map

        ArrayList<String> nomes = new ArrayList<>();

        // Adicionar
        nomes.add("Quem vai encarar o campeao"); // 0
        nomes.add("Sem X");                      // 1
        nomes.add("Bazar");                      // 2
        nomes.add("Sem X");                      // 3

        // Tamanho
        System.out.println(nomes.size());

        // Remove
        nomes.remove(1);
        // nomes.remove("Sem X");

        // Remover todos os elementos da lista
        nomes.clear();

        // Pegar valor
        System.out.println(nomes.get(0));

        // Pegar todos os valores
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        for (String nome : nomes) {
            System.out.println(nome);
        }

        

    }
}