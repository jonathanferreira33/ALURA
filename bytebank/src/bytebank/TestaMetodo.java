package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaA = new Conta();
		contaA.titular = "João da Silva";
		contaA.deposita(150.0);
		System.out.println(contaA.saldo);
		
		contaA.saca(20);
		System.out.println(contaA.saldo);
		
		contaA.saca(220);
		System.out.println(contaA.saldo);
		
		
		
		Conta contaB = new Conta();
		contaB.deposita(1000);
		contaB.transfere(300, contaA);
		
		System.out.println(contaB.saldo);
		System.out.println(contaA.saldo);
	}

}
