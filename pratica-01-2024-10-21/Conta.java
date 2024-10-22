public class Conta {
    public String nome;
    public int numeroDaConta;
    public float saldo;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getNumeroDaConta(int numeroDaConta) {
        return this.numeroDaConta;
    }
    
    public float getSaldo(float saldo) {
        return this.saldo;
    }
    
    public float sacar(float quantia) {
        this.saldo -= quantia;
        
        return this.saldo;
    }
    
    public float depositar(float depositar) {
        this.saldo += depositar;
        
        return this.saldo;
    }
    
}
