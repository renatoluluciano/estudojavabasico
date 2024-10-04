
import java.lang.ref.Cleaner;
import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {

		
		
		Scanner scanner = new Scanner(System.in);

        double primeiraNota, segundaNota, mediaFinal;

       primeiraNota = scanner.nextDouble();
	   segundaNota = scanner.nextDouble();
		

        mediaFinal = ((primeiraNota * 3.5) + (segundaNota  * 7.5))/ 11; 

        System.out.printf("MÉDIA = %.5f ", mediaFinal );
        System.out.println();
	}

    
}
