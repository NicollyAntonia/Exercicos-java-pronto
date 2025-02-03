import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número até onde o loop deve ir
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Solicitar o incremento
        System.out.print("Digite o incremento: ");
        int incremento = scanner.nextInt();

        // Exibindo os números de 0 até o número informado com o incremento
        System.out.print("Saída do programa: ");
        for (int i = 0; i <= numero; i += incremento) {
            // Exibindo o número na tela, com vírgula após cada número, exceto o último
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(i);
        }

        System.out.println(); // Para dar uma linha de quebra ao final
    }
}
