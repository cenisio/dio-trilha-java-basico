package com.dio.desafio_banco;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Banco banco = new Banco("Banco X");
		
		Cliente novoCliente = new Cliente("Pollyanna", "004.748.026-20");
		
		Conta cc = new ContaCorrente(novoCliente);
		Conta poupanca = new ContaPoupanca(novoCliente);
		
		banco.adicionarConta(cc);
		banco.adicionarConta(poupanca);
		
		cc.depositar(150);		
		cc.transferir(poupanca, 100);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		Conta conta = banco.buscarConta(1);
		if(conta != null) {
			System.out.println("Conta localizada: "+ conta.numero);
		} else  {
			System.out.println("Conta não localizada!");
		}
    }
}
