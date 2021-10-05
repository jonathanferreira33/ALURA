package packageTeste;

public class TestaConversaoDoubleParaInt {
	
	public static void main(String[] args) {
		double salario = 5250.50;
		int valor = (int) salario;
		System.out.println(valor); // type casting
		
		double valor1 = 0.2;
	    double valor2 = 0.1;
	    double total = valor1 + valor2;

	    System.out.println(total); //esperado: 0.30000000000000004
	    
	    /*
	    TIPO	TAMANHO
	    boolean	1 bit
	    byte	1 byte
	    short	2 bytes
	    char	2 bytes
	    int		4 bytes
	    float	4 bytes
	    long	8 bytes
	    double	8 bytes
	    */
		
	}

}
