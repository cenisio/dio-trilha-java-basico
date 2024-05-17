import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o número da Agência:");
            String agencia = scanner.next();

            System.out.println("Digite o número da Conta Bancária:");
            int conta = scanner.nextInt();
            
            System.out.println("Digite o seu Nome:");
            String nome = scanner.next();
            
            System.out.println("Digite o Saldo:");
            Double saldo = scanner.nextDouble();
            
            scanner.close();
            System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque.");
        } catch (InputMismatchException e){
            System.out.println("Os campos Conta Bancária e Saldo precisam ser numéricos. Formato #0.0");
        }
    }
}