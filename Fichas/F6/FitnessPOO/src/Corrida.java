import java.time.LocalTime;

public class Corrida extends Atividades{

    private double distanciaPercorrida;
    private double altimetriaGanha;
    private String percursoEfetuado;

    public Corrida(){
        this.distanciaPercorrida = 0;
        this.altimetriaGanha = 0;
        this.percursoEfetuado = "";
    }

    public Corrida(double nDistanciaPercorrida, double nAltimetriaGanha, String nPercursoEfetuado){
        this.distanciaPercorrida = nDistanciaPercorrida;
        this.altimetriaGanha = nAltimetriaGanha;
        this.percursoEfetuado = nPercursoEfetuado;
    }

    public Corrida(Corrida c){
        this.distanciaPercorrida = c.getDistanciaPercorrida();
        this.altimetriaGanha = c.getAltimetriaGanha();
        this.percursoEfetuado = c.getPercursoEfetuado();
    }

    public double getDistanciaPercorrida(){
        return this.distanciaPercorrida;
    }

    public double getAltimetriaGanha(){
        return this.altimetriaGanha;
    }

    public String getPercursoEfetuado(){
        return this.percursoEfetuado;
    }

    public void setDistanciaPercorrida(double nDistanciaPercorrida){
        this.distanciaPercorrida = nDistanciaPercorrida;
    }

    public void setAltimetriaGanha(double nAltimetriaGanha){
        this.altimetriaGanha = nAltimetriaGanha;
    }

    public void setPercursoEfetuado(String nPercursoEfetuado){
        this.percursoEfetuado = nPercursoEfetuado;
    }

    public boolean equals(Object p){
        if (this.getClass() == p.getClass()) return true;
        if (p == null || p.getClass() != this.getClass()) return false;

        Corrida run = (Corrida) p;

        return  run.getDistanciaPercorrida() == this.getDistanciaPercorrida() &&
                run.getAltimetriaGanha() == this.getAltimetriaGanha() &&
                run.getPercursoEfetuado().equals(this.getPercursoEfetuado());
    }

    public Corrida clone(){
        return new Corrida(this);
    }

    public String toString(){
        StringBuilder string = new StringBuilder();

        string.append("Corrida: ")
                .append("\nDistancia percorrida: ").append(this.distanciaPercorrida)
                .append("\nAltimetria ganha: ").append(this.altimetriaGanha)
                .append("\nPercurso efetuado: ").append(this.percursoEfetuado);

        return string.toString();
    }

    public void criaPNG(String perEfet){
        //..
    }

    public double calorias(Utilizadores user, LocalTime duracao){
            return this.distanciaPercorrida * user.getPeso() * (duracao.getHour() * 60 + duracao.getMinute()) * user.calculaIdade()/50;
    }

}
