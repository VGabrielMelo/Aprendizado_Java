package Exercício2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class AgenciaBancaria {
	
	Scanner ler = new Scanner(System.in);
	private Set<String> cpfclientes = new HashSet<String>();
	private ArrayList<Conta> contas = new ArrayList<Conta>();
	int res;
	
	public Set<String> getCpfclientes() {
		return cpfclientes;
	}
	public void setCpfclientes(Set<String> cpfclientes) {
		this.cpfclientes = cpfclientes;
	}
	public ArrayList<Conta> getContas() {
		return contas;
	}
	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}
	
	public void AdicionarConta(Conta conta) {
		getContas().add(conta);
		System.out.print("Sua conta foi adicionada com sucesso! \n");
	}
	
	public void ApagarConta(Conta conta) {
		System.out.print("Tem certeza que deseja apagar? Se sim, digite 9: \n");
		res = ler.nextInt();
		if (res == 9){
			getContas().remove(conta);
			System.out.print("Sua conta foi apagada com sucesso!");}
		else{
			System.out.print("Operação cancelada");}
		}
	
	public void ListarDadosPessoais(String cpf) {
		int cont=0;
		while(cont<contas.size()) {
			Conta conta = contas.get(cont);
			Pessoa pessoa = conta.getPessoa();
			if (pessoa.getCpf().equals(cpf)) {
				System.out.println(pessoa.getConta().getId());
				System.out.println(pessoa.getNome());
				System.out.println(pessoa.getConta().getTipoconta());
				System.out.println(pessoa.getConta().getNumeroconta());
				System.out.println(pessoa.getIdade());
			}else {System.out.println("O CPF" + (cpf) + "ainda não foi cadastrado");}
			cont+=1;
		}
	}
		
	}

