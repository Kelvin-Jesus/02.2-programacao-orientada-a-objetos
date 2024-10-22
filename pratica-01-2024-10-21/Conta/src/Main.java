public class Main {
	public static void main(String[] args) {
		Conta contaKelvin = new Conta("KJ", 1, 348.68);
		Conta contaMaria = new Conta("Maria", 2, 8053.34);
		
		Main.exibirConta(contaKelvin);
		Main.exibirConta(contaMaria);
		
		contaKelvin.depositar(100);
		System.out.println("saldo: " + contaKelvin.getSaldo());
		contaKelvin.sacar(100);
		System.out.println("saldo: " + contaKelvin.sacar(100));
		
		System.out.println("");
		
		contaMaria.depositar(100);
		System.out.println("saldo: " + contaMaria.getSaldo());
		System.out.println("saldo: " + contaMaria.sacar(5000));
		
		System.out.println("");
		
		Main.exibirConta(contaMaria);
		Main.exibirConta(contaKelvin);
		
//		contaKelvin.finalize();
		System.out.println("Total de Contas: " + Conta.getTotalDeContas());
	}
	
	public static void exibirConta(Conta conta) {
		System.out.println(
			"Nome do Titular: " + conta.getNome() + "\n" + 
			"Saldo: " + conta.getSaldo() + "\n" + 
			"Numero da Conta: " + conta.getNumeroDaConta() + "\n"
		);
	}
}
