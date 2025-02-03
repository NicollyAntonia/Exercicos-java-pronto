import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 0; // Para contar o total de pessoas
        int saldoPositivo = 0; // Para contar as pessoas com saldo positivo
        int saldoNegativo = 0; // Para contar as pessoas com saldo negativo

        while (true) {
            // Solicita o saldo da pessoa
            System.out.print("Digite o saldo da pessoa: ");
            double saldo = scanner.nextDouble();

            // Contabiliza os saldos positivos e negativos
            if (saldo >= 0) {
                saldoPositivo++;
            } else {
                saldoNegativo++;
            }

            totalPessoas++; // Incrementa o total de pessoas

            // Pergunta se o usuário deseja continuar
            System.out.print("Deseja continuar informando saldos? (S - Sim, N - Não): ");
            String continuar = scanner.next();

            // Se a resposta for "N" ou qualquer coisa diferente de "S", o loop termina
            if (continuar.equalsIgnoreCase("N")) {
                break;
            }
        }

        // Exibe os resultados
        System.out.println("\nResultados:");
        System.out.println("Total de pessoas com saldo positivo: " + saldoPositivo);
        System.out.println("Total de pessoas com saldo negativo: " + saldoNegativo);

        // Calcula a porcentagem de pessoas com saldo positivo
        double percentualPositivo = (double) saldoPositivo / totalPessoas * 100;

        // Classificação de risco
        if (percentualPositivo >= 50) {
            System.out.println("Nenhum risco!");
        } else {
            System.out.println("Risco ao banco!");
        }
    }
}
