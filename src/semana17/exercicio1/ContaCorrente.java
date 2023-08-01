package semana17.exercicio1;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(double limite, double saldo, double tarifa){
        super(saldo, tarifa);
        this.limite = limite;
        if(saldo > limite)
            throw new RuntimeException("o saldo não deve exeder o limite estabelecido");
    }
    
    @Override
    public double calcularTarifa(){
        return tarifa * limite;
    }

    public void sacar(double valor){
        saldo -= valor;
    }
}
