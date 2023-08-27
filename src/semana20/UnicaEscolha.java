package semana20;

public class UnicaEscolha extends Questao{
    public UnicaEscolha(int numero, String enunciado){
        super(numero, enunciado);
    }

    @Override
    public void addAlternativa(Alternativa alternativa){
        if(alternativa.getMarcada() == true){
            for (Alternativa atual : alternativas) {
                if (atual.getMarcada() == true) {
                    System.out.println("Ja existe uma alternativa verdadeira na questao");
                    break;
                }
            }
        } else {
            alternativas.add(alternativa);
        }
    }
}
