package bytebankComposto;


public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	void deposita(double valor) {
		saldo += valor; //this é opcional nesse caso
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor ) {
			this.saldo -= valor;
			return true;
		}
		
		return false;
		
	}
	
	public boolean transfere(double valor, Conta contaDestino) {
		if(this.saldo >= valor) {
			saca(valor);
			contaDestino.deposita(valor);
			System.out.println("Transferencia realizada com sucesso");
			return true;
		}
		
		return false;
		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
}
