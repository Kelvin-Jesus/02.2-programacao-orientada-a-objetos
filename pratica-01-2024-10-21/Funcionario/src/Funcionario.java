public class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private String dataDeEntrada;
	private String RG;
	
	public static int quantidadeDeFuncionarios = 0;
	
	public Funcionario(String nome, String departamento, double salario, String dataDeEntrada, String rg) {
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.dataDeEntrada = dataDeEntrada;
		this.RG = rg;
		
		quantidadeDeFuncionarios++;
	}
	
	public static int getQuantidadeDeFuncionarios() {
		return quantidadeDeFuncionarios;
	}
	
	public String getNome() {
		return nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public double getSalario() {
		return salario;
	}

	public String getDataDeEntrada() {
		return dataDeEntrada;
	}

	public String getRG() {
		return RG;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setRG(String RG) {
		if (this.RG != "")
			return;
		
		this.RG = RG;
	}
	
	public void recebeAumento(double aumento) {
		this.salario += aumento;
	}
	
	public double calculaGanhoAnal() {
		return this.salario * 12;
	}
	
	public void trabalhar() {
		System.out.println("Funcionário " + this.nome + " está trabalhando...");
	}
}
