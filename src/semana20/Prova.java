package semana20;

import java.util.List;

public class Prova{

    int pontuacao;
    List<Questao> questoes;

    public int somarPontuacao(){
        int pontuacao = 0;
        for (Questao questao : questoes) {
            if(questao.correcao == true){
                pontuacao++;
            }
        }
        return pontuacao;
    }

    public void addQuestao(Questao questao){
        questoes.add(questao);
    }

    public void removeQuestao(Questao questao){
        questoes.remove(questao);
    }
}