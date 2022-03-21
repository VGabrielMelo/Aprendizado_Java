package Exercício3;

public class Lugar {
	private String Cidade;
	private String Pais;
	private Pessoa pessoa;
	

	public Lugar(String Cidade, String Pais) {
		super();
		this.Cidade = Cidade;
		this.Pais = Pais;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
}
