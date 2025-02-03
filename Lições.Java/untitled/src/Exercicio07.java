import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os dados de entrada
        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();

        System.out.print("Digite o mês: ");
        String mes = scanner.nextLine();

        System.out.print("Digite o número de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total das vendas: R$ ");
        double valorTotalVendas = scanner.nextDouble();

        // Cálculos
        double salarioFixo = 1500.00;
        double comissaoPorCarro = 350.00;
        double bonusVendas = valorTotalVendas * 0.00001;  // 0,001% do valor total das vendas
        double comissaoTotal = carrosVendidos * comissaoPorCarro;

        // Cálculo do salário total
        double salarioTotal = salarioFixo + comissaoTotal + bonusVendas;

        // Exibe os resultados usando printf para formatar a saída
        System.out.println("\nDetalhes do pagamento do vendedor:");
        System.out.printf("Nome do vendedor: %s\n", nomeVendedor);
        System.out.printf("Mês: %s\n", mes);
        System.out.printf("Número de carros vendidos: %d\n", carrosVendidos);
        System.out.printf("Valor total das vendas: R$ %.2f\n", valorTotalVendas);
        System.out.printf("Comissão por carro vendido: R$ %.2f\n", comissaoTotal);
        System.out.printf("Bônus de vendas (0,001%%): R$ %.2f\n", bonusVendas);
        System.out.printf("Salário total: R$ %.2f\n", salarioTotal);
    }
}
