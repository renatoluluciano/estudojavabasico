import java.util.Scanner;

public class ListaNomes {
    public static void main(String[] args) {
	  
		Scanner leitura = new Scanner(System.in);
// TODO: complete os espaços em branco com sua solução para o problema
		
String[] nomes = new String[10];
		
		for(int i=0 ; i<10 ; i++){
			nomes[ i ] = leitura.nextLine();
		}
		
	System.out.println(nomes[2]);
	System.out.println(nomes[6]);
	System.out.println(nomes[8]);

	}
    
    
}
