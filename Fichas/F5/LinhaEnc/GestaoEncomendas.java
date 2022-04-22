package LinhaEnc;

import java.util.HashMap;

public class GestaoEncomendas {

    private HashMap<String, Encomendas> gestorEncomenda;

    public GestaoEncomendas(){
        this.gestorEncomenda = new HashMap<>();
    }

    public GestaoEncomendas(HashMap<String, Encomendas> nGestorEncomenda){
        this.gestorEncomenda = nGestorEncomenda;
    }

    public GestaoEncomendas(GestaoEncomendas nGE){
        this.gestorEncomenda = nGE.getGestorEncomenda();
    }

    public HashMap<String, Encomendas> getGestorEncomenda(){
        return this.gestorEncomenda;
    }

    public void setGestorEncomenda(HashMap<String,Encomendas> nGestorEncomenda){
        this.gestorEncomenda = nGestorEncomenda;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();

        str.append("Gestao Encomendas: \n")
                .append("listaEncomendas: ").append(gestorEncomenda);

        return str.toString();
    }

    public boolean equals(Object p){
        if (p == this) return true;
        if (p == null || p.getClass() != this.getClass()) return false;

        GestaoEncomendas ge = (GestaoEncomendas) p;
        return ge.getGestorEncomenda().equals(this.getGestorEncomenda());
    }

    public GestaoEncomendas clone(){
        return new GestaoEncomendas(this);
    }

    public Set<Integer> todosCodigosEnc(){
        return
    }

}
