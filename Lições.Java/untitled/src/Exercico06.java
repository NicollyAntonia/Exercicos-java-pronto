import java.util.Scanner;
public class Exercico06 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite a primeira nota de peso 40%: ");
        Double nota_1 = scanner.nextDouble();

        System.out.println("\nDigite a segunda nota de peso 60%: ");
        Double nota_2 = scanner.nextDouble();

        double notaFinal = (nota_1 * 0.40) + (nota_2 * 0.60);
        System.out.println("\nA média é: "+notaFinal);

        scanner.close();
    }

}
