package semana10;

public class Programa{
    public static void main(String[] args) {
        // calcular a area e perimetro do retangulo
        // area = base * altura
        // perimetro = 2 * (base + altura)

        // Entrada
        double baseRet1 = 10;
        double alturaRet1 = 5;

        // Processamento
        double areaRet1 = calcularArea(baseRet1, alturaRet1);
        double perimetroRet1 = calcularPerimetro(baseRet1, alturaRet1);

        // Saida
        System.out.println(areaRet1);
        System.out.println(perimetroRet1);

        double baseRet2 = 30;
        double alturaRet2 = 10;

        double areaRet2 = calcularArea(baseRet2, alturaRet2);
        double perimetroRet2 = calcularPerimetro(baseRet2, alturaRet2);

        System.out.println(areaRet2);
        System.out.println(perimetroRet2);

        // Tipo nomevariavel = valor
        // String palavra = "abc";

        // Objeto(instância) da classe Retangulo
        Retangulo ret1 = new Retangulo();
        ret1.base = 10.0;
        ret1.altura = 5.0;

        Retangulo ret2 = new Retangulo();
        ret2.base = 30.0;
        ret2.altura = 30.0;

        System.out.println(ret1.calcularArea());
        System.out.println(ret1.calcularPerimetro());

        System.out.println(ret2.calcularArea());
        System.out.println(ret2.calcularPerimetro());

        Quadrado quad1 = new Quadrado();
        quad1.lado = 6.0;
        System.out.println(quad1.calcularArea());
        System.out.println(quad1.calcularPerimetro());

        Quadrado quad2 = new Quadrado();
        quad2.lado = 7.0;
        System.out.println(quad2.calcularArea());
        System.out.println(quad2.calcularPerimetro());


        Circulo circ1 = new Circulo();
        circ1.raio = 37.0;
        System.out.println(circ1.calcularArea());
        System.out.println(circ1.calcularCircunferencia());

        Circulo circ2 = new Circulo();
        circ2.raio = 1.0;
        System.out.println(circ2.calcularArea());
        System.out.println(circ2.calcularCircunferencia());
    }

    public static double calcularArea(double base, double altura){
        return base * altura;
    }

    public static double calcularPerimetro(double base, double altura){
        return 2 * (base + altura);
    }
}
