package semana20;

import java.util.List;

public abstract class Questao{
    
    public boolean correcao;    
    protected int numero;
    protected String enunciado;
    private int pontuacaoParcial;
    protected List<Alternativa> alternativas;
    public int size = alternativas.size();

    protected Questao(int numero, String enunciado){
        this.numero = numero;
        this.enunciado = enunciado;
    }

    public void compararPontuaçãoParcial(){
        pontuacaoParcial();
        if(pontuacaoParcial == size){
            correcao = true;
        } else {
            correcao = false;
        }
    }

    private void pontuacaoParcial(){
        for (Alternativa alternativa : alternativas) {
            if(alternativa.getCorrecao() == true){
                pontuacaoParcial++;
            }
        }
    }

    abstract protected void addAlternativa(Alternativa alternativa);

    public void removeAlternativa(Alternativa alternativa){
        if (size == 0) {
            System.out.println("Não existem alternativas nesta questão");
        } else {
            alternativas.remove(alternativa);
        }
    }

    public String getEnunciado(){
        return enunciado;
    }

    public int getNumero(){
        return numero;
    }
}