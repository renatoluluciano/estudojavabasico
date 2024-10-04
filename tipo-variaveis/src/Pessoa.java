public class Pessoa {

    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.parseInt(args[2]);
        double altura = Double.parseDouble(args[3]);

         System.out.println("Seu nome: "+nome+" "+sobrenome);
         System.out.println("Idade: "+idade);
         System.out.println("Altura: "+altura);
    }


    
}
