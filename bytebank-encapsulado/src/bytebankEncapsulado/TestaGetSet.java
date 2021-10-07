package bytebankEncapsulado;

public class TestaGetSet {
	
	public static void main(String[] args) {
		
		
		
		Conta conta = new Conta(0001, 33332);
		
		System.out.println(conta.getNumero());
		
		
		Cliente jonathan = new Cliente();
		jonathan.setNome("jonathan Ferreira");
		
		conta.setTitular(jonathan);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setNome("Jonathan Ferreira");
	}
	

}
