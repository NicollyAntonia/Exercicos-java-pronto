import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //var nome = Fernanda; //não precisei declarar que a varaiavel era do tipo string
        //dessa forma sou obrigada a declarar seu valor se não ele não consegue descobrir o tipo da sua variavel
        // esses são tipos de tamanho que voce podera da  de forma que sua var ou seu input vai ocupar o tamanho que esses carinhas conseguem ler\armazenar o byte aguenta 127 caracteres,o short 32.767, o int 2.147.483.647, e o long  9.223.372.036.854.775.807.
        //precisa tomar cuiddado com qual voce vai usar , claro que isso vai depender de qual o valor quanto maior , mais sobe o espaço para armazenar voce vai estar usando , mas  o shor , long e os outros vão ocupar um certo espaço para armazenar podendo deixa seu codigo lento
        byte idade=40;
        //boolean para tipo booleano
        boolean éBrasileiro = true;
        //char usado para armazenar caracter e dentro dele eu não posso colocar uma string
        //Se eu quiser armazenar uma string eu vou armazenar uma string só que ela é importada de fora, pois não é um tipo primitivo de java e sim uma classe o que são coisas totalmente diferentes
        //double  e o float são usados para representar nu,eros com o ponto flutuante  diferença é a faixa de precisão.O double por exemplo é mais preciso para extidão de numeros com ponto flutuante(numeros depois da virgula), já o float é menos preciso uma vez que sua faix de representaação é menor , então é usado para representr pra representar numeros flutuantes simples
        double idade_1=45.6;
        float salario=400.45F;//Preciso colocar o F no final pra mostra que é do tipo float e nao double, caso não coloque vai apresentar um erro já que ele não vai conseguir identificar se é double ou float mesmo qeu indicado anteriormente

        //condicionais
        if (idade_1>45.70){
            System.out.println("\nVoce esta velho");
        }else if(idade_1 == 45.70) {
            System.out.println("\nEsta gaga jájájá");
        }else{
            System.out.println("\nVoce esta novo por enquanto");
        }
        //a sintaxe para declarar um array (lista[]) em java e bem parecida com a declaração de variavel
        //tipo [] idade_2;
        int [] idade_3;




    }
}