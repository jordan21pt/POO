import jdk.jshell.execution.Util;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;


public class Utilizadores {

    private String email;
    private String password;
    private String nome;
    private String genero;
    private double altura;
    private double peso;
    private LocalDate dataNascimento;
    private String desportoFavorito;
    private ArrayList<Atividades> historicoAtividades;

    public Utilizadores(){
        this.email = "";
        this.password = "";
        this.nome = "";
        this.genero = "";
        this.altura = 0;
        this.peso = 0;
        this.dataNascimento = LocalDate.now();
        this.desportoFavorito = "";
        this.historicoAtividades = new ArrayList<>();
    }

    public Utilizadores(String nEmail, String nPassword, String nNome, String nGenero,
                        double nAltura, double nPeso, LocalDate nDataNascimento, String nDesportoFavorito, ArrayList<Atividades> nHistoricoAtividades){
        this.email = nEmail;
        this.password = nPassword;
        this.nome = nNome;
        this.genero = nGenero;
        this.altura = nAltura;
        this.peso = nPeso;
        this.dataNascimento = nDataNascimento;
        this.desportoFavorito = nDesportoFavorito;
        this.historicoAtividades = nHistoricoAtividades;
    }

    public Utilizadores(Utilizadores user){
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.nome = user.getNome();
        this.genero = user.getGenero();
        this.altura = user.getAltura();
        this.peso = user.getPeso();
        this.dataNascimento = user.getDataNascimento();
        this.desportoFavorito = user.getDesportoFavorito();
        this.historicoAtividades = user.getHistoricoAtividades();
    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

    public String getNome(){
        return this.nome;
    }

    public String getGenero(){
        return this.genero;
    }

    public double getAltura(){
        return this.altura;
    }

    public double getPeso(){
        return this.peso;
    }

    public LocalDate getDataNascimento(){
        return this.dataNascimento;
    }

    public String getDesportoFavorito(){
        return this.desportoFavorito;
    }

    public ArrayList<Atividades> getHistoricoAtividades(){
        return this.historicoAtividades;
    }

    public void setEmail(String nEmail){
        this.email = nEmail;
    }

    public void setPassword(String nPassword){
        this.password = nPassword;
    }

    public void setNome(String nNome){
        this.nome = nNome;
    }

    public void setGenero(String nGenero){
        this.genero = nGenero;
    }

    public void setAltura(double nAltura){
        this.altura = nAltura;
    }

    public void setPeso(double nPeso){
        this.peso = nPeso;
    }

    public void setDataNascimento(LocalDate nDataNascimento){
        this.dataNascimento = nDataNascimento;
    }

    public void setDesportoFavorito(String nDesportoFavorito){
        this.desportoFavorito = nDesportoFavorito;
    }

    public void setHistoricoAtividades(ArrayList<Atividades> nHistoricoAtividades){
        this.historicoAtividades = nHistoricoAtividades;
    }

    public boolean equals(Object p){
        if (this.getClass() == p.getClass()) return true;
        if (p == null || this.getClass() != p.getClass()) return false;

        Utilizadores ut = (Utilizadores) p;

        return ut.getEmail().equals(this.getEmail()) &&
                ut.getPassword().equals(this.getPassword()) &&
                ut.getNome().equals(this.getNome()) &&
                ut.getGenero().equals(this.getGenero()) &&
                ut.getAltura() == this.getAltura() &&
                ut.getPeso() == this.getPeso() &&
                ut.getDataNascimento().equals(this.getDataNascimento()) &&
                ut.getDesportoFavorito().equals(this.getDesportoFavorito()) &&
                ut.getHistoricoAtividades().equals(this.getHistoricoAtividades());
    }

    public String toString(){
        StringBuilder str = new StringBuilder();

        str.append("Utilizado: ")
           .append("\nEmail: ").append(this.email)
           .append("\nPassword: ").append(this.password)
                .append("\nNome: ").append(this.nome)
                .append("\nGenenro: ").append(this.genero)
                .append("\nAltura: ").append(this.altura)
                .append("\nPeso: ").append(this.peso)
                .append("\nData de Nascimento: ").append(this.dataNascimento)
                .append("\nDesporto Favorito: ").append(this.desportoFavorito)
                .append("\nHistórico de atividades: ").append(this.historicoAtividades);

        return str.toString();
    }

    public Utilizadores clone(){
        return new Utilizadores(this);
    }

    public void adicionaAtividade(ArrayList<Atividades> lAtividades, Atividades at){
        lAtividades.add(at);
    }

    public int calculaIdade(){
        return (int) ChronoUnit.YEARS.between(LocalDate.now(), this.getDataNascimento());
    }

}
