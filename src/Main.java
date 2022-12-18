import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de minutos: ");
        int minutos = teclado.nextInt();

        int ano = 525600;
        int dia = 1440;

        int qtdAnos = minutos / ano;
        int qtdDias = (minutos % ano) / dia;



        System.out.println( minutos + " minutos equivalem a " + qtdAnos + " anos e "+ qtdDias + " dias");


    }
}