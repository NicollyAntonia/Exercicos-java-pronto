import java.util.Scanner;
public class Exercicio05 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite o numero de horas: ");
        int horas = scanner.nextInt();
        System.out.println("\nDigite o numero de minutos: ");
        int minutos = scanner.nextInt();
        System.out.println("\nDigite o numero de segundos: ");
        int segundos = scanner.nextInt();

        int total= (horas * 3600) + (minutos * 60) + segundos;
        System.out.println("\nO total em segundos é: "+total);

        scanner.close();


    }
}
