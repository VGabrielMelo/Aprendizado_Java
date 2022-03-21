package Exerc�cio1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		String placa;
		
		Carro carro1 = new Carro("Corsa","PMH-3455",12000.00,"Vermelho","2003");
		Carro carro2 = new Carro("Vectra","OPH-5295",18000.00,"Prata","2006");
		Carro carro3 = new Carro("P�lio","TUI-3954",26000.00,"Prata","2017");
		Carro carro4 = new Carro("Camaro","POU-8433",79000.00,"Amarelo","2015");
		
		Concessionaria concessionaria = new Concessionaria();
		concessionaria.AdiconarCarro(carro1);
		concessionaria.getTabela_placa_preco().put(carro1.getModelo(),carro1.getPre�o());
		concessionaria.AdiconarCarro(carro2);
		concessionaria.getTabela_placa_preco().put(carro2.getModelo(),carro2.getPre�o());
		concessionaria.AdiconarCarro(carro3);
		concessionaria.getTabela_placa_preco().put(carro3.getModelo(),carro3.getPre�o());
		concessionaria.AdiconarCarro(carro4);
		concessionaria.getTabela_placa_preco().put(carro4.getModelo(),carro4.getPre�o());
		
		System.out.println("Bem vindo a nossa Concession�ria! n�s temos os seguintes carros dispon�veis: ");
		concessionaria.ListarCarros();
		
		System.out.println("A nossa tabela de pre�os:");
		concessionaria.ImprimirTabelaPreco();
		
		System.out.println("Digite a placa de um carro para ver as especifica��es: ");
		placa = ler.nextLine();
		concessionaria.ListarDadosCarro(placa);
		
				
	}

}
