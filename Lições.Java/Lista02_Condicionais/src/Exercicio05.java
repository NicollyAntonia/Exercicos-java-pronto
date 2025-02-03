import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite a quantidade em estoque: ");
        int estoqueAtual = scanner.nextInt();

        System.out.println("Digite a quantidade maxima em estoque que pode ser armazenada: ");
        int estoqueMaximo = scanner.nextInt();

        System.out.println("Digite a quantidade minima em estoque: ");
        int estoqueMinimo = scanner.nextInt();

        double quantidadeMedia = (estoqueMaximo + estoqueMinimo)/2.0;
        if(estoqueAtual>=quantidadeMedia){
            System.out.println("\n Não deve ser efetuada a compra");
        }else{
            System.out.println("\nDeve ser efetuada a compra");
        }
        scanner.close();
    }
}
