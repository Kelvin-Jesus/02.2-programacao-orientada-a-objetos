public class Main {
	public static void main(String[] args) {
		Funcionario f = new Funcionario("Kelvin", "Desenvolvimento", 1000, "06/04/2054", "9238478932");
		System.out.println(Funcionario.getQuantidadeDeFuncionarios());
		
		System.out.println("Ganho anual: " + f.calculaGanhoAnal());
		
		f.recebeAumento(100);
		System.out.println("Recebeu um aumento");
		System.out.println("Ganho anual: " + f.calculaGanhoAnal() + "\n");
		
		f.trabalhar();
		
		System.out.println(
			"O Funcionário de nome " + f.getNome() + 
			" e RG " + f.getRG() + "," +
			" trabalha no departamento de \"" + f.getDepartamento()+
			"\" e recebe um salário mensal de R$" + f.getSalario() + 
			" e anual R$" + f.calculaGanhoAnal() + "\n" + 
			f.getNome() + " começou na empresa em " + 
			f.getDataDeEntrada()
		);
	}
}
