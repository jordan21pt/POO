import java.util.Scanner;

public class doisNumerosMedia {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Valor do 'a': ");
        int a = sc.nextInt();
        System.out.println("Valor do 'b': ");
        int b = sc.nextInt();
        sc.close();

        String r = (Math.max(a, b) + "," +Math.min(a, b) + "," + "Media: " + ((a+b)/2));

        System.out.println(r);
    }

}
