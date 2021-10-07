package bytebankEncapsulado;

public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(0001, 33333);
		Conta conta1 = new Conta(0001, 33337);
		Conta conta2 = new Conta(0001, 33339);
		
		
		System.out.println(conta.getAgencia());
		System.out.println(Conta.getTotal());
	}
}
