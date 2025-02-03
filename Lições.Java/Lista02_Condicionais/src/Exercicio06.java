import java.util.Scanner;
import java.util.Random;
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();//Criei uma instancia da classe ramdom
        int numeroSorte = random.nextInt(100) + 1;

        System.out.println("\nDigite um numero de 0 a 100 para tentar acertar: ");
        int numeroEscolhido = scanner.nextInt();
        if (numeroEscolhido == numeroSorte) {
            System.out.println("\nVocê acertou!");
        } else {
            System.out.println("\nVocê errou! O número da sorte era: " + numeroSorte);
        }
        scanner.close();
    }
}
