package semana19;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(double limite, double saldo, double tarifa){
        super(saldo, tarifa);
        this.limite = limite;
    }
    
    @Override
    public double calcularTarifa(){
        return tarifa * 1.5;
    }

    @Override
    public void sacar(double valor){
        if(valor > saldo + limite){
            throw new RuntimeException("O valor é maior que o seu saldo e seu limite");
        }
        if(saldo > valor){
            saldo = 0;
            valor -= saldo;
            limite -= valor;
        }
        saldo -= valor;
    }
}
