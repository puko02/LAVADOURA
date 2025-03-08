package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Polimento extends Servico {

	public Polimento(){}

	public Polimento(double preco, String descricao) {
		super(preco, descricao);
	}

	public void menuP(){
		MenuCliente menuCliente = new MenuCliente();
		Scanner sc = new Scanner(System.in);
		ArrayList<Carro> carros = new ArrayList<>();

		// Adicionando um carro de teste
		carros.add(new Carro("Samsung", "Galaxy", "Preto", "4197498124721", "Polimento"));

		System.out.println("Qual a marca do seu carro?");
		String marca = sc.nextLine();

		System.out.println("Qual o modelo do seu carro?");
		String modelo = sc.nextLine();

		System.out.println("Qual a cor do seu carro?");
		String cor = sc.nextLine();

		System.out.println("Qual a placa do seu carro?");
		String placa = sc.nextLine();

		if(Carro.compararPlaca(placa, carros) != null){
			System.out.println("Carro já está cadastrado.");
		}else{
			carros.add(new Carro(marca, modelo, cor, placa, "Polimento"));
			System.out.println("Carro cadastrado com sucesso!");
		}

		// Exibir os carros cadastrados de forma organizada
		//System.out.println("Lista de carros cadastrados:");
		//for(Carro carro : carros){
		//	System.out.println(carro.toString());
		//}

		menuCliente.Cliente();
	}

}
