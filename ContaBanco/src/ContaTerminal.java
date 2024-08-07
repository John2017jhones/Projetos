import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o nome: ");
        String nome = scanner.next();

        System.out.println("Digite o sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o saldo: ");
        float saldo = scanner.nextFloat();

        System.out.println("Olá, " +nome+ " " +sobrenome+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +conta+ " e seu saldo é de R$" +saldo+ ", que já está disponível para saque.");
    }
}
