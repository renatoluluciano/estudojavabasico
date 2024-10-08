public class ParametrosInvalidosException extends Exception{

    public void ParametrosInvalidos(int parametroUm, int parametroDois){
        if(parametroUm > parametroDois){
            System.out.println("O Segundo parametro deve ser maior que o Primeiro");
    }


}
    
}
