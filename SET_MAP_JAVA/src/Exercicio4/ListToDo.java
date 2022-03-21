package Exercicio4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListToDo {
	
	Scanner ler = new Scanner(System.in);
	private Set<String> Tasks = new HashSet<String>();
	private ArrayList<Task> acoes = new ArrayList<Task>();
	int res;
	
	public Set<String> getTasks() {
		return Tasks;
	}
	public void setTasks(Set<String> tasks) {
		Tasks = tasks;
	}
	public ArrayList<Task> getAcoes() {
		return acoes;
	}
	public void setAcoes(ArrayList<Task> acoes) {
		this.acoes = acoes;
	}
	
	public void AdicionarTarefa(Task task) {
		getAcoes().add(task);
		System.out.print("Nova tarefa adicionada com sucesso! \n");
	}
	
	public void ListarTarefas() {
		int cont=0;
		while(cont<acoes.size()) {
			Task task = acoes.get(cont);
			System.out.println(task.getTitulo());
			System.out.println(" ");
			cont+=1;}
		}

	public void ListarTarefasInformacoes(String titulo) {
		int cont=0;
		while(cont<acoes.size()) {
			Task task = acoes.get(cont);
			if(task.getTitulo().equals(titulo)){
			System.out.println(" ");
			System.out.println("Tarefa escolhida: ");
			System.out.println(task.getTitulo());
			System.out.println(task.getDescricao());
			System.out.println(" ");
		}
		cont+=1;
	}
	
}
}
