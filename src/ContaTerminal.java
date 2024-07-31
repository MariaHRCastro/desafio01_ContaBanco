import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o número da agência: ");
        String agencia = sc.nextLine();
        System.out.print("Digite o nome do cliente: ");        
        String cliente = sc.nextLine();
        System.out.print("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();
        
        System.out.println("Olá "+cliente+", obrigado por criar uma conta em nosso banco! Sua agência é "+ agencia +", conta "+ numero +" , e seu saldo de "+ String.format("%.2f",saldo)+"!");

        sc.close();
    }
}
