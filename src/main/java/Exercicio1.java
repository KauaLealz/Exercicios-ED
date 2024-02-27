import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        int[] vetor = new int[7];

        Scanner leitorS = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {

            System.out.println("Digite um número:");
            int num = leitorS.nextInt();
            vetor[i] = num;
        }

        // exibindo numeros
        System.out.println("Parte 01");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("Parte 02");
        // exibindo lista ao contrario
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}
