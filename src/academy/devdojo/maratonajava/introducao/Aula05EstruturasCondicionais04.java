package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    // salarial anual 0 a  34,712 taxa de 9,7%
    // salarial anual 34,713 a 68,507 taxa de 37,35%
    //  salarial anual maior que 68,507 taxa de 48,50
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto = 0;

        if (salarioAnual < 34.713) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual <= 34.713 && salarioAnual < 68.508) {
            valorImposto = salarioAnual * segundaFaixa;
        } else if (salarioAnual >= 68.508) {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
