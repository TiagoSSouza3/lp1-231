package semana17.exercicio1;

import java.time.LocalDate;

public class ContaPoupanca extends Conta {

    private LocalDate aniversario;

    public ContaPoupanca(LocalDate aniversario, double saldo, double tarifa){
        super(saldo, tarifa);
        this.aniversario = aniversario;
    }

    public LocalDate aniversario(){
        return aniversario;
    }
    
    @Override
    public double calcularTarifa(){
        return tarifa;
    }
}
