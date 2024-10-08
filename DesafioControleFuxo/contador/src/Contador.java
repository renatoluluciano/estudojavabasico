import java.util.Scanner;



public class Contador {
    public static void main(String[] args) {
        Scanner leituraTerminal = new Scanner(System.in);

        System.out.println("Informe o Primeiro Parametro");
        int parametroUm = leituraTerminal.nextInt();
        System.out.println("Informe o Segundo Parametro");
        int parametroDois = leituraTerminal.nextInt();

        try {

            contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosException exception) {

                
        }


        
    }

    static void contar(int parametroUm, int parametroDois){
        
        int contagem = parametroDois - parametroUm;
    }

    

    
}
