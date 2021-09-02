package Entidades;

import java.util.Scanner; 

public class Professor extends Aluno {
	private String Nome;
	private String Endereço;
	private String Área_Ensino;
	private int NotaP;
	private int NotaT;
	private int Matricula;
	private int Celular;
	private int Idade;
	private int Salário;
	
	Scanner scan = new Scanner(System.in);
	
	
	public int getNotaP() {
		return NotaP;
	}
	public void setNotaP(int notaP) {
		NotaP = notaP;
	}
	public int getNotaT() {
		return NotaT;
	}
	public void setNotaT(int notaT) {
		NotaT = notaT;
	}
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
	public String getÁrea_Ensino() {
		return Área_Ensino;
	}
	public void setÁrea_Ensino(String área_Ensino) {
		Área_Ensino = área_Ensino;
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
	public int getSalário() {
		return Salário;
	}
	public void setSalário(int salário) {
		Salário = salário;
	}
	
	public void aplicar_Prova() throws InterruptedException {
		
		System.out.println("O professor vai aplicar uma prova surpresa!!!\n");
		System.out.println("Ele vai te fazer algumas perguntas e dependendo delas, terá sua nota");
		Thread.sleep(2000);
		System.out.println("Quanto é 80 x 10 ? : ");
		int p1 = scan.nextInt();
		System.out.println("Qual é a Raiz quadrada de 144 ? : ");
		int p2 = scan.nextInt();
		System.out.println("Qual é o resultado de {[(8 · 4 + 3) ÷ 7 + (3 + 15 ÷ 5) · 3] · 2 – (19 – 7) ÷ 6} · 2 + 12 ? : ");
		
		new Thread();
		Thread.sleep(4000); 
		
		System.out.println("Brincadeira!!! A última questão fala sobre fatorial... Quanto é 8! ? : ");
		int p3 = scan.nextInt();
		
		if (p1 == 800 & p2 == 12 & p3 == 40320 ) {NotaP=10;}
		else if (p1 == 800 & p2 == 12 & p3 != 40320) {NotaP=6;}
		else if (p1 == 800 & p2 != 12 & p3 == 40320) {NotaP=6;}
		else if (p1 != 800 & p2 == 12 & p3 == 40320) {NotaP=6;}
		else if (p1 != 800 & p2 != 12 & p3 == 40320) {NotaP=3;}
		else if (p1 == 800 & p2 != 12 & p3 != 40320) {NotaP=3;}
		else if (p1 != 800 & p2 == 12 & p3 != 40320) {NotaP=3;}
		else {NotaP=0;}
		System.out.println("A sua nota de prova é: "+ NotaP);
		
	}
	
	public void Aplica_Tarefa() throws InterruptedException {
		System.out.println("Está na hora de realizar uma tarefa!!!\n");
		Thread.sleep(1000); 
		System.out.println("Cada questão precisa de uma resposta.");
		
		System.out.println("Quanto é 159375270 elevado a 0 ? : ");
		int p1 = scan.nextInt();
		
		System.out.println("Oque diz a teoria da relatividade desenvolvida por Einstein? \n");
		Thread.sleep(3000);
		System.out.println("Te peguei! era só brincadeira... lá vai a próxima questão. \n");
		Thread.sleep(1000);
		System.out.println("Em uma sala de aula há 30 alunos, dos quais 40% são meninas. Quantas meninas têm na sala? : ");
		int p2 = scan.nextInt();
		System.out.println("Quantas senhas com 4 algarismos diferentes podemos escrever com os algarismos 1, 2, 3, 4, 5, 6, 7, 8,e 9?");
		int p3 = scan.nextInt();
		
		if (p1 == 1 & p2 == 12 & p3 == 3024 ) {NotaT=10;}
		else if (p1 == 1 & p2 == 12 & p3 != 3024) {NotaT=6;}
		else if (p1 == 1 & p2 != 12 & p3 == 3024) {NotaT=6;}
		else if (p1 != 1 & p2 == 12 & p3 == 3024) {NotaT=6;}
		else if (p1 != 1 & p2 != 12 & p3 == 3024) {NotaT=3;}
		else if (p1 == 1 & p2 != 12 & p3 != 3024) {NotaT=3;}
		else if (p1 != 1 & p2 == 12 & p3 != 3024) {NotaT=3;}
		else {NotaT=0;}
		System.out.println("A sua nota de prova é: "+ NotaT);
	}
}
