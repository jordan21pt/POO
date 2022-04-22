
public class testeEx2{

    public static void main(String[] args) {
    
        int[][] notasTurma = new int[5][5];

        //ex2.leAtualizaNotas(notasTurma, novaNota, numAlun, idUC);

        ficha2ex2 ex2 = new ficha2ex2();

        //ex2.a
        ex2.leAtualizaNotas(notasTurma, 12, 3, 1);
        //System.out.println(notasTurma[3][1]);

        //ex2.b
        ex2.leAtualizaNotas(notasTurma, 12, 0, 1);
        ex2.leAtualizaNotas(notasTurma, 15, 1, 1);
        ex2.leAtualizaNotas(notasTurma, 7, 2, 1);
        ex2.leAtualizaNotas(notasTurma, 12, 3, 1);
        ex2.leAtualizaNotas(notasTurma, 16, 4, 1);
        //System.out.println("A soma das notas é: " + ex2.somaNotasUc(notasTurma, 1));
        
        //ex2.c
        ex2.leAtualizaNotas(notasTurma, 12, 3, 0);
        ex2.leAtualizaNotas(notasTurma, 15, 3, 1);
        ex2.leAtualizaNotas(notasTurma, 7, 3, 2);
        ex2.leAtualizaNotas(notasTurma, 12, 3, 3);
        ex2.leAtualizaNotas(notasTurma, 16, 3, 4);
        //System.out.println("A média do aluno é: " + ex2.mediaAluno(notasTurma, 3));


        //ex2.d
        ex2.leAtualizaNotas(notasTurma, 12, 0, 4);
        ex2.leAtualizaNotas(notasTurma, 15, 1, 4);
        ex2.leAtualizaNotas(notasTurma, 7, 2, 4);
        ex2.leAtualizaNotas(notasTurma, 12, 3, 4);
        ex2.leAtualizaNotas(notasTurma, 16, 4, 4);
        //System.out.println("A media da uc é: " + ex2.mediaUc(notasTurma, 4));


        //ex2.e
        //System.out.println("A nota mais alta é: " + ex2.notaMaisAlta(notasTurma));
    
        //ex2.f
        //System.out.println("A nota mais baixa é: " + ex2.notaMaisBaixa(notasTurma));
    

        //ex2.h
        System.out.println(ex2.valorParaString(notasTurma));
    }
}