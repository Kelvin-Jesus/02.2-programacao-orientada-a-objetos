
import java.util.logging.Logger;

public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade) {
        this.idade = idade;
        this.nome = nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    
    public void fazAniversario() {
        setIdade(++this.idade);
                
        System.out.println(this.nome + " fez aniversário e agora tem " + this.idade + " anos!");
    }        
}
