package semana20;

public class Alternativa{
    public boolean correcao = false;
    private String text;
    private boolean marcada;
    private boolean resposta;

    public Alternativa(String text, boolean marcada){
        this.text = text;
        this.marcada = marcada;
    }

    public void correcao(){
        if(marcada == resposta){
            correcao = true;
        }
    }

    public void setResposta(boolean resposta){
        this.resposta = resposta;
    }
}