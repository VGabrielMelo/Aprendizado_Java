package Exercício3;

public class Pessoa {
	private String nome;
	private String cpf;
	private int idade;
	private String PaisNascimento;
	private Lugar lugar;
	
	public Pessoa(String nome, String cpf, int idade, String PaisNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.PaisNascimento = PaisNascimento;
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
	
	
	public String getPaisNascimento() {
		return PaisNascimento;
	}
	public void setPaisNascimento(String paisNascimento) {
		PaisNascimento = paisNascimento;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Lugar getLugar() {
		return lugar;
	}
	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}
	
	public void EscolherLugar(Lugar lugar) {
		setLugar(lugar);
		getLugar().setPessoa(this);
	}

}
