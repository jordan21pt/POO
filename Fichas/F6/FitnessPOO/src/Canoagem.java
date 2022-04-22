import java.time.LocalTime;

public class Canoagem extends Atividades {

    private String embarcacao;
    private double ventoVelocidade;
    private String ventoDirecao;
    private double distanciaPercorrida;
    private int numVoltas;

    public Canoagem(){
        this.embarcacao = "";
        this.ventoVelocidade = 0;
        this.ventoDirecao = "";
        this.distanciaPercorrida = 0;
        this.numVoltas = 0;
    }

    public Canoagem(String nEmbarcacao, double nVentoVelocidade, String nVentoDirecao,
                    double nDistanciaPercorrida, int nNumVoltas){
        this.embarcacao = nEmbarcacao;
        this.ventoVelocidade = nVentoVelocidade;
        this.ventoDirecao = nVentoDirecao;
        this.distanciaPercorrida = nDistanciaPercorrida;
        this.numVoltas = nNumVoltas;
    }

    public Canoagem(Canoagem can){
        this.embarcacao = can.getEmbarcacao();
        this.ventoVelocidade = can.getVentoVelocidade();
        this.ventoDirecao = can.getVentoDirecao();
        this.distanciaPercorrida = can.getDistanciaPercorrida();
        this.numVoltas = can.getNumVoltas();
    }

    public String getEmbarcacao(){
        return this.embarcacao;
    }

    public double getVentoVelocidade(){
        return this.ventoVelocidade;
    }

    public String getVentoDirecao(){
        return this.ventoDirecao;
    }

    public double getDistanciaPercorrida(){
        return this.distanciaPercorrida;
    }

    public int getNumVoltas(){
        return this.numVoltas;
    }

    public void setEmbarcacao(String nEmbarcacao){
        this.embarcacao = nEmbarcacao;
    }

    public void setVentoVelocidade(double nVentoVelocidade){
        this.ventoVelocidade = nVentoVelocidade;
    }

    public void setVentoDirecao(String nVentoDirecao){
        this.ventoDirecao = nVentoDirecao;
    }

    public void setDistanciaPercorrida(double nDistanciaPercorrida){
        this.distanciaPercorrida = nDistanciaPercorrida;
    }

    public void setNumVoltas(int nNumVoltas){
        this.numVoltas = nNumVoltas;
    }

    public Canoagem clone(){
        return new Canoagem(this);
    }

    public boolean equals(Object p){
        if (p.getClass() == this.getClass()) return true;
        if (p == null || p.getClass() != this.getClass()) return false;

        Canoagem can = (Canoagem) p;

        return can.getEmbarcacao().equals(this.getEmbarcacao()) &&
                can.getVentoVelocidade() == this.getVentoVelocidade() &&
                can.getVentoDirecao().equals(this.getVentoDirecao()) &&
                can.getDistanciaPercorrida() == this.getDistanciaPercorrida() &&
                can.getNumVoltas() == this.getNumVoltas();
    }

    public String toString(){
        StringBuilder string = new StringBuilder();

        string.append("Canoagem: ")
                .append("\nEmbarcação: ").append(this.embarcacao)
                .append("\nVelocidade do vento: ").append(this.ventoVelocidade)
                .append("\nDireção do vento: ").append(this.ventoDirecao)
                .append("\nDistância percorrida: ").append(this.distanciaPercorrida)
                .append("\nNúmero de voltas que faltam: ").append(this.numVoltas);

        return string.toString();
    }

    public double calorias(Utilizadores user, LocalTime duracao){
        return this.distanciaPercorrida * this.ventoVelocidade * (duracao.getHour() * 60 + duracao.getMinute()) * user.calculaIdade()/4;
    }
}
