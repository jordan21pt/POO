import java.time.LocalTime;

public class Abdominais extends Atividades{

    private String tipoDeAbdominal;
    private int numRepeticoes;

    public Abdominais(){
        this.tipoDeAbdominal = "";
        this.numRepeticoes = 0;
    }

    public Abdominais(String nTipoDeAbdominal, int nNumRepeticoes){
        this.tipoDeAbdominal = nTipoDeAbdominal;
        this.numRepeticoes = nNumRepeticoes;
    }

    public Abdominais(Abdominais abs){
        this.tipoDeAbdominal = abs.getTipoDeAbdominal();
        this.numRepeticoes = abs.getNumDeRepeticoes();
    }

    public String getTipoDeAbdominal(){
        return this.tipoDeAbdominal;
    }

    public int getNumDeRepeticoes(){
        return this.numRepeticoes;
    }

    public void setTipoDeAbdominal(String nTipoDeAbdominal){
        this.tipoDeAbdominal = nTipoDeAbdominal;
    }

    public void setNumRepeticoes(int nNumRepeticoes){
        this.numRepeticoes = nNumRepeticoes;
    }

    public Abdominais clone(){
        return new Abdominais(this);
    }

    public boolean equals(Object p){
        if (p.getClass() == this.getClass()) return true;
        if (p == null || p.getClass() != this.getClass()) return false;

        Abdominais abs = (Abdominais) p;

        return abs.getTipoDeAbdominal().equals(this.getTipoDeAbdominal()) &&
                abs.getNumDeRepeticoes() == this.getNumDeRepeticoes();
    }

    public String toString(){
        StringBuilder str = new StringBuilder();

        str.append("Abdominais: ")
                .append("\nTipo de abdominal: ").append(this.tipoDeAbdominal)
                .append("\nNúmero de repetições: ").append(this.numRepeticoes);

        return str.toString();
    }

    public double calorias(Utilizadores user, LocalTime duracao){
        return (double) this.numRepeticoes * (duracao.getHour() * 60 + duracao.getMinute()) * 3/5;
    }

}
