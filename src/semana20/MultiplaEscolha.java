package semana20;

public class MultiplaEscolha extends Questao{
    public MultiplaEscolha(int numero, String enunciado){
        super(numero, enunciado);
    }

    @Override
    public void addAlternativa(Alternativa alternativa){
        alternativas.add(alternativa);
    }
}
