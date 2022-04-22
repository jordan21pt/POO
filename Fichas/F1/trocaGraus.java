import java.util.Scanner;

public class trocaGraus {

    public static double celsiusParaFarenheit(double graus){
        return ((graus * 1.8) + 32); 
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor em graus celsius que deseja converter: ");
        double graus = input.nextDouble();

        double r = celsiusParaFarenheit(graus);

        input.close();

        System.out.println(r);
    }
}
