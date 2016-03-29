package br.ufpr.modelo;

import java.time.ZonedDateTime;

public class Contato {

	private Long id;
	private String nome;
	private String email;
	private String endereco;
	private ZonedDateTime dataNascimento;

	// métodos get e set para id, nome, email, endereço e dataNascimento

	public Contato() {
		// TODO Auto-generated constructor stub
	}

	
	public Contato(String nome, String email, String endereco, ZonedDateTime dataNascimento) {
		super();
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
	}


	public String getNome() {
		return this.nome;
	}

	public void setNome(String novo) {
		this.nome = novo;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String novo) {
		this.email = novo;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String novo) {
		this.endereco = novo;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long novo) {
		this.id = novo;
	}

	public ZonedDateTime getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(ZonedDateTime dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\n" + "email:" + email + "\n";
	}

}
