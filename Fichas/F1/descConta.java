import java.util.Scanner;

public class descConta {
    
    public static String criaDescricaoConta(String nome, double saldo){
        return ("Olá " + nome + ".\nO teu saldo é de " + saldo + "€.");
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Indique o nome: ");
        String nome = sc.nextLine();
        System.out.println("Valor do saldo: ");
        double saldo = sc.nextDouble();

        sc.close();
        
        System.out.println(criaDescricaoConta(nome, saldo));
    }

}
