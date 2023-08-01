package semana17.exercicio1;

public class ContaSalario extends Conta {

    public ContaSalario(double saldo, double tarifa){
        super(saldo, tarifa);
    }
    
    @Override
    public double calcularTarifa(){
        return tarifa;
    }
}
