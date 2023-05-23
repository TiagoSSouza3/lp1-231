package semana12.exercicios;

public class Conta {
    int codigo;
    double saldo;
    String correntista = new String();

    public Conta(int codigo, String correntista){
        if(codigo <= 0)
            throw new IllegalArgumentException("Codigo Invalido");
        
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
}
