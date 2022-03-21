package Exercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Concessionaria {
	
	
	Map <String, Double> tabela_placa_preco = new HashMap<>();
	private ArrayList<Carro> carros = new ArrayList<Carro>();
	
	
	public Map<String, Double> getTabela_placa_preco() {
		return tabela_placa_preco;
	}

	public void setTabela_placa_preco(Map<String, Double> tabela_placa_preco) {
		this.tabela_placa_preco = tabela_placa_preco;
	}

	public ArrayList<Carro> getCarros() {
		return carros;
	}

	public void setCarros(ArrayList<Carro> carros) {
		this.carros = carros;
	}
	
	
	public void AdiconarCarro(Carro carro) {
		getCarros().add(carro);
		System.out.print("Sua carro foi adicionado com sucesso! \n");
	}
	
	
	public void ListarDadosCarro(String placa) {
		int cont=0;
		while(cont<carros.size()) {
			Carro carro = carros.get(cont);
			if (carro.getPlaca().equals(placa)) {
				System.out.println("Modelo: " + carro.getModelo());
				System.out.println("Placa: " + carro.getPlaca());
				System.out.println("Pre�o: " + carro.getPre�o());
				System.out.println("Cor: " + carro.getCor());
				System.out.println("Ano: " + carro.getAno());
				System.out.println("");
			}else {cont+=1;}
		}
	}
	
	public void ListarCarros() {
		int cont=0;
		while(cont<carros.size()) {
			Carro carro = carros.get(cont);
			System.out.println("Modelo :" + carro.getModelo());
			System.out.println("Placa: " + carro.getPlaca());
			System.out.println("");
			cont+=1;
		}
	}
	
	public void ImprimirTabelaPreco() {
		System.out.println(tabela_placa_preco);
	}

}
