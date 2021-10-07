package bytebankComposto;

public class TestaSacaValoresNegativos {
	
	public static void main(String[] args) {
		Conta contaHelena = new Conta();
		contaHelena.deposita(100);
		contaHelena.saca(200);
		System.out.println(contaHelena.getSaldo());
	}
}
