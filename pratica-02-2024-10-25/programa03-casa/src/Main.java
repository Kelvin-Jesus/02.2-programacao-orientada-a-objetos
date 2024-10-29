public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.pinta("Branco");
        
        Porta porta1 = new Porta(false, "Verde", 2, 3, 4);
        Porta porta2 = new Porta(true, "Preto", 2, 3, 4);
        Porta porta3 = new Porta(false, "Branco", 2, 3, 4);
        
        casa.setPorta1(porta1);
        casa.setPorta2(porta2);
        casa.setPorta3(porta3);
        
        porta3.setAberta(true);
        porta1.setAberta(true);
        
        System.out.println(casa.quantasPortasEstaoAbertas());
        
        porta2.setAberta(false);
        
        System.out.println(casa.quantasPortasEstaoAbertas());
    }
    
}
