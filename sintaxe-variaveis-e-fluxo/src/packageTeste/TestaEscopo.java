package packageTeste;

public class TestaEscopo {

	public static void main(String[] args) {

		int quantidadePessoas = 3;
		boolean acompanhado;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		System.out.println(acompanhado);

		double salario = 3300.0;

		if (salario >= 1999.0 && salario <= 2800.0) {
			System.out.println("o IR � de 7.5% e pode deduzir na declara��o o valor de R$ 142");
		} else if (salario >= 2800.1 && salario <= 3751.0) {
			System.out.println("o IR � de 15% e pode deduzir R$ 350");
		} else if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("o IR � de 22.5% e pode deduzir R$ 636");
		}

	}
}
