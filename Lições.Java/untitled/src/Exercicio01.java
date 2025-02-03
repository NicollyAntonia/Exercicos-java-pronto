//cadastro para futura vaga na bosch

import java.util.Scanner;
public class Exercicio01 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite seu nome : ");
        String nome = scanner.nextLine();
        System.out.print("\nDigite seu sobrenome : ");
        String sobrenome = scanner.nextLine();
        System.out.print("\nDigite sua idade : ");
        String idade = scanner.nextLine();
        System.out.print("\nDigite sua data de nascimento: ");
        String data = scanner.nextLine();
        System.out.print("\nDigite seu  grau de ensino (médio,tecnico, e superior): ");
        String grauEscolar = scanner.nextLine();
        System.out.print("\nDigite sua pretenção salarial : ");
        double pretensaoSalarial = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("\nDigite seu cargo pretendido : ");
        String cargo = scanner.nextLine();
        System.out.print("\nPossui CNH do tipo B (sim ou nao) : ");
        String cnh = scanner.nextLine();


        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(idade);
        System.out.println(data);
        System.out.println(grauEscolar);
        System.out.println(pretensaoSalarial);
        System.out.println(cargo);
        System.out.println(cnh);
        System.out.println("\nCadastro concluido com sucesso! ");

        scanner.close();
    }
}
