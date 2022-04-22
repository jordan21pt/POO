public class OlaAlguem{

    public static String geraSaudacao(String nome){
        return "Olá " +nome+ "!";
    }

    public static void main(String[] args){
        String saudacao = geraSaudacao("Rui");
        System.out.println(saudacao);
    }

}