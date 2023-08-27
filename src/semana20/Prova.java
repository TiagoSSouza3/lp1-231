package semana20;

import java.util.List;

public class Prova{

    int pontuacao;
    List<Questao> questoes;

    public int somarPontuacao(){
        int pontuacao = 0;
        for (Questao questao : questoes) {
            questao.compararPontuaçãoParcial();
            if(questao.correcao == true){
                pontuacao++;
            }
        }
        return pontuacao;
    }

    public void addQuestao(Questao questao){
        if (questao.size == 0) {
            System.out.println("Esta questão não possui alternativas");
        } else {
            questoes.add(questao);
        }
    }

    public void removeQuestao(Questao questao){
        questoes.remove(questao);
    }
}