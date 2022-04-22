import java.util.Scanner;

public class converse {

    public static double eurosParaLibras(double valor, double taxaConversao){
        return valor * taxaConversao;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor a converter? ");
        double valor = sc.nextDouble();
        System.out.println("Qual a taxa de conversao? ");
        double taxaConversao = sc.nextDouble();

        sc.close();

        System.out.println("O valor em libras é: " + eurosParaLibras(valor, taxaConversao));
    }
}
