package semana17.exercicio2;

public class Vendedor {
    
    protected String nome;
    protected double vendas;
    protected double comissao;

    public Vendedor(String nome, double vendas, double comissao){
        this.nome = nome;
        this.comissao = comissao;
        this.vendas = vendas;
    }

    public double obterSalario(){
        return vendas * (comissao/100);
    }
}
