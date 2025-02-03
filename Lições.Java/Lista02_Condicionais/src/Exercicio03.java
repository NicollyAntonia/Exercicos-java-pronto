import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //pedindo para inserir o numeros de gols
        System.out.println("\nQuantos gols o Time A realizou: ");
        int timeA = scanner.nextInt();

        System.out.println("\nQuantos gols o Time B realizou: ");
        int timeB = scanner.nextInt();

        if (timeA>timeB) {
            // Se o time A tiver mais gols que o time B então ele ganhou
            System.out.println("\nO time A é o vencedor ");
        } if(timeB>timeA) {
            //Se o time B tiver mais gols que o time A então ele ganhou
            System.out.println("\nO time B é o vencedor ");
        }else {
            //Se ambos os times tiverem as mesmas quantidades de gols então houve um empate
            System.out.println("\nHouve um empate entre eles! ");
        }
    }
}
