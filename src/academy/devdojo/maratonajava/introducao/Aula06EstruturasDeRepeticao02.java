package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // imprima todos os numeros pares de 0 ate 1000000
        int count = 0;

        while (count < 1000000) {
            count += 2;
            System.out.println(count);   // codigo que eu fiz do exercicio

        }

        for (int i = 0; i <= 1000000; i++) { // codigo correcao do professor, pra qqlr tipo de problema
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}
