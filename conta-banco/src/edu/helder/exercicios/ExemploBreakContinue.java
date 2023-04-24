package exercicios;

public class ExemploBreakContinue {
    
    public static void main(String[] args) {

        for(int numero = 1; numero <= 5; numero ++){
            if(numero == 3)
            //break;
            //Ao detectar o break interrope a operação, logo vai imprimir 1 e 2 somente.
            continue;
            // Somente não imprime o 3

            System.out.println(numero);
        }
        
    }
}
