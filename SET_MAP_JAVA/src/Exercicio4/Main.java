package Exercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		String Titulo;
		String Descricao;
		
		System.out.println("Bem vindo a sua agenda pessoal.");
		System.out.println("Qual � a tarefa que voc� deseja realizar? ");
		Titulo = ler.nextLine();
		System.out.println("Qual � a descri��o dessa tarefa? ");
		Descricao = ler.nextLine();
		
		Task task = new Task(Titulo, Descricao);
		ListToDo list = new ListToDo();
		
		list.AdicionarTarefa(task);
		
		System.out.println("Suas tarefas s�o: ");
		list.ListarTarefas();
		
		System.out.println("Qual tarefa voc� deseja ver a descri��o? ");
		Titulo = ler.nextLine();
		list.ListarTarefasInformacoes(Titulo);
		

	}

}
