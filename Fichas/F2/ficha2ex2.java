public class ficha2ex2 {
    
    //2.a
    public void leAtualizaNotas(int[][] array, int novaNota, int numAluno, int idUC){
        array[numAluno][idUC] = novaNota; 
    }

    //2.b  array -> Alunos X UCs
    public int somaNotasUc(int[][] array, int idUC){
        int soma = 0;

        for(int i = 0; i < 5; i++){
            soma += array[i][idUC];
        }

        return soma;
    }

    public int mediaAluno(int[][] array, int numAluno){
        int nUcs = 5;
        int soma = 0;

        for(int i = 0; i < 5; i++){
            soma += array[numAluno][i];
        }
        
        return soma/nUcs;
    }

    public int mediaUc(int[][] array, int idUC){
        int nAlunos = 5;
        return somaNotasUc(array, idUC) / nAlunos;
    }

    public int notaMaisAlta(int[][] array){
        int max = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if (max < array[i][j]) max = array[i][j];
            }
        }
        return max;
    }

    public int notaMaisBaixa(int[][] array){
        int min = 20;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if (min > array[i][j]) min = array[i][j];
            }
        }
        return min;
    }

    public int[] notasAcimaValor(int[][] array, int nota){
        int[] arrayNotasSup = new int[25]; 
        int k = 0;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if (array[i][j] > nota){
                    arrayNotasSup[k] = array[i][j];
                    k++;
                }            
            }
        }
        return arrayNotasSup;
    }

    public String valorParaString(int[][] array){
        StringBuilder resp = new StringBuilder();

        for(int i = 0; i < 5; i++){
            resp.append("\nAluno " + (i+1) + ": \n\n");
            for(int j = 0; j < 5; j++){
                resp.append("UC " + (j+1) + ": " + array[i][j] + "\n");
             }
        }
        return resp.toString();
    }

    public int maxMediaUCs(int[][] array){
        int max = 0; 
        int sum = 0;
        int media = 0;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                sum = array[i][j];
                
            }
        }

        return max;
    }
}
