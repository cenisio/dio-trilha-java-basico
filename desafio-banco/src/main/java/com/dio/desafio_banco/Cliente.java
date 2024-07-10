package com.dio.desafio_banco;

import lombok.Data;

@Data
public class Cliente {

	private String nome;
	private String cpf;
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Nome= " + nome + ", cpf= " + cpf;
	}
	
}
