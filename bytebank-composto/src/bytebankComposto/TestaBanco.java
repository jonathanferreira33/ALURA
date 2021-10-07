package bytebankComposto;

public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente jonathan = new Cliente();
		jonathan.nome = "Jonathan";
		jonathan.cpf = "12345678933";
		
		Conta contaJonathan = new Conta();
		contaJonathan.deposita(100000);
		
		
		System.out.println(jonathan);
		
		contaJonathan.titular = jonathan;
		
		System.out.println(contaJonathan.titular.nome);
		

	}
}
