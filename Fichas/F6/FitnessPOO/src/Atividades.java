import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;


public abstract class Atividades {

    private Integer id;
    private String descricao;
    private LocalDate data;
    private LocalTime duracao;
    private ArrayList<Utilizadores> utl;

    public Atividades(){
        this.id = 0;
        this.descricao = "";
        this.data = LocalDate.now();
        this.duracao = LocalTime.now();
        this.utl = new ArrayList<>();
    }

    public Atividades(Integer nId, String nDescricao, LocalDate nData, LocalTime nDuracao, ArrayList<Utilizadores> nUtl){
        this.id = nId;
        this.descricao = nDescricao;
        this.data = nData;
        this.duracao = nDuracao;
        this.utl = nUtl;
    }

    public Atividades (Atividades at){
        this.id = at.getId();
        this.descricao = at.getDescricao();
        this.data = at.getData();
        this.duracao = at.getDuracao();
        this.utl = at.getUtl();
    }

    public Integer getId(){
        return this.id;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public LocalDate getData(){
        return this.data;
    }

    public LocalTime getDuracao(){
        return this.duracao;
    }

    public ArrayList<Utilizadores> getUtl(){
        return this.utl;
    }

    public void setId(Integer nId){
        this.id = nId;
    }

    public void setDescricao(String nDescricao){
        this.descricao = nDescricao;
    }

    public void setData(LocalDate nData){
        this.data = nData;
    }

    public void setDuracao(LocalTime nDuracao){
        this.duracao = nDuracao;
    }

    public void setUtl(ArrayList<Utilizadores> nUtl){
        this.utl = nUtl;
    }

    public String toSting(){
        StringBuilder string = new StringBuilder();

        string.append("Atividades: ")
                .append("\nId: ").append(this.id)
                .append("\nDescricao: ").append(this.descricao)
                .append("\nData: ").append(this.data)
                .append("\nDuracao: ").append(this.duracao);

        return string.toString();
    }

    public boolean equals(Object p){
        if (p.getClass() == this.getClass()) return true;
        if (p == null || p.getClass() != this.getClass()) return false;

        Atividades at = (Atividades) p;

        return at.getId().equals(this.getId()) &&
                at.getDescricao().equals(this.getDescricao()) &&
                at.getData().equals(this.getData()) &&
                at.getDuracao().equals(this.getDuracao());
    }

    /*
    public Atividades clone(){
        return new Atividades(this);
    }
    */

    public abstract double calorias(Utilizadores user, LocalTime duracao);


}
