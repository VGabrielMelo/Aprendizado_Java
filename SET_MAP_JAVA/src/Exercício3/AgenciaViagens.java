package Exercício3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import java.util.Scanner;

public class AgenciaViagens {
	
	Scanner ler = new Scanner(System.in);
	private Set<String> cpfclientes = new HashSet<String>();
	private ArrayList<Lugar> lugares = new ArrayList<Lugar>();
	int res;
	
	public Set<String> getCpfclientes() {
		return cpfclientes;
	}
	public void setCpfclientes(Set<String> cpfclientes) {
		this.cpfclientes = cpfclientes;
	}
	public ArrayList<Lugar> getLugares() {
		return lugares;
	}
	public void setLugares(ArrayList<Lugar> lugares) {
		this.lugares = lugares;
	}
	
	public void AdicionarLugar(Lugar lugar) {
		getLugares().add(lugar);
		System.out.print("Seu destino foi adicionado com sucesso \n");
	}
	
	public void ListarDadosDestino() {
		int cont=0;
		while(cont<lugares.size()) {
			Lugar lugar = lugares.get(cont);
			System.out.println(lugar.getCidade());
			System.out.println(lugar.getPais());
			cont+=1;}
		}
		
		
	public void ListarDadosPessoais(String cpf) {
		int cont=0;
		while(cont<lugares.size()) {
			Lugar lugar = lugares.get(cont);
			Exercício3.Pessoa pessoa = lugar.getPessoa();
			if (pessoa.getCpf().equals(cpf)) {
				System.out.println(pessoa.getNome());
				System.out.println(pessoa.getCpf());
				System.out.println(pessoa.getIdade());
			}else {System.out.println("O CPF " + (cpf) + " não foi encontrado");}
			cont+=1;
		}
	
	
}
}
