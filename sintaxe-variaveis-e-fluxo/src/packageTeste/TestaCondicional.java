package packageTeste;

public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais ");
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas >= 2;
		int idade = 10;
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Entrada proibida !");
		}
		
		
	}

}
