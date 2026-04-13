package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //utilizando switch dado os valores de 1 a 7, impra se é dia util ou final de semana
        // considerando 1 com domingo
        byte dia = 7;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil!");
                break;
            default:
                System.out.println("Entrada inválida!");
                break;
        }
        // apartir do java 14 tem o swtich expression, segue como ficaria a resolução exercicio.
        //switch (dia) {
            //case 1,7 -> System.out.println("Final de semana!");
            //case 2,3,4,5,6 -> System.out.println("Dia útil!");
            //default -> throw new illegalArgumenteException("Unexpected value: " + dia);
        }
}
