package Exercício3;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		String Nome;
		String cpf;
		String PaisNascimento;
		int idade;
		String Cidade;
		String Pais;
		
		System.out.println("Para realizar o cadastro de se destino, preciso das seguintes informações: ");
		System.out.println("Para qual País deseja ir?");
		Pais = ler.nextLine();
		System.out.println("Qual é o nome da cidade de hospedagem?");
		Cidade = ler.nextLine();
		System.out.println("Em qual Pais você nasceu?");
		PaisNascimento = ler.nextLine();
		System.out.println("Seu Nome completo: ");
		Nome = ler.nextLine();
		System.out.println("Seu CPF: ");
		cpf = ler.next();
		System.out.println("Sua idade: ");
		idade = ler.nextInt();
		
		Pessoa pessoa = new Pessoa(Nome, cpf, idade, PaisNascimento);
		Lugar lugar = new Lugar(Cidade,Pais);
		
		if(pessoa.getIdade()<18 && !Pais.equals(pessoa.getPaisNascimento())) {
			System.out.println("Infelizmente você não tem a idade Mínima para viajar para fora do pais sem seus responsáveis \n");
			System.exit(0);
		}
		else {
		pessoa.EscolherLugar(lugar);}
		
		AgenciaViagens agencia = new AgenciaViagens();
		agencia.AdicionarLugar(lugar);
		agencia.ListarDadosDestino();
		System.out.println("Seus dados:");
		agencia.ListarDadosPessoais(pessoa.getCpf());

}
}

