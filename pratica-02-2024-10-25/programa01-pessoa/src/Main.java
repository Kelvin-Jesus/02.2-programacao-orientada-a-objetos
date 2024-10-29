public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Kelvin", 23);
        
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
    
}
