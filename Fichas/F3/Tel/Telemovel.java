package Tel;
import java.util.ArrayList;

public class Telemovel
{
    private String marca;
    private String modelo;
    private int resX;
    private int resY;
    private int armSms;
    private int armTotalFotosApps;
    private int armFotos;
    private int armApps;
    private int armOcupado;
    private int fotosGuardadas;
    private int appsGuardadas;
    private ArrayList<String> nomeAppsGuardadas;
    
    public Telemovel(){
        this.marca = "marca";
        this.modelo = "modelo";
        this.resX = 0;
        this.resY = 0;
        this.armSms = 0;
        this.armTotalFotosApps = this.armFotos + this.armApps;
        this.armFotos = 0;
        this.armApps = 0;
        this.armOcupado -= (this.armTotalFotosApps + this.armSms);
        this.fotosGuardadas = 0;
        this.appsGuardadas = 0;
        this.nomeAppsGuardadas = new ArrayList<String>();
    }

    public Telemovel(String nMarca, String nModelo, int nResX, int nResY, int nArmSms,
             int nArmTotalFotosApps, int nArmFotos, int nArmApps, int nArmOcupado,
             int nFotosGuardadas, int nAppsGuardadas, ArrayList<String> nMensagens){
        this.marca = nMarca;
        this.modelo = nModelo;
        this.resX = nResX;
        this.resY = nResY;
        this.armSms = nArmSms;
        this.armTotalFotosApps = nArmTotalFotosApps;
        this.armFotos = nArmFotos;
        this.armApps = nArmApps;
        this.armOcupado = nArmOcupado;
        this.fotosGuardadas = nFotosGuardadas;
        this.appsGuardadas = nAppsGuardadas;
        this.nomeAppsGuardadas = nMensagens;
    }

    public Telemovel(Telemovel nTelemovel){
        this.marca = nTelemovel.getMarca();
        this.modelo = nTelemovel.getModelo();
        this.resX = nTelemovel.getResX();
        this.resY = nTelemovel.getResY();
        this.armSms = nTelemovel.getArmSms();
        this.armTotalFotosApps = nTelemovel.getArmTotalFotosApps();
        this.armFotos = nTelemovel.getArmFotos();
        this.armApps = nTelemovel.getArmApps();
        this.armOcupado = nTelemovel.getArmOCupado();
        this.fotosGuardadas = nTelemovel.getFotosGuardadas();
        this.appsGuardadas = nTelemovel.getAppsGuardadas();
        this.nomeAppsGuardadas = nTelemovel.getNomeAppsGuardadas();
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getResX(){
        return this.resX;
    }

    public int getResY(){
        return this.resY;
    }

    public int getArmSms(){
        return this.armSms;
    }

    public int getArmTotalFotosApps(){
        return this.armTotalFotosApps;
    }

    public int getArmFotos(){
        return this.armFotos;
    }

    public int getArmApps(){
        return this.armApps;
    }

    public int getArmOCupado(){
        return this.armOcupado;
    }

    public int getFotosGuardadas(){
        return this.fotosGuardadas;
    }

    public int getAppsGuardadas(){
        return this.appsGuardadas;
    }

    public ArrayList<String> getNomeAppsGuardadas(){
        return this.nomeAppsGuardadas;
    }

    public void setMarca(String nMarca){
        this.marca = nMarca;
    }

    public void setModelo(String nModelo){
        this.modelo = nModelo;
    }

    public void setResX(int nResX){
        this.resX = nResX;
    }
    
    public void setResY(int nResY){
        this.resY = nResY;
    }

    public void setArmSms(int nArmSms){
        this.armSms = nArmSms;
    }

    public void setArmTotalFotosApps(int nArmTotalFotosApps){
        this.armTotalFotosApps = nArmTotalFotosApps;
    }

    public void setArmFotos(int nArmFotos){
        this.armFotos = nArmFotos;
    }

    public void setArmApps(int nArmApps){
        this.armApps = nArmApps;
    }

    public void setArmOcupado(int nArmOcupado){
        this.armOcupado = nArmOcupado;
    }

    public void setFotosGuardadas(int nFotosGuardadas){
        this.fotosGuardadas = nFotosGuardadas;
    }

    public void setAppsGuardadas(int nAppsGuardadas){
        this.appsGuardadas = nAppsGuardadas;
    }

    public void setNomeAppGuardadas(){
        this.nomeAppsGuardadas = new ArrayList<String>();
    }

    public Telemovel clone(){
        return new Telemovel(this);
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Marca: ").append(this.marca)
           .append("\nModelo: ").append(this.modelo)
           .append("\nResolução-X: ").append(this.resX)
           .append("\nResolução-Y: ").append(this.resY)
           .append("\nArmazenamento de SMSs: ").append(this.armSms)
           .append("\nArmazenamento total fotos e apps: ").append(this.armTotalFotosApps)
           .append("\nArmazenamento fotos: ").append(this.armFotos)
           .append("\nArmazenamento apps: ").append(this.armApps)
           .append("\nArmazenamento ocupado: ").append(this.armOcupado)
           .append("\nNº de fotos: ").append(this.fotosGuardadas)
           .append("\nNº de apps: ").append(this.appsGuardadas);
           
           return str.toString();
    }

    public boolean equals(Object p){
        if (p == this) return true;
        if (p == null || this.getClass() != p.getClass()) return false;
        Telemovel tlm = (Telemovel) p;
        return this.marca == tlm.marca && this.modelo == tlm.modelo 
            && this.resX == tlm.resX && this.resY == tlm.resY
            && this.armSms == tlm.armSms && this.armTotalFotosApps == tlm.armTotalFotosApps
            && this.armFotos == tlm.armFotos && this.armApps == tlm.armApps
            && this.armOcupado == tlm.armOcupado && this.fotosGuardadas == tlm.fotosGuardadas
            && this.appsGuardadas == tlm.appsGuardadas;
    }

    public boolean existeEspaço(int numeroBytes){
        if (numeroBytes > armOcupado) return false;
        else return true;
    }

    public void instalaApp(String nome, int tamanho){
        if (existeEspaço(tamanho) == true){
            this.appsGuardadas++;
            this.armTotalFotosApps -= tamanho;
            this.armOcupado -= tamanho;
        }
    }

    /*
    public void recebeMsg(String msg){
        ArrayList mensagens = new ArrayList<>();
        mensagens.add(msg);
        this.armSms -= msg.length();

    }
    */
}
