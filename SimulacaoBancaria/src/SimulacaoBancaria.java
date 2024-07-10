import java.util.InputMismatchException;
import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            double saldo = 0;
            boolean continuar = true;
            double valor = 0;
            
            System.out.println("Escolha uma das opcoes do menu abaixo:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Encerrar");
            
            while (continuar) {

                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                        valor = scanner.nextDouble();
                        while(valor <= 0){
                            System.out.println("informe um valor maior que zero.\n");
                            valor = scanner.nextDouble();                    
                        } 
                        
                        saldo = saldo + valor;
                        System.out.printf("Saldo atual: %.1f\n", saldo);
                        break;
                    case 2:
                        // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                        valor = scanner.nextDouble();
                        while(valor <= 0){
                            System.out.println("informe um valor maior que zero.\n");
                            valor = scanner.nextDouble();                    
                        } 
                        if(saldo >= valor){
                            saldo = saldo - valor;
                            System.out.printf("Saldo atual: %.1f\n", saldo);
                        } else {
                            System.out.println("Saldo insuficiente.\n");
                        }
                        break;
                    case 3:
                        // TODO: Exibir o saldo atual da conta.
                        System.out.printf("Saldo atual: %.1f\n", saldo);
                        break;
                    case 0:
                        System.out.println("Programa encerrado.\n");
                        continuar = false;  // Atualiza a variável de controle para encerrar o loop
                        break;
                    default:
                        System.out.println("\n Opção inválida. Tente novamente.");
                        break;
                }
            }
            scanner.close();
        } catch (InputMismatchException e) {
            scanner.close();
            System.out.println("Os valores de entrada precisam ser numéricos.");
        }
    }
}
