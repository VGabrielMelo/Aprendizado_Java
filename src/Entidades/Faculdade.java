package Entidades;

public class Faculdade {
	private String Nome_Institui��o;
	private String Cursos;
	private int Num_Funcion�rios;
	private int Num_Alunos;
	
	public String getNome_Institui��o() {
		return Nome_Institui��o;
	}
	public void setNome_Institui��o(String nome_Institui��o) {
		Nome_Institui��o = nome_Institui��o;
	}
	public String getCursos() {
		return Cursos;
	}
	public void setCursos(String cursos) {
		Cursos = cursos;
	}
	public int getNum_Funcion�rios() {
		return Num_Funcion�rios;
	}
	public void setNum_Funcion�rios(int num_Funcion�rios) {
		Num_Funcion�rios = num_Funcion�rios;
	}
	public int getNum_Alunos() {
		return Num_Alunos;
	}
	public void setNum_Alunos(int num_Alunos) {
		Num_Alunos = num_Alunos;
	}
	
	public void Percentual_pessoas() {
		Num_Funcion�rios = 24;
		Num_Alunos = 128;
		int Total_pessoas = Num_Funcion�rios + 	Num_Alunos;
		float Percentual_Funcion�rios = ((Num_Funcion�rios * 100) / Total_pessoas);	
		float Percentual_Alunos = ((Num_Alunos * 100) / Total_pessoas);
		System.out.println("o percentual de Funcion�rios � de " + Percentual_Funcion�rios + " % \n" + " enquanto que o percentual de Alunos � de " + Percentual_Alunos + " %, dentro da nossa faculdade?");
	}
	
}
