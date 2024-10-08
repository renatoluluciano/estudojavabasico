
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {

        selecaoCandidatos();
        
        
       
    }

    static void imprimirSelecao(List<String> candidatosSelecionadosLista){
       
        System.out.println("Imprimindo Lista de candidatos Selecionados");
        for(int indice=0; indice < candidatosSelecionadosLista.size(); indice++){
            System.out.println("Candidato: "+candidatosSelecionadosLista.get(indice));
        }

    }

    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE", "ANTONIO", "JOSE", "RENATO", "LUCIANO", "GAEL", "NATYELLEN", "THIAGO", "PEDRO", "NELI"};
        List<String> candidatosSelecionadosLista = new ArrayList();
        

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("Candidato: "+candidato+", Salario Pretendido: R$"+salarioPretendido);
            if(salarioBase >= salarioPretendido){           
                System.out.println("Candidato: "+candidato+" Selecionado");
                candidatosSelecionadosLista.add(candidato);
                candidatosSelecionados++;              
            }
            candidatoAtual++;
        }

        imprimirSelecao(candidatosSelecionadosLista);
        
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase >= salarioPretendido){
           
            System.out.println("Ligar para o Candidato.");
          
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com outra proposta.");
        }else{
            System.out.println("Aguardando Demais Candidatos.");
        }
        
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void ligarCandidatos(List<String> candidatosSelecionadosLista){

        for(String candidato: candidatosSelecionadosLista){
            int tentativaRealizadas = 1;
        }

    }

    static boolean atender(){

        return new Random().nextInt(3)==1;
    }

   
    
}
