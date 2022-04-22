package F4;

import java.util.ArrayList;

public class CasaInteligente {
    
    private String divisao;
    private ArrayList<Lampada> lampadas; 

    public CasaInteligente(){
        this.divisao = "";
        this.lampadas = new ArrayList<Lampada>();
    }

    public CasaInteligente(String nDivisao, ArrayList<Lampada> nLampadas){
        this.divisao = nDivisao;
        this.lampadas = nLampadas;
    }

    public CasaInteligente(CasaInteligente ci){
        this.divisao = ci.getDivisao();
        this.lampadas = ci.getLampadas();
    }

    public String getDivisao(){
        return this.divisao;
    }

    public ArrayList<Lampada> getLampadas(){
        return this.lampadas;
    }

    public void setDivisão(String nDivisao){
        this.divisao = nDivisao;
    }

    public void setLampadas(ArrayList<Lampada> nLampadas){
        this.lampadas = nLampadas;
    }

    public boolean equals(Object p){
        if(this == p) return true;
        if(this == null || this.getClass() != p.getClass()) return false;

        CasaInteligente ci = (CasaInteligente) p;
        return this.getDivisao().equals(ci.getDivisao()) &&
               this.getLampadas().equals(ci.getLampadas());
    }

    public String toString(){
        StringBuilder str = new StringBuilder();

        str.append("\nDivisao: ").append(this.divisao)
            .append("\nLampadas: ").append(this.lampadas);

        return str.toString();
    }

    public CasaInteligente clone(){
        return new CasaInteligente(this);
    }
    //---------------------------------------------------------------------------

    //adiciona mais uma lampada a casa;
    public void addLampada(Lampada l){
        lampadas.add(l);
    }

    //liga no modo consumo maximo a lampada na posicao indicada
    public void ligaLampadaNormal(int index){
        lampadas.get(index).lampON();
    }

    //liga no modo consumo economico a lampada na posicao indicada
    public void ligaLampadaEco(int index){
        lampadas.get(index).lampECO();
    }

    //diz quantas lampadas estao ligadas em modo ECO
    public int qtEmEco(){
        long contador = lampadas.stream()
                        .filter(l -> l.getModo().equals(Lampada.Modo.ECO))
                        .count();

        int cont = (int) contador;

        return cont;
    }
    
    //remove uma lampada do arrayList numa dada posição
    public void removeLampada(int index){
        lampadas.remove(index);
    }

    //liga todas as lampadas de um arrayList em modo ECO
    public void ligaTodasEco(){
        for (Lampada lampada : lampadas) {
            lampada.lampECO();
        }
    }

    //ligas todas as lampadas de um arrayList no modo maximo
    public void ligaTodasMax(){
        for (Lampada lampada : lampadas) {
            lampada.lampON();
        }
    }

    //determina o consumo total de todas as lampadas de um arraylist
    public double consumoTotal(){
        double cont = 0;
        for (Lampada lampada : lampadas) {
            cont += lampada.totalConsumo();
        }
        return cont;
    }

    //determina a lampada que mais comsumiu
    public Lampada maisGastadora(){
        Lampada maisG = lampadas.get(0);

        for (Lampada lampada : lampadas) {
            if(lampada.totalConsumo() > maisG.totalConsumo()) maisG = lampada;
        }

        return maisG;
    }

    //devolve as tres lampadas mais economicas
    public ArrayList<Lampada> podiumEconomia(){
        ArrayList<Lampada> lamp = new ArrayList<>();
            Lampada menorC = lampadas.get(0);
            while(lamp.size() <= 3){
                for (Lampada lampada : lampadas) {
                    if (lampada.totalConsumo() < menorC.totalConsumo()) menorC = lampada;
                }
                if(!lamp.contains(menorC)) lamp.add(menorC);
            }
            return lamp;
    }
    
    //faz reset do contador de consumo parcial de todas as lampadas
    public void reset(){
        for (Lampada lampada : lampadas) {
            lampada.setPeriodoConsumo(0);
        }
    }

}
