import java.util.Scanner;

public class testeEx1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.a
        System.out.println("Quantos elementos tem o array? ");
        int tam = sc.nextInt();

        int[] uArray = new int[tam];


        for(int i = 0; i < tam; i++){
            System.out.println("Escolha o valor para a posição " + i + " do array:");
            uArray[i] = sc.nextInt();
        }
        
        System.out.println("O valor minimo do array é: " + ficha2ex1.minArray(uArray));


        //1.b
        System.out.println("Indice inferior do array? ");
        int minInd = sc.nextInt();
        System.out.println("Indice superior do array? ");
        int maxInd = sc.nextInt();

        ficha2ex1.arrayEntre(minInd,maxInd,uArray);
        

        //1.c
        System.out.println("Qual o tamanho do segundo array? ");
        int tam2 = sc.nextInt();

        int[] uArray2 = new int[tam];

        for(int i = 0; i < tam2; i++){
            System.out.println("Escolha o valor para a posição " + i + " do 2º array:");
            uArray2[i] = sc.nextInt();
        }

        int[] resp1c = new int[Math.max(uArray.length, uArray2.length)];
        ficha2ex1.elemsRepetidos(uArray, uArray2, resp1c);

        for(int  i = 0; i< resp1c.length; i++) System.out.println("array[" + i + "] = " + resp1c[i]);


        sc.close();

    }
}
