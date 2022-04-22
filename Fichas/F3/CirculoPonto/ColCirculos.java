package CirculoPonto;

import java.util.ArrayList;

public class ColCirculos {
    
    private ArrayList<CirculoPonto> circs;

    public ColCirculos(){
        this.circs = new ArrayList<CirculoPonto>();
    }

    public ColCirculos(ArrayList<CirculoPonto> nCircs){
        this.circs = nCircs;
    }

    public ColCirculos(ColCirculos nColCirculos){
        this.circs = nColCirculos.getCircs();
    }

    public ArrayList<CirculoPonto> getCircs(){
        ArrayList<CirculoPonto> res = new ArrayList<CirculoPonto>();
        for (CirculoPonto cp: this.circs) res.add(cp.clone());

        return res;
    }

    public void setCircs(ArrayList<CirculoPonto> nCircs){
        this.circs = nCircs;
    }

    //-------------------------//

    public ColCirculos clone(){
        return new ColCirculos(this);
    }

    public boolean equals(Object p){
        if(this == p) return true;
        if(this == null || p.getClass() != this.getClass()) return false;

        ColCirculos cc = (ColCirculos) p;
        return this.getCircs().equals(cc.getCircs());
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Colecao Circulos: ")
        .append(circs);

        return sb.toString();
    }

    //-------------------------//
    //-------------------------//

}