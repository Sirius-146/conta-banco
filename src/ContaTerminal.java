import java.util.Scanner;

public class ContaTerminal {    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite seu nome: ");
        String nome_cliente = scanner.next();
        System.out.println("Por favor, insira o saldo: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá "+nome_cliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo é R$"+saldo+" já está disponível para saque\"");
    }
}
