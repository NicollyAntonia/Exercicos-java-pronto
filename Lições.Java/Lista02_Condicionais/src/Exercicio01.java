import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) { //atalho para esse , escreva psvm e depois de enter/tab
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite a idade desejada: ");
        int idade = scanner.nextInt();

        if (idade <= 14 && idade >= 0) {
            System.out.println("\nVocê é uma criança.");
        } else if (idade >= 15 && idade <= 17) {
            System.out.println("\nVocê é um adolescente.");
        } else if (idade >= 18 && idade <= 30) {
            System.out.println("\nVocê é um adulto jovem.");
        } else {
            System.out.println("\nVocê é um adulto.");
        }


        scanner.close();
    }
}
