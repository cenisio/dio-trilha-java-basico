package com.dio.desafio_banco;

import lombok.Data;

@Data
public abstract class Conta {

	private final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.saldo = 0.0;
	}

	public boolean sacar(double valor) {
		if (valor > 0 && saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
		}
	}

	public boolean transferir(Conta contaDestino, double valor) {
		if (valor > 0 && saldo >= valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
			return true;
		}
		return false;
	}

	abstract void imprimirExtrato();
	 
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", cliente));
		System.out.println(String.format("Agência: %d", agencia));
		System.out.println(String.format("Número: %d", numero));
		System.out.println(String.format("Saldo: %.2f", saldo));
	}

}
