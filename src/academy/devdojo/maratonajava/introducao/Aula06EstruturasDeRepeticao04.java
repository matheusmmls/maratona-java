package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas ele pode ser parcelado.
    // Condição valorParcela >= 1000.
    public static void main(String[] args) {
        int valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;

            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " = R$ " + valorParcela);
            //if (valorParcela >= 1000) {

            //} else {
            //break;
            //}
            // resolução com muita linha foi comentada ja q a o if acima ja faz tudo.

        }

    }
}
