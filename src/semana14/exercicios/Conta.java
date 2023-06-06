package semana14.exercicios;

public class Conta {
    private int codigo;
    private double saldo;
    private String correntista = new String();

    public Conta(int codigo, String correntista){
        if(codigo <= 0)
            throw new IllegalArgumentException("Codigo Invalido");

        int stringSize = correntista.length();
        if(stringSize < 5 || stringSize > 100)
            throw new IllegalArgumentException("Nome Do Correntista Invalido");
        
        this.codigo = codigo;
        this.correntista = correntista;
    }

    public double sacar(double sacar){
        if(saldo - sacar < 0)
            throw new IllegalArgumentException("Voce nao tem saldo disponivel suficiente na conta!");
        
        return saldo -= sacar;
    }

    public double depositar(double depositar){
        return saldo += depositar;
    }

    public double transferir(Conta codDestinatario, double transferir){
        if(saldo - transferir <= 0)
            throw new IllegalArgumentException("Voce nao tem saldo disponivel suficiente na conta!");

        codDestinatario.depositar(transferir);

        sacar(transferir);
        return saldo;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getCorrentista(){
        return correntista;
    }

    public double getSaldo(){
        return saldo;
    }
}
