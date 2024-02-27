import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        String[]nomes = new String[10];

        Scanner scanner = new Scanner(System.in);
        int i = 0;

        do {
            System.out.println("Digite " + (10 - i) + " nomes: ");
            nomes[i] = scanner.nextLine();
                i++;
        }while (i < 10);

        System.out.println(nomes[0]);

        System.out.println("Digite um nome para buscar: ");
        String nomeBusca = scanner.nextLine();
        List<String> nomeEncontrado =  Arrays.stream(nomes).filter(nome -> nome.equals(nomeBusca)).toList();
        int index = Arrays.asList(nomes).indexOf(nomeEncontrado.get(0));
        String mensagem = index >= 0 ? "Nome encontrado no index " + index : "Nome não encontrado";
        System.out.println(mensagem);
    }

}
