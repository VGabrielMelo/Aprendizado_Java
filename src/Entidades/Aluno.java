package Entidades;


public class Aluno {
	private String Nome;
	private String Endere�o;
	protected float  Nota_Tarefa;
	protected float  Nota_Prova;
	private int Matricula;
	private int Celular;
	private int Idade;
	private float M�dia;
	
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEndere�o() {
		return Endere�o;
	}
	public void setEndere�o(String endere�o) {
		Endere�o = endere�o;
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
	public float getM�dia() {
		return M�dia;
	}
	public void setM�dia(float m�dia) {
		M�dia = m�dia;
	}
	
	public void C�lculo_M�dia(float nota_Tarefa, float nota_Prova) { 
		M�dia = ((nota_Prova + nota_Tarefa) / 2);
	}
	
	public void Aprova��o(float m�dia) {
		if (m�dia >= 6) { System.out.print("Parab�s " + Nome + ", voc� foi aprovado com a m�dia " + m�dia + "!!!");}
		else {System.out.print("Infelizmente voc� n�o foi aprovado " + Nome + " sua m�dia foi de "+ m�dia);}
	}
	
	
}
