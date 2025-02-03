import java.util.Scanner;

public class Exercico04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Valor base da viagem
        double valorBase = 3000.00;

        // Pergunta o destino da viagem
        System.out.println("Onde você pretende passar suas férias?");
        System.out.println("1 - Maceió");
        System.out.println("2 - Porto de Galinhas");
        System.out.print("Escolha o destino (1 ou 2): ");
        int destino = scanner.nextInt();

        // Pergunta se o valor incluirá almoço/janta
        System.out.print("Deseja incluir almoço/janta? (1 - Sim, 2 - Não): ");
        int incluirAlmocoJanta = scanner.nextInt();

        // Variável para armazenar o valor final
        double valorFinal = 0.0;

        // Calcula o valor com base no destino e na opção de incluir almoço/janta
        if (destino == 1) { // Maceió
            if (incluirAlmocoJanta == 1) {
                valorFinal = valorBase * 2; // 100% do valor base
            } else if (incluirAlmocoJanta == 2) {
                valorFinal = valorBase * 1.85; // 85% do valor base
            }
        } else if (destino == 2) { // Porto de Galinhas
            if (incluirAlmocoJanta == 1) {
                valorFinal = valorBase * 1.60; // 60% do valor base
            } else if (incluirAlmocoJanta == 2) {
                valorFinal = valorBase * 1.45; // 45% do valor base
            }
        }

        // Exibe o valor final da viagem
        System.out.printf("\nO valor final da viagem é: R$ %.2f\n", valorFinal);

        // Fecha o scanner (boas práticas)
        scanner.close();

    }
}
