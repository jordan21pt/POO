public class ficha2ex1 {
    
    //1.a
    public static int minArray(int[] array){
        int min = array[0];
        
        for(int i = 1; i < array.length; i++){
            if (array[i] < min) min = array[i];
        }

        return min;
    
    }

    //1.b
    public static int[] arrayEntre(int min, int max, int[] array){

        int[] resposta = new int[max-min+1];
        int j = 0;

        for(int i = min; i < max+1; i++, j++){
            resposta[j] = array[i];
        }

        for(int i = 0; i < max-min+1; i++){
            System.out.println("array[" + i + "] = " + resposta[i]);
        }
        return resposta;
    }

    //1.c
    public static int[] elemsRepetidos(int[] a1, int[] a2, int[] resposta){

        int k = 0;
        for(int i = 0; i < a1.length; i++){
            for(int j = 0; j < a2.length; j++){
                if (a1[i] == a2[j]) {
                    resposta[k] = a1[i];
                    k++;
                }
            }
        }
        
        return resposta;
    }



}