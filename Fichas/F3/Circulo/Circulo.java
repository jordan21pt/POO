package Circulo;
public class Circulo{
    private double x;
    private double y;
    private double raio;

    public Circulo() {
        this.x = 0;
        this.y = 0;
        this.raio = 1;
    }
    
    public Circulo(double nx, double ny, double nraio){
        this.x = nx;
        this.y = ny;
        this.raio = nraio;
    }

    public Circulo (Circulo nCirculo){
        this.x = getX();
        this.y = getY();
        this.raio = getRaio();
    }

    public double getX() {
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double getRaio(){
        return this.raio;
    }

    public void setX(double nX) {
        this.x = nX;
    }

    public void setY(double nY){
        this.y = nY;
    }

    public void setRaio(double nRaio){
        this.raio = nRaio;
    }

    public void alteraCentro(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double calculaPerimetro() {
        return (2 * Math.PI * this.raio);
    }

    public double calculaArea(){
        return (Math.PI * this.raio * this.raio);
    }

    public Circulo clone(){
        return new Circulo(this);
    }

    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append("X: ").append(this.x)
              .append("\nY: ").append(this.y)
              .append("\nRaio: ").append(this.raio);
              
        return string.toString();
    }

    public boolean equals(Object p){
        if(p == this) return true;
        if(p == null || this.getClass() != p.getClass()) return false;
        Circulo circ = (Circulo) p;
        return this.x == circ.x && this.y == circ.y && this.raio == circ.raio;
    }
}