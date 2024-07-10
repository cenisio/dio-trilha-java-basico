package com.dio.desafio_banco;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<Conta>();
	}
	
	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
	
	public Conta buscarConta(int numero) {
		for(Conta conta: contas) {
			if(conta.numero == numero) {
				return conta;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "Banco: " + nome ;
	}
}
