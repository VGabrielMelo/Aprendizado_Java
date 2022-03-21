package Exercício2;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		String Nome;
		String cpf;
		String TipoConta;
		int idade;
		
		System.out.println("Para realizar o cadastro de sua conta, preciso das seguintes informações: ");
		System.out.println("Seu Nome completo: ");
		Nome = ler.nextLine();
		System.out.println("Seu CPF: ");
		cpf = ler.next();
		System.out.println("Sua idade: ");
		idade = ler.nextInt();
		System.out.println("Você deseja criar uma conta Corrente ou Poupança? ");
		TipoConta = ler.next();
		
		Pessoa pessoa = new Pessoa(Nome, cpf, idade);
		Conta conta =  new Conta(1, TipoConta, "000100001");
		
		if(pessoa.getIdade()<18 && TipoConta.equals("Corrente")) {
			System.out.println("Infelizmente você não tem a idade Mínima para criar uma conta Corrente, apenas Poupança. \n");
			System.exit(0);
		}
		else {
		pessoa.CriarConta(conta);}

		AgenciaBancaria agencia = new AgenciaBancaria();
		agencia.AdicionarConta(conta);
		agencia.ListarDadosPessoais(pessoa.getCpf());
		
		agencia.ApagarConta(conta);
	}

}
