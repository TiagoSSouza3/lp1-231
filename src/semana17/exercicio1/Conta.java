package semana17.exercicio1;

import java.time.LocalDate;

public class Conta{

    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;

    public Conta(int numero, LocalDate dataAbertura){
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        saldo = 0;
        tarifa = 0;
    }

    public Conta(double saldo2, double tarifa2) {
    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public double calcularTarifa(){
        return tarifa;
    }

    public int getNumero(){
        return numero;
    }

    public LocalDate getDataAbertura(){
        return dataAbertura;
    }
}