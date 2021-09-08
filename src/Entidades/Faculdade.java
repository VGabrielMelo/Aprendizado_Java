package Entidades;

public class Faculdade {
	private String Nome_Instituição;
	private String Cursos;
	private int Num_Funcionários;
	private int Num_Alunos;
	
	public String getNome_Instituição() {
		return Nome_Instituição;
	}
	public void setNome_Instituição(String nome_Instituição) {
		Nome_Instituição = nome_Instituição;
	}
	public String getCursos() {
		return Cursos;
	}
	public void setCursos(String cursos) {
		Cursos = cursos;
	}
	public int getNum_Funcionários() {
		return Num_Funcionários;
	}
	public void setNum_Funcionários(int num_Funcionários) {
		Num_Funcionários = num_Funcionários;
	}
	public int getNum_Alunos() {
		return Num_Alunos;
	}
	public void setNum_Alunos(int num_Alunos) {
		Num_Alunos = num_Alunos;
	}
	
	public void Percentual_pessoas() {
		Num_Funcionários = 24;
		Num_Alunos = 128;
		int Total_pessoas = Num_Funcionários + 	Num_Alunos;
		float Percentual_Funcionários = ((Num_Funcionários * 100) / Total_pessoas);	
		float Percentual_Alunos = ((Num_Alunos * 100) / Total_pessoas);
		System.out.println("o percentual de Funcionários é de " + Percentual_Funcionários + " % \n" + " enquanto que o percentual de Alunos é de " + Percentual_Alunos + " %, dentro da nossa faculdade?");
	}
	
}
