import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  perguntas e respostas
        String pergunta1 = "\nQual é a capital do Brasil?";
        String pergunta2 = "\nQuem escreveu 'Dom Casmurro'?";

        String alternativa1_1 = "a) Brasília";
        String alternativa1_2 = "b) Rio de Janeiro";
        String alternativa1_3 = "c) São Paulo";
        String respostaCorreta1 = "a"; // resposta correta

        String alternativa2_1 = "a) Machado de Assis";
        String alternativa2_2 = "b) José de Alencar";
        String alternativa2_3 = "c) Clarice Lispector";
        String respostaCorreta2 = "a"; // resposta correta

        //  qual pergunta o usuário deseja responder
        System.out.println("\nVocê deseja responder a pergunta 1 ou 2?");
        int escolha = scanner.nextInt();
        scanner.nextLine();  // Consome a linha em branco deixada pelo nextInt()

        // variáveis para pergunta e alternativas
        String pergunta = "";
        String alternativa1 = "";
        String alternativa2 = "";
        String alternativa3 = "";
        String respostaCorreta = "";

        //  pergunta e alternativas com base na escolha
        if (escolha == 1) {
            pergunta = pergunta1;
            alternativa1 = alternativa1_1;
            alternativa2 = alternativa1_2;
            alternativa3 = alternativa1_3;
            respostaCorreta = respostaCorreta1;
        } else if (escolha == 2) {
            pergunta = pergunta2;
            alternativa1 = alternativa2_1;
            alternativa2 = alternativa2_2;
            alternativa3 = alternativa2_3;
            respostaCorreta = respostaCorreta2;
        } else {
            System.out.println("\nOpção inválida! O programa será encerrado.");
            return;
        }

        //  pergunta e alternativas
        System.out.println(pergunta);
        System.out.println(alternativa1);
        System.out.println(alternativa2);
        System.out.println(alternativa3);

        // Solicita a resposta do usuário
        System.out.print("\nSua resposta: ");
        String respostaUsuario = scanner.nextLine().toLowerCase(); // Converte a resposta para minúsculo

        // Verifica se a resposta está correta
        if (respostaUsuario.equals(respostaCorreta)) {
            System.out.println("\nVocê acertou, pode retirar seu bônus na Shostners and Shostners");
        } else {
            System.out.println("\nVocê não acertou, mas tente novamente numa próxima.");
        }

        scanner.close();
    }
}
