package LinhaEnc;

import java.time.LocalDate;
import java.util.ArrayList;

public class Encomendas {
    private String nome;
    private String nif;
    private String morada;
    private String idEncomenda;
    private LocalDate data;
    private ArrayList<LinhaEncomenda> lenc;

    public Encomendas(){
        this.nome = "";
        this.nif = "";
        this.morada = "";
        this.idEncomenda = "";
        this.data = LocalDate.now();
        this.lenc = new ArrayList<LinhaEncomenda>();
    }

    public Encomendas(String nNome, String nNif, String nMorada, 
    String nIdEncomenda, LocalDate nData, ArrayList<LinhaEncomenda> nLenc){
        this.nome = nNome;
        this.nif = nNif;
        this.morada = nMorada;
        this.idEncomenda = nIdEncomenda;
        this.data = nData;
        this.lenc = nLenc;
    }

    public Encomendas(Encomendas e){
        this.nome = e.getNome();
        this.nif = e.getNif();
        this.morada = e.getMorada();
        this.idEncomenda = e.getIdEncomenda();
        this.data = e.getData();
        this.lenc = e.getLenc();
    } 

    public String getNome(){
        return this.nome;
    }

    public String getNif(){
        return this.nif;
    }

    public String getMorada(){
        return this.morada;
    }

    public String getIdEncomenda(){
        return this.idEncomenda;
    }

    public LocalDate getData(){
        return this.data;
    }

    public ArrayList<LinhaEncomenda> getLenc(){
        return this.lenc;
    }

    public void setNome(String nNome){
        this.nome = nNome;
    }

    public void setNif(String nNif){
        this.nif = nNif;
    }

    public void setMorada(String nMorada){
        this.morada = nMorada;
    }

    public void setIdEncomenda(String nIdEncomenda){
        this.idEncomenda = nIdEncomenda;
    }

    public void setData(LocalDate nData){
        this.data = nData;
    }

    public void setLenc(ArrayList<LinhaEncomenda> nLenc){
        this.lenc = nLenc;
    }

    //--------------------------//

    public Encomendas clone(){
        return new Encomendas(this);
    }

    public boolean equals(Object p){
        if (p == this) return true;
        if (p == null || p.getClass() != this.getClass()) return false;

        Encomendas enc = (Encomendas) p;

        return this.getNome().equals(enc.getNome()) &&
        this.getNif().equals(enc.getNif()) &&
        this.getMorada().equals(enc.getMorada()) &&
        this.getIdEncomenda().equals(enc.getIdEncomenda()) && 
        this.getData().equals(enc.getData()) &&
        this.getLenc().equals(enc.getLenc());
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("\nEncomenda: \n")
        .append("\nNome do Cliente: ").append(this.getNome())
        .append("\nNIF: ").append(this.getNif())
        .append("\nMorada: ").append(this.getMorada())
        .append("\nID da encomenda: ").append(this.getIdEncomenda())
        .append("\nData: ").append(this.getData())
        .append("\nArtigos: ").append(lenc);

        return sb.toString();
    }

    //--------------------------//


    public void addLenc(LinhaEncomenda linha){
        lenc.add(linha);
    }

    public void removeProduto(String codProd){
        for(LinhaEncomenda lEncomenda: lenc){
            if (lEncomenda.getReferenciaProduto().equals(codProd)) 
                lenc.remove(lEncomenda);
        }
    }

    public double calculaValorTotal(){
        double soma = 0;
        for (LinhaEncomenda lEncomenda : this.lenc) {
            soma += lEncomenda.calculaValorLinhaEnc();
        } 
        return soma;
    }

    public double calculaValorDescontoTotal(){
        double desconto = 0;
        
        for(LinhaEncomenda lEncomenda : this.lenc){
            desconto += lEncomenda.calculaValorDesconto();
        }
        return desconto;
    }

    public int numeroTotalProdutos(){
        int cont = 0;
        
        for(LinhaEncomenda lEncomenda : this.lenc){
            cont += lEncomenda.getQuantidadeEncomendada();
        }
        return cont;
    }

    public boolean existeProdutoEncomenda(String refProduto){
        for(LinhaEncomenda lEncomenda : this.lenc){
            if (lEncomenda.getReferenciaProduto().equals(refProduto)) 
                return true;
        }
        return false;
    }
}


