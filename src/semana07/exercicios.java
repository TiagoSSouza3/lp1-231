package semana07;

public class exercicios{

    public static void main(String[] args) {
    }

    public static double somarTresNumeros(double x, double y, double z){
        return x + y + z;
    }

    public static double devolverMediaAtritimetica(double x, double y, double z){
        return (x + y + z)/3;
    }

    public static int devolverMaiorValor(int x, int y, int z){      
        if (x > y && x > z)
            return x;
        else{
            if (y > x && y > z)
                return y;
            else{
                return z;
            }
        }
    }

    public static int devolverMenorValor(int x, int y, int z){
        if (x < y && x < z)
            return x;
        else{
            if (y < x && y < z)
                return y;
            else{
                return z;
            }
        }
    }

    public static double [] devolveUmArray(double x, double y, double z){
        double [] valores = new double [3];

        valores[0] = x;
        valores[1] = y;
        valores[2] = z;

        return valores;
    }

    public static double devolverSomaDeArray(double [] valores){
        double soma = 0;

        for(double valor : valores){
            soma += valor;
        }
        return soma;
    }

    public static double devolverMediaDeArray(double [] valores){
        double soma = 0;

        for(double valor : valores){
            soma += valor;
        }
        return soma / valores.length;
    }

    public static double devolverMaiorNumeroArray(double [] valores){
        double maior = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > maior){
                maior = valores[i];
            }
        }
        return maior;
    }

    public static double devolverMenorNumeroArray(double [] valores){
        double menor = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] < menor){
                menor = valores[i];
            }
        }
        return menor;
    }

    public static int [] devolverUmArrayQueJuntaDois(int [] valores1, int [] valores2){
        int [] valorestotais = new int[valores1.length + valores2.length];
        
        for (int i = 0; i < valores1.length; i++) {
            valorestotais[i] = valores1[i];
        }

        for (int i = 0; i < valores1.length + valores2.length; i++) {
            valorestotais[i + valores1.length] = valores2[i];
        }

        return valorestotais;
    }
}