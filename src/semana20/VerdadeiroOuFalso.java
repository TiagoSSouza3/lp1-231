package semana20;

public class VerdadeiroOuFalso extends Questao{
    public VerdadeiroOuFalso(int numero, String enunciado){
        super(numero, enunciado);
    }

    @Override
    public void addAlternativa(Alternativa alternativa){
        alternativas.add(alternativa);
    }
}
