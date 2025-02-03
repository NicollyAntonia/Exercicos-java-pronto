import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número para a tabuada
        System.out.print("Digite um número: "); // Exibe uma mensagem para o usuário, pedindo para inserir um número.
        int numero = scanner.nextInt(); // Lê o número inteiro inserido pelo usuário e armazena na variável 'numero'.

        // Exibindo a tabuada do número solicitado
        System.out.println("Tabuada do " + numero + ":"); // Exibe uma mensagem mostrando qual número será utilizado para a tabuada.

        // Loop para gerar e exibir a tabuada de 0 a 10
        for (int i = 0; i <= 10; i++) { // Loop que vai de 0 até 10, representando os multiplicadores.
            int resultado = numero * i; // Realiza a multiplicação do número pelo multiplicador 'i' e armazena o resultado na variável 'resultado'.
            System.out.println(numero + " x " + i + " = " + resultado); // Exibe o resultado da tabuada no formato "número x multiplicador = resultado".
        }
    }
}
