import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalRespostas = 0;
        int respostasOtimo = 0;
        int respostasBom = 0;
        int respostasRuim = 0;
        int somaNotas = 0;

        while (true) {
            // Solicita a opinião do usuário
            System.out.println("Qual a sua opinião sobre o filme?");
            System.out.println("1 - Ótimo");
            System.out.println("2 - Bom");
            System.out.println("3 - Ruim");

            int resposta = scanner.nextInt();

            // Verifica a resposta do usuário
            if (resposta == 1) {
                respostasOtimo++;
                somaNotas += 1;
            } else if (resposta == 2) {
                respostasBom++;
                somaNotas += 2;
            } else if (resposta == 3) {
                respostasRuim++;
                somaNotas += 3;
            } else {
                System.out.println("Resposta inválida. Por favor, digite 1, 2 ou 3.");
                continue;
            }

            // Incrementa o total de respostas
            totalRespostas++;

            // Pergunta se o usuário deseja continuar
            System.out.print("Deseja continuar? (S - Sim, N - Não): ");
            String continuar = scanner.next();

            if (continuar.equalsIgnoreCase("N")) {
                break;
            }
        }

        // Calculando as porcentagens
        double percentualOtimo = (double) respostasOtimo / totalRespostas * 100;
        double percentualBom = (double) respostasBom / totalRespostas * 100;
        double percentualRuim = (double) respostasRuim / totalRespostas * 100;

        // Calculando a média das notas
        double mediaNotas = (double) somaNotas / totalRespostas;

        // Exibindo os resultados com printf
        System.out.println("\nResultados:");
        System.out.printf("Quantidade de respostas 'Ótimo': %d (%.2f%%)\n", respostasOtimo, percentualOtimo);
        System.out.printf("Quantidade de respostas 'Bom': %d (%.2f%%)\n", respostasBom, percentualBom);
        System.out.printf("Quantidade de respostas 'Ruim': %d (%.2f%%)\n", respostasRuim, percentualRuim);
        System.out.printf("Total de pessoas que responderam: %d\n", totalRespostas);
        System.out.printf("Média das notas: %.2f\n", mediaNotas);
    }
}
