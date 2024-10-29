public class Porta {
    private boolean aberta;
    private String cor;
    private float dimensaoX;
    private float dimensaoY;
    private float dimensaoZ;
    
    public Porta(boolean aberta, String cor, float dimensaoX, float dimensaoY, float dimensaoZ) {
        this.aberta = aberta;
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setDimensaoX(float dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public void setDimensaoY(float dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public void setDimensaoZ(float dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    public boolean isAberta() {
        return aberta;
    }

    public String getCor() {
        return cor;
    }

    public float getDimensaoX() {
        return dimensaoX;
    }

    public float getDimensaoY() {
        return dimensaoY;
    }

    public float getDimensaoZ() {
        return dimensaoZ;
    }
    
    public void abre() {
        this.aberta = true;
        
        System.out.println("A porta foi aberta!");
    }
    
    public void fecha() {
        this.aberta = false;
        
        System.out.println("A porta foi fechada!");
    }
    
    public void pinta(String cor) {
        this.cor = cor;
        
        System.out.println("A porta foi pintada da cor: " + this.cor);
    }
 
    public boolean estaAberta() {
        return this.isAberta();
    }
}
