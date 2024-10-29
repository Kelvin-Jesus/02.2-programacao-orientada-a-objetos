public class Casa {
    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;
    
    public Casa() {
        super();
    }
    
    public Casa(String cor, Porta porta1, Porta porta2, Porta porta3) {
        this.cor = cor;
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPorta1(Porta porta1) {
        this.porta1 = porta1;
    }

    public void setPorta2(Porta porta2) {
        this.porta2 = porta2;
    }

    public void setPorta3(Porta porta3) {
        this.porta3 = porta3;
    }
    
    public String getCor() {
        return cor;
    }

    public Porta getPorta1() {
        return porta1;
    }

    public Porta getPorta2() {
        return porta2;
    }

    public Porta getPorta3() {
        return porta3;
    }
    
    public void pinta(String cor) {
        this.cor = cor;
        
        System.out.println("A casa foi pintada na cor: " + this.cor);
    }
    
    public int quantasPortasEstaoAbertas() {
        Porta[] portas = {this.porta1, this.porta2, this.porta3};
        
        int contador = 0;
        for (int i = 0; i < portas.length; i++) {
            if (portas[i].isAberta())
                contador++;
        }
        
        return contador;
    }
    
    
}
