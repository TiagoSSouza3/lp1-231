package semana12.exercicios;

public class Conta {
    int codigo;
    double saldo;
    String correntista = new String();

    public Conta(int codigo, String correntista){
        this.codigo = codigo;
        this.correntista = correntista;
        saldo = 0.0;
    }
}
