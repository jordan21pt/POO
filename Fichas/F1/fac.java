import java.util.Scanner;

public class fac {
    
    public static long factorial(int num){
        long r = 1;
        while(num > 0){
            r *= num;
            num--;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique um número: ");
        int num = sc.nextInt();

        sc.close();

        System.out.println(factorial(num));
    }
}
