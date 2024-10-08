

import java.util.Scanner; 
public class Problem {
    public static void main(String[] args) {
      	Scanner leitor = new Scanner(System.in);
        
    	int quantidadeRodadas = leitor.nextInt();
    	
    	String jogador1, jogador2;
// TODO: complete os espaços em branco com sua solução para o problema

    	for (int i = 0; i < quantidadeRodadas ; i++) {
            
    		jogador1 = leitor.next();
    		jogador2 = leitor.next();
            //Opções iguais.
    	if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque")) 
            System.out.println("Aniquilacao mutua");
    		else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel")) 
            System.out.println("Ambos venceram");
    		else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("pedra")) 
            System.out.println("Sem ganhador");
            //opções de jogador 1 
        else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("pedra")) 
            System.out.println("Jogador 1 venceu");
        else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("papel")) 
            System.out.println("Jogador 1 venceu");
        else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("papel")) 
            System.out.println("Jogador 1 venceu");
            //opções de jogador 2 vencendor
        else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("ataque")) 
            System.out.println("Jogador 2 venceu");
        else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("pedra")) 
            System.out.println("Jogador 2 venceu");
        else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("ataque")) 
            System.out.println("Jogador 2 venceu");
    	}
    }
}

