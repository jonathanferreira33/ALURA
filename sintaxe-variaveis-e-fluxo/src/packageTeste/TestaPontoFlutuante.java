package packageTeste;

public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		
		double salario;
		salario = 1250.70;
		
		System.out.println("Seu salário é: " + salario);
		
		//errado
		int divisao = 5 / 2;
		System.out.println(divisao);
		
		//errado
		double outraDivisao = 5 / 2;
		System.out.println(outraDivisao);
		
		
		//correto
		double terceiraDivisao = 5.0 / 2;
		System.out.println(terceiraDivisao);
		
		
		
	}

}
