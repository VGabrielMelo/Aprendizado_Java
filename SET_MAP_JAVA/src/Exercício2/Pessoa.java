package Exercício2;

public class Pessoa {
	private String nome;
	private String cpf;
	private int idade;
	private Conta conta;
	
	public Pessoa(String nome, String cpf, int idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public void CriarConta(Conta conta) {
		setConta(conta);
		getConta().setPessoa(this);
	}
	

}
