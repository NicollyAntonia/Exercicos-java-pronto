import java.util.Scanner;
public class Exercicio04 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite um numero: ");
        int numero = scanner.nextInt();
        int decremento = numero -1;
        System.out.println("\nO numero anterior é : " +decremento);
        int incremento = numero + 1;
        System.out.println("\nOnumero após esse é:"+incremento);

        scanner.close();
    }
}
