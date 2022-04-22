import javax.swing.text.Utilities;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Fitness {

    private HashMap<String, Utilizadores> hashUtilizadores = new HashMap<>();

    public Fitness(){
        this.hashUtilizadores = new HashMap<>();
    }

    public Fitness(HashMap<String, Utilizadores> nHashUtilizadores){
        this.hashUtilizadores = nHashUtilizadores;
    }

    public Fitness(Fitness fit){
        this.hashUtilizadores = fit.getHashUtilizadores();
    }

    public HashMap<String, Utilizadores> getHashUtilizadores() {
        return this.hashUtilizadores;
    }

    public void setHashUtilizadores(HashMap<String, Utilizadores> nHashUtilizadores){
        this.hashUtilizadores = nHashUtilizadores;
    }

    public boolean equals(Object p){
        if (p.getClass() == this.getClass()) return true;
        if (p == null || p.getClass() != this.getClass()) return false;

        Fitness fit = (Fitness) p;

        return this.hashUtilizadores.equals(fit.hashUtilizadores);
    }

    public Fitness clone(){
        return new Fitness(this);
    }

    public String toString(){
        StringBuilder str = new StringBuilder();

        str.append("Fitness: ")
                .append("\nLista de users: ").append(hashUtilizadores);

        return str.toString();
    }

    //Fase 1:
    //a.
    public boolean existeUtilizador(String email){
        return hashUtilizadores.containsKey(email);
    }

    //b.
    public int quantosUtilizadores(){
        return hashUtilizadores.size();
    }

    //c.
    public int quantasAtividades(Atividades actividade, String email){
        int contador = 0;
        if (hashUtilizadores.containsKey(email)) {
            for (Atividades at: hashUtilizadores.get(email).getHistoricoAtividades()){
                if (at.equals(actividade)) contador++;
            }
        }
        return contador;
    }

    //d.
    public Utilizadores getUtilizador(String email){
        return hashUtilizadores.get(email);
    }

    //e.
    public void adicionaAtivAoUt(String email, Atividades at){
        hashUtilizadores.get(email).adicionaAtividade(hashUtilizadores.get(email).getHistoricoAtividades(), at);
    }

    //f.
    public List<Atividades> getAllActividades(){
        List<Atividades> lTodasAts = new ArrayList<>();
        return lTodasAts;
    }

    //g.
    public void adicionaConjAtivDeOutraLista(String email, ArrayList<Atividades> at){
        if (hashUtilizadores.containsKey(email)){
            for (Atividades ativ: at) {
                hashUtilizadores.get("email").getHistoricoAtividades().add(ativ);
            }
        }
        else{
            hashUtilizadores.put("email", new Utilizadores());
            hashUtilizadores.get("email").setHistoricoAtividades(at);
        }
    }
}
