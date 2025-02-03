//exercicio de calculos =,-,/,* e potencia

import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para capturar entradas
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira o primeiro número
        System.out.print("Digite o primeiro número : ");
        float valor1 = scanner.nextFloat(); // Lê um número

        // Solicitando ao usuário que insira o segundo número
        System.out.print("Digite o segundo número: ");
        float valor2 = scanner.nextFloat(); // Lê outro número

        // Somando os dois números
        float soma = valor1 + valor2;

        //Subtraindo os dois numeros
        float subtracao = valor1 - valor2;

        //Multiplicando os dois numeros
        float multiplicacao = valor1 * valor2;

        //Dividindo os dois numeros
        float divisao = valor1 / valor2;


        // Verificando se algum dos valores é 0 antes de fazer a divisão
        if (valor1 == 0 || valor2 == 0) {
            System.out.println("\nA divisão não pode ser feita com o número 0");
        } else {
            System.out.println("\nA divisão dos numeros é: " + divisao);
        }

        //Resto da divisão
        float resto = valor1 % valor2;
        System.out.println("O resto da divisão de " + valor1 + " por " + valor2 + " é " + resto);


        // Exibindo o resultado
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A subtração dos números é: " + subtracao);
        System.out.println("A multiplicação dos números é: " + multiplicacao);

        // Número base e expoente
        double base = valor1;
        double expoente = valor2;

        // Calculando a potência
        double resultadoPotencia = Math.pow(base, expoente);
        System.out.println(base + " elevado a " + expoente + " é " + resultadoPotencia);

        // Fechando o scanner
        scanner.close();
    }

}
