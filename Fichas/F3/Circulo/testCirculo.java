package Circulo;

public class testCirculo{
    
    public static void main(String[] args){
        
        Circulo c1 = new Circulo(12,12,24);


        System.out.println("Circulo 1: \n" + c1.toString()); 

        c1.alteraCentro(14, 16);
        System.out.println("Circulo 1 + alteraCentro: \n" + c1.toString()); 

        c1.setRaio(3);
        System.out.println("Circulo 1 + setRaio: \n" + c1.toString()); 

        System.out.println("Circulo 1 + calculaArea: \n" + c1.calculaArea());

        System.out.println("Circulo 1 + calculaPerimetro: \n" + c1.calculaPerimetro());

        Circulo c2 = c1;
        System.out.println("Circulo 2 + clone(c1): \n" + c2.toString()); 

        System.out.println("Circulo 2 + equals(c1): \n" + c2.equals(c1)); 


    }
}
