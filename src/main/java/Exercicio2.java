import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] inteiros = new int[10];

        System.out.println("Entre com os inteiros...");
        Scanner in = new Scanner(System.in);


        for (int i = 0; i < inteiros.length; i++) {
            System.out.println("Digite o %d inteiro:".formatted(i+1));
            inteiros[i] = in.nextInt();

        }

        System.out.println("Inteiros");
        Arrays.stream(inteiros).forEach(i-> System.out.println(i+" "));

        int acumulo = Arrays.stream(inteiros).sum();

        double media = acumulo/10.;

        System.out.println("A média é: %.2f".formatted(media));

        Arrays.stream(inteiros).filter(i->i>media).forEach(i-> System.out.println(i+" "));
    }
}
