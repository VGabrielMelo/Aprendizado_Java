package Exercício2;

public class Conta {
	
	private int id;
	private String tipoconta;
	private String numeroconta;
	private Pessoa pessoa;
	
	public Conta(int id, String tipoconta, String numeroconta) {
		super();
		this.id = id;
		this.tipoconta = tipoconta;
		this.numeroconta = numeroconta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoconta() {
		return tipoconta;
	}

	public void setTipoconta(String tipoconta) {
		this.tipoconta = tipoconta;
	}

	public String getNumeroconta() {
		return numeroconta;
	}

	public void setNumeroconta(String numeroconta) {
		this.numeroconta = numeroconta;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
}
