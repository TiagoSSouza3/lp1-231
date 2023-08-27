package semana20;

public class Alternativa{
    private boolean correcao = false;
    private String text;
    private boolean marcada;
    private boolean resposta;

    public Alternativa(String text, boolean marcada){
        this.text = text;
        this.marcada = marcada;
    }

    private void corrigir(){
        if(marcada == resposta){
            correcao = true;
        }
    }

    public boolean getCorrecao(){
        corrigir();
        return correcao;
    }

    public boolean getMarcada(){
        return marcada;
    }

    public void setResposta(boolean resposta){
        this.resposta = resposta;
    }

    public String getText() {
        return text;
    }
}