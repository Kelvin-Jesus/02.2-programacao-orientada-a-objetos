public class Main {
    public static void main(String[] args) {
        Porta porta = new Porta(true, "Roxa", 1.23f, 3.4f, 56.f);
        
        porta.abre();
        porta.fecha();
        
        porta.pinta("Rosa");
        porta.pinta("Preto");
        porta.pinta("Âmbar");
        
        porta.setDimensaoX(20.0f);
        System.out.println("Está aberta? " + (porta.isAberta() ? "Sim" : "Não"));
        porta.abre();
        System.out.println("Está aberta? " + (porta.isAberta() ? "Sim" : "Não"));
    }
    
}
