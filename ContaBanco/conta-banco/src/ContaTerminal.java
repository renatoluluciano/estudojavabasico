
import java.text.ParseException;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldoConta;

        System.out.println("Informe o seu Nome: ");

            nomeCliente = scanner.next();

        System.out.println("Informe o numero da Conta: ");

            numeroConta = scanner.nextInt();

        System.out.println("Informe o numero da Agencia: ");

            agencia = scanner.next();
        
        System.out.println("Informe o valor para deposito: ");

            saldoConta = scanner.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco"+
        ", sua agência é "+agencia+", conta "+numeroConta+" e o seu saldo é R$"+saldoConta+" ja está "+
        "disponivel para saque.");
    



    }
    
}
