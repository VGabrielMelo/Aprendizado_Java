package Exerc�cio1;

public class Carro {
	private String Modelo;
	private String Placa;
	private Double Pre�o;
	private String Cor;
	private String Ano;
	private Carro carro;
	
	public Carro(String Modelo,String Placa, Double Pre�o, String Cor, String Ano) {
		super();
		this.Modelo=Modelo;
		this.Placa=Placa;
		this.Pre�o = Pre�o;
		this.Cor = Cor;
		this.Ano = Ano;
	}

	
	public String getModelo() {
		return Modelo;
	}


	public void setModelo(String modelo) {
		Modelo = modelo;
	}


	public String getPlaca() {
		return Placa;
	}


	public void setPlaca(String placa) {
		Placa = placa;
	}


	public Double getPre�o() {
		return Pre�o;
	}


	public void setPre�o(Double pre�o) {
		Pre�o = pre�o;
	}


	public String getCor() {
		return Cor;
	}


	public void setCor(String cor) {
		Cor = cor;
	}

	
	public String getAno() {
		return Ano;
	}


	public void setAno(String ano) {
		Ano = ano;
	}


	public Carro getCarro() {
		return carro;
	}
	
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	
	
}
