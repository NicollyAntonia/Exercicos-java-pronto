import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor de compra da mercadoria
        System.out.print("Digite o valor de compra da mercadoria: ");
        double valorCompra = scanner.nextDouble();

        // Calcula os valores do representante e dos impostos
        double valorRepresentante = valorCompra * 0.20; // 20% do valor de compra
        double valorImpostos = valorCompra * 0.30; // 30% do valor de compra

        // Calcula o valor de venda
        double valorVenda = valorCompra + valorRepresentante + valorImpostos;

        // Exibe os resultados usando printf
        System.out.println("\nDetalhes do cálculo:");
        System.out.printf("Valor do representante (20%%): R$ %.2f\n", valorRepresentante);
        System.out.printf("Valor dos impostos (30%%): R$ %.2f\n", valorImpostos);
        System.out.printf("Valor de venda: R$ %.2f\n", valorVenda);
    }
}
