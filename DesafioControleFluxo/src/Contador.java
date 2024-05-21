import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {

    public static void main(String[] args) {
        try{
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro: ");
            int param1= terminal.nextInt();
            System.out.println("Digite o segundo parâmetro: ");
            int param2= terminal.nextInt();

            try {
                contar(param1, param2);
                
            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }
        } catch (InputMismatchException e){
            System.out.println("Os parâmetros de entrada precisam ser numéricos inteiros.");
        }
}

    static void contar(int param1, int param2) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(param1>param2){
            throw new ParametrosInvalidosException("O parâmetro 1 deve ser menor que o 2.", new Throwable("Parâmetros inválidos"));
        }
		int contagem = param2 - param1;
		//realizar o for para imprimir os números com base na variável contagem
        for(int i=0; i<=contagem; i++){
            System.out.println("contando..."+param1++);
        }
	}
}
