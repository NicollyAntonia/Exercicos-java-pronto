import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar os dados da pessoa mais pesada e mais alta
        String nomeMaisPesada = "";
        double pesoMaisPesada = 0;
        String nomeMaisAlta = "";
        double alturaMaisAlta = 0;

        // Laço para pegar os dados de 6 pessoas
        for (int i = 1; i <= 6; i++) {
            System.out.println("Pessoa " + i + ":");

            // Solicita o nome, peso e altura da pessoa
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o peso: ");
            double peso = scanner.nextDouble();
            System.out.print("Digite a altura: ");
            double altura = scanner.nextDouble();

            // Limpa o buffer do scanner após ler o número
            scanner.nextLine(); // Para ler a nova linha após o nextDouble()

            // Verifica se a pessoa atual é a mais pesada
            if (peso > pesoMaisPesada) {
                pesoMaisPesada = peso;
                nomeMaisPesada = nome;
            }

            // Verifica se a pessoa atual é a mais alta
            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                nomeMaisAlta = nome;
            }
        }

        // Exibe os resultados
        System.out.println("\nPessoa mais pesada:");
        System.out.println("Nome: " + nomeMaisPesada + ", Peso: " + pesoMaisPesada + " kg");

        System.out.println("\nPessoa mais alta:");
        System.out.println("Nome: " + nomeMaisAlta + ", Altura: " + alturaMaisAlta + " m");
    }
}
