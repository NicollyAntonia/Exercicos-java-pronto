import java.util.Scanner;
public class Exercico02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nQuantas cocas colas voce deja levar? ");
        double coca = scanner.nextDouble();
        double valor = 16;
        double valorTotal;

        if (coca <= 12) {
            // Se a quantidade for até 12, valor total normal
            valorTotal = valor * coca;
        } else {
            // Se a quantidade for maior que 12, aplica desconto de 10%
            double desconto = 0.10 * valor; // 10% do valor unitário
            valor -= desconto; // Aplica o desconto no valor unitário
            valorTotal = valor * coca; // Calcula o valor total com o desconto
        }
        System.out.printf("\nO valor total da compra é: R$ %.2f\n", valorTotal);
        scanner.close();
    }
}
