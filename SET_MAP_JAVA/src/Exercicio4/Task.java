package Exercicio4;

public class Task {
	
	private String Titulo;
	private String descricao;
	private Task task;
	
	public Task(String Titulo, String descricao) {
		super();
		this.Titulo = Titulo;
		this.descricao = descricao;
	}

	
	
	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	
	
	
	
}
