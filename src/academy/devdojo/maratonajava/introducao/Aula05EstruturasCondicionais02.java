package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categria juvenil
        // idade >= 18 categoria adulto

        int idade = 17;
        String categoria; // se nao tivesse else, teria que inicializar a variavel (String categoria = "").

        if(idade < 15) {
            categoria = ("Você tem " +idade+ " anos, sua categoria é infantil.");
        } else if (idade >= 15 && idade < 18) {
            categoria = ("Você tem " +idade+ " anos, sua categoria é juvenil.");
        } else {
            categoria = ("Você tem " +idade+ " anos, sua categoria é adulto.");
        }

        //Exemplo Operador Ternario nesse exercicio. -> abaixo:  (obs: recomendado nao fazer)
        //categoria = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto";
        System.out.println(categoria);
    }
}
