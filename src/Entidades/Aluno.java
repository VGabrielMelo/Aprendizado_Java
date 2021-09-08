package Entidades;


public class Aluno {
	private String Nome;
	private String Endereço;
	protected float  Nota_Tarefa;
	protected float  Nota_Prova;
	private int Matricula;
	private int Celular;
	private int Idade;
	private float Média;
	
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEndereço() {
		return Endereço;
	}
	public void setEndereço(String endereço) {
		Endereço = endereço;
	}
	public float getNota_Tarefa() {
		return Nota_Tarefa;
	}
	public void setNota_Tarefa(float nota_Tarefa) {
		Nota_Tarefa = nota_Tarefa;
	}
	public float getNota_Prova() {
		return Nota_Prova;
	}
	public void setNota_Prova(float nota_Prova) {
		Nota_Prova = nota_Prova;
	}
	public int getMatricula() {
		return Matricula;
	}
	public void setMatricula(int matricula) {
		Matricula = matricula;
	}
	public int getCelular() {
		return Celular;
	}
	public void setCelular(int celular) {
		Celular = celular;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public float getMédia() {
		return Média;
	}
	public void setMédia(float média) {
		Média = média;
	}
	
	public void Cálculo_Média(float nota_Tarefa, float nota_Prova) { 
		Média = ((nota_Prova + nota_Tarefa) / 2);
	}
	
	public void Aprovação(float média) {
		if (média >= 6) { System.out.print("Parabés " + Nome + ", você foi aprovado com a média " + média + "!!!");}
		else {System.out.print("Infelizmente você não foi aprovado " + Nome + " sua média foi de "+ média);}
	}
	
	
}
