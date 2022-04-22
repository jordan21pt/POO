package CirculoPonto;

public class CirculoPonto {

    private Ponto centro;
    private int raio;

    public CirculoPonto(){
        this.centro = new Ponto();
        this.raio = 0;
    }

    public CirculoPonto(Ponto nCentro, int nRaio){
        this.centro = nCentro;
        this.raio = nRaio;
    }

    public CirculoPonto(CirculoPonto nCirculoPonto){
        this.centro = nCirculoPonto.getCentro();
        this.raio = nCirculoPonto.getRaio();
    }

    public int getRaio(){
        return this.raio;
    }

    public Ponto getCentro(){
        return this.centro;
    }

    public void setRaio(int nRaio){
        this.raio = nRaio;
    }

    public void setCentro(Ponto nCentro){
        this.centro = nCentro;
    }

    //---------------------------------//

    public CirculoPonto clone(){
        return new CirculoPonto(this);
    }

    public boolean equals(Object p){
        if (p == this) return true;
        if (p == null || p.getClass() != this.getClass()) return false;

        CirculoPonto cp = (CirculoPonto) p;
        return this.getCentro().equals(cp.getCentro()) &&
            this.getRaio() == cp.getRaio();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Circulo: ")
        .append("\nCentro: ").append(this.centro)
        .append("\nRaio: ").append(this.raio);

        return sb.toString();
    }

    //---------------------------------//

    public double calculaPerimetro(){
        return 2 * Math.PI * this.raio;
    }

    public double calculaArea(){
        return Math.PI * this.raio * this.raio;
    }

}
