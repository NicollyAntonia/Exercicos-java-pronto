public class DesafioMatematico {
    public static void main(String[] args) {
        // Calculando a expressão passo a passo

        // Parte 1: (3 * (-3/4)^(-2) + 6 * (3^(-1))/4 - 4)
        double primeiroTermo = 3 * Math.pow(-3.0 / 4.0, -2); // (-3/4)^(-2)
        double segundoTermo = 6 * Math.pow(3.0, -1) / 4.0; // 6 * (3^(-1)) / 4
        double parte1 = primeiroTermo + segundoTermo - 4;

        // Parte 2: (7 * (-3/4)^(-1) + 2)
        double terceiroTermo = 7 * Math.pow(-3.0 / 4.0, -1); // 7 * (-3/4)^(-1)
        double parte2 = terceiroTermo + 2;

        // A expressão final: ((parte1 / parte2) ^ -1) + 4
        double resultado = Math.pow(parte1 / parte2, -1) + 4;

        // Imprimir o resultado
        System.out.println("Resultado: " + resultado);
    }
}

