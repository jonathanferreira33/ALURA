package bytebankComposto;

public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaLigia = new Conta();
		System.out.println(contaLigia.getSaldo());
		
		contaLigia.titular = new Cliente();
		
		contaLigia.titular.nome = "Ligia";
		System.out.println(contaLigia.titular.nome);
	}

}
