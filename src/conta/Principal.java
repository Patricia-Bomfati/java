package conta;

public class Principal {

	public static void main(String[] args) {
		ContaCorrente contaJoao = new ContaCorrente(1000,1234);
		ContaCorrente contaMaria = new ContaCorrente(2000,4567);

		contaJoao.depositar(100);
		contaJoao.depositar(100);
		contaJoao.depositar(100);
		
		//System.out.println("Numero da conta do Joao:" + contaJoao.getNumero());
		
		contaJoao.setLimite(1500);
		System.out.println("limite conta joao R$" + contaJoao.getLimite());
		
		if (contaJoao.transferir(contaMaria,100))
			System.out.println("transferencia ok");
		else
			System.out.println("sem saldo para transferencia");

		if (contaJoao.sacar(500))
			System.out.println("Conseguiu sacar");
		else
			System.out.println("Nao conseguiu sacar");

		//System.out.println("Saldo da conta:" + contaJoao.getSaldo());
		
		System.out.println(contaJoao);

	}

}
