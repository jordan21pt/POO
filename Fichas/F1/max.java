import java.util.Scanner;

public class max {

    public static int maximoNumeros(int a, int b){
        return Math.max(a, b); 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Indique um valor para o 'a':");
        int a = sc.nextInt();
        System.out.println("Indique um valor para o 'b':");
        int b = sc.nextInt();

        sc.close();

        int r = maximoNumeros(a,b); 

        System.out.println("O maior número é: " + r);
    }
}
