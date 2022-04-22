package LinhaEnc;

import java.time.LocalDate;
import java.util.ArrayList;

public class testLEncomenda {

    public static void main(String[] args) {
        
        LinhaEncomenda lenc1 = new LinhaEncomenda("9789787689", "teste", 12.0, 2, 0.23, 0.12);
        LinhaEncomenda lenc2 = new LinhaEncomenda("01928019381", "teste", 12.0, 2, 0.23, 0.12);


        System.out.println("\n\nle1: " + lenc1.toString());

        System.out.println("Valor total: " + lenc1.calculaValorLinhaEnc() + "€");
        System.out.println("Nesta encomenda poupou: " + lenc1.calculaValorDesconto() + "€");

        LinhaEncomenda lenc3 = lenc1.clone();

        lenc3.setDescontoComercial(0.13);
        lenc3.setDescricaoProduto("asdljqlda");
        lenc3.setPrecoSemIVA(5);

        System.out.println("\n\nle3: " + lenc3.toString());

        System.out.println("Valor total: " + lenc2.calculaValorLinhaEnc() + "€");
        System.out.println("Nesta encomenda poupou: " + lenc2.calculaValorDesconto() + "€");

        System.out.println("\n\n");

        System.out.println("Metodo equals: (lenc 2) e (lenc 3): "+ lenc2.equals(lenc3));
        System.out.println("Metodo equals: (lenc 1) e (lenc 3): "+ lenc1.equals(lenc3));

        // Encomendas ------- //
        ArrayList<LinhaEncomenda> lista1 = new ArrayList<LinhaEncomenda>();

        lista1.add(lenc1);
        lista1.add(lenc2);

        Encomendas enc1 = new Encomendas("Rui", "266875432", "rua santo adriao", "121231313", LocalDate.now(), lista1);

        System.out.println("\n\n" + enc1.toString());
        System.out.println("\nPreco da enc1: " + enc1.calculaValorTotal() + "€");
        System.out.println("\nDesconto da enc1: " + enc1.calculaValorDescontoTotal() + "€");
        System.out.println("\nQuantidade de artigos: " + enc1.numeroTotalProdutos() + " unidades.");
        System.out.println("\nArtigo 9789787689 na encomenda?: " + enc1.existeProdutoEncomenda("9789787689"));
        System.out.println("\nArtigo 121313113 na encomenda?: " + enc1.existeProdutoEncomenda("121313113"));
        
        enc1.removeProduto("9789787689");

        System.out.println(enc1.toString());        

    }
}
