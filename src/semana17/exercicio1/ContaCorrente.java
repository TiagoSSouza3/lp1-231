package semana17.exercicio1;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(double limite, double saldo, double tarifa){
        super(saldo, tarifa);
        this.limite = limite;
    }
    
    @Override
    public double calcularTarifa(){
        return tarifa * limite;
    }

    @Override
    public void sacar(double valor){
        if(0 > saldo - valor){
            saldo = 0;
            valor -= saldo;
            if(0 > limite - valor){
               System.out.println("O valor que vc quer sacar é maior que seu limite");
            } else { limite -= valor; }
        } else { saldo -= valor; }
    }
}
