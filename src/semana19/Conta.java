package semana19;

import java.time.LocalDate;

public abstract class Conta{

    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;
    private Correntista correntista;

    public Conta(int numero, LocalDate dataAbertura){
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        saldo = 0;
        tarifa = 0;
        correntista.addConta(this);
    }

    public Conta(double saldo2, double tarifa2) {
    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public abstract double calcularTarifa();

    public int getNumero(){
        return numero;
    }

    public LocalDate getDataAbertura(){
        return dataAbertura;
    }
}