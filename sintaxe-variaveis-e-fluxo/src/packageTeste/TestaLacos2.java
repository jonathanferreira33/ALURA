package packageTeste;

public class TestaLacos2 {
	
	public static void main(String[] args) {
		for (int linha = 0; linha < 10; linha ++) {
			for (int coluna = 0; coluna <= linha; coluna++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
        for(int linha1 = 0; linha1 < 5; linha1++) {
            for (int coluna2 = 0; coluna2 < 5; coluna2++) {
                if ( coluna2 > linha1) {
                    break;
                }
                System.out.print( coluna2+1 );
            }
            System.out.println();
        }
        
        for(int j = 0; j <= 100; j++) {
        	if(j % 3 == 0) {
        		  System.out.println(j);
        		}
        }
	}
}
