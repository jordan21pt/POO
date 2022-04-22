package LinhaEnc;
/**
 * LinhaEncomenda
 */
public class LinhaEncomenda {

    private String referenciaProduto;
    private String descricaoProduto;
    private double precoSemIVA;
    private int quantidadeEncomendada;
    private double imposto;
    private double descontoComercial;

    public LinhaEncomenda(){
        this.referenciaProduto = "";
        this.descricaoProduto = "";
        this.precoSemIVA = 0;
        this.quantidadeEncomendada = 0;
        this.imposto = 0;
        this.descontoComercial = 0;
    }

    public LinhaEncomenda(String nRefernciaProduto, String nDescricaoProduto, double nPrecoSemIVA,
    int nQuantidadeEncomendada, double nImposto, double nDescontoComercial){
        this.referenciaProduto = nRefernciaProduto;
        this.descricaoProduto = nDescricaoProduto;
        this.precoSemIVA = nPrecoSemIVA;
        this.quantidadeEncomendada = nQuantidadeEncomendada;
        this.imposto = nImposto;
        this.descontoComercial = nDescontoComercial;
    }

    public LinhaEncomenda(LinhaEncomenda nLE){
        this.referenciaProduto = nLE.getReferenciaProduto();
        this.descricaoProduto = nLE.getDescricaoProduto();
        this.precoSemIVA = nLE.getPrecoSemIVA();
        this.quantidadeEncomendada = nLE.getQuantidadeEncomendada();
        this.imposto = nLE.getImposto();
        this.descontoComercial = nLE.getDescontoComercial();
    }

    public String getReferenciaProduto(){
        return this.referenciaProduto;
    }

    public String getDescricaoProduto(){
        return this.descricaoProduto;
    }

    public double getPrecoSemIVA(){
        return this.precoSemIVA;
    }

    public int getQuantidadeEncomendada(){
        return this.quantidadeEncomendada;
    }

    public double getImposto(){
        return this.imposto;
    }

    public double getDescontoComercial(){
        return this.descontoComercial;
    }

    public void setRefernciaProduto(String nReferenciaProduto){
        this.referenciaProduto = nReferenciaProduto;
    }

    public void setDescricaoProduto(String nDescricaoProduto){
        this.descricaoProduto = nDescricaoProduto;
    }

    public void setPrecoSemIVA(double nPrecoSemIVA){
        this.precoSemIVA = nPrecoSemIVA;
    }

    public void setQuantidadeEncomendada(int nQuantidadeEncomendada){
        this.quantidadeEncomendada = nQuantidadeEncomendada;
    }

    public void setImposto(double nImposto){
        this.imposto = nImposto;
    }

    public void setDescontoComercial(double nDescontoComercial){
        this.descontoComercial = nDescontoComercial;
    }
    
    public LinhaEncomenda clone(){
        return new LinhaEncomenda(this);
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("\nLinha De Encomenda: ")
        .append("\nReferência: ").append(this.referenciaProduto)
        .append("\nDescrição: ").append(this.descricaoProduto)
        .append("\nPreço sem iva: ").append(precoSemIVA)
        .append("\nQuantidade encomendada: ").append(this.quantidadeEncomendada)
        .append("\nValor iva: ").append(this.imposto).append("%")
        .append("\nDesconto comercial antes do imposto: ").append(this.descontoComercial).append("%");

        return str.toString();
    }

    public boolean equals(Object p){
        if (p == this) return true;
        if (p == null || this.getClass() != p.getClass()) return false;
        LinhaEncomenda le = (LinhaEncomenda) p;
        return  this.getReferenciaProduto().equals(le.getReferenciaProduto()) &&
                this.getDescricaoProduto().equals(le.getDescricaoProduto()) &&
                this.getPrecoSemIVA() == le.getPrecoSemIVA() &&
                this.getQuantidadeEncomendada() == le.getQuantidadeEncomendada() &&
                this.getImposto() == le.getImposto() &&
                this.getDescontoComercial() == le.getDescontoComercial();
    }

    public double calculaValorLinhaEnc(){
        return (this.precoSemIVA  + (this.precoSemIVA * this.imposto) - (this.precoSemIVA * this.descontoComercial)) * this.quantidadeEncomendada; 
    }
    
    public double calculaValorDesconto(){
        // quantidade * ((pBase + (valorIva)) - (pBase - (valorDesconto) + (Valor do iva))

        return this.quantidadeEncomendada * 
        ((this.precoSemIVA + (this.precoSemIVA * this.imposto)) - (this.precoSemIVA - (this.precoSemIVA * this.descontoComercial) + (this.precoSemIVA * this.imposto)));
    }
}