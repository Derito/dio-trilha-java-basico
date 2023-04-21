
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);

      System.out.println("Por favor digite  o número da agencia!");
      String agencia = sc.nextLine();

      System.out.println("Por favor digite  o nome do cliente!");
      String nomeCliente = sc.nextLine();
      
      System.out.println("Por favor digite  o número da conta!");
      int numeroConta = sc.nextInt();

      System.out.println("Por favor digite  o valor a depositar!");
      Double saldo = sc.nextDouble();

      System.out.print("Olá "+ nomeCliente);
      System.out.print(", obrigado por criar uma conta no nosso banco, a sua Agencia é "+ agencia );
      System.out.print(",conta bancaria número "+ numeroConta );
      System.out.println(" e seu saldo é "+ saldo + " esta dispónivel para saque.");

      sc.close();
 
    }
}