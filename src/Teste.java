import Entidades.Aluno;
import Entidades.Faculdade;
import Entidades.Professor;

public class Teste {

	public static void main(String[] args) throws InterruptedException {
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		Faculdade faculdade = new Faculdade();
		new Thread();
		
		aluno.setNome("Victor Gabriel Andrade de Melo");
		professor.Aplica_Tarefa();
		Thread.sleep(2000);
		System.out.println("\n");
		professor.aplicar_Prova();
		int NotaT = professor.getNotaT();
		int NotaP = professor.getNotaP();
		aluno.setNota_Tarefa(NotaT);
		aluno.setNota_Prova(NotaP);
		
		aluno.Cálculo_Média(aluno.getNota_Tarefa(), aluno.getNota_Prova());
		System.out.println("\n");
		aluno.Aprovação(aluno.getMédia());
		
		System.out.println("\n Agora, antes de nosso programa se encerrar, uma curiosidade... Você sabia que ");
		faculdade.Percentual_pessoas();
		
	}

}
