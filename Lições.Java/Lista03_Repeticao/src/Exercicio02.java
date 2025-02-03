import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um array para armazenar os 10 números
        int[] numeros = new int[10];

        // Solicitando os 10 números ao usuário
        System.out.println("Digite 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        while (true) {
            // Menu de opções para o usuário
            System.out.println("\nO que você deseja saber?");
            System.out.println("1. Quantos números pares?");
            System.out.println("2. Quantos números ímpares?");
            System.out.println("3. Quantos números negativos?");
            System.out.println("4. Quantos números positivos?");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();

            // Usando switch para tratar a opção escolhida
            switch (opcao) {
                case 1:
                    // Contando os números pares
                    int pares = 0;
                    for (int num : numeros) {
                        if (num % 2 == 0) {
                            pares++;
                        }
                    }
                    System.out.println("Quantidade de números pares: " + pares);
                    break;

                case 2:
                    // Contando os números ímpares
                    int impares = 0;
                    for (int num : numeros) {
                        if (num % 2 != 0) {
                            impares++;
                        }
                    }
                    System.out.println("Quantidade de números ímpares: " + impares);
                    break;

                case 3:
                    // Contando os números negativos
                    int negativos = 0;
                    for (int num : numeros) {
                        if (num < 0) {
                            negativos++;
                        }
                    }
                    System.out.println("Quantidade de números negativos: " + negativos);
                    break;

                case 4:
                    // Contando os números positivos
                    int positivos = 0;
                    for (int num : numeros) {
                        if (num > 0) {
                            positivos++;
                        }
                    }
                    System.out.println("Quantidade de números positivos: " + positivos);
                    break;

                case 5:
                    // Saindo do programa
                    System.out.println("Saindo...");
                    System.exit(0);  // Termina o programa
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}
