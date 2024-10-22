public class Conta {
    private String nome;
    private final int numeroDaConta;
    private double saldo;
    
    public static int totalDeContas = 0;
    
    public Conta(String nome, int numeroDaConta, double saldo) {
	this.nome = nome;
	this.numeroDaConta = numeroDaConta;
	this.saldo = saldo;
	totalDeContas++;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getNumeroDaConta() {
        return this.numeroDaConta;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public double sacar(double quantiaParaSacar) {
        if (quantiaParaSacar > this.saldo) 
		return 0;
	
        return this.saldo -= quantiaParaSacar;
    }
    
    public void depositar(float valorParaDepositar) {
	if (valorParaDepositar <= 0) {
		return;
	}
	
        this.saldo += valorParaDepositar;
        
        return;
    }
    
    public static int getTotalDeContas() {
	    return totalDeContas;
    }
    
    protected void finalize() {
	    totalDeContas--;
    }
}
