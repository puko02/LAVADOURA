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
		Carro Carro = new Carro();

		System.out.println("\n\n\nQual a marca do seu carro?");
		String marca = sc.nextLine();

		System.out.println("Qual o modelo do seu carro?");
		String modelo = sc.nextLine();

		System.out.println("Qual a cor do seu carro?");
		String cor = sc.nextLine();

		System.out.println("Qual a placa do seu carro?");
		String placa = sc.nextLine();

		if(Carro.compararPlaca(placa, Carro.carros) != null){
			System.out.println("\nCarro já está cadastrado.\n");
		}else{
			Carro.adicionarCarro(marca, modelo, cor, placa, "Polimento", "Pedido solicitado");
			System.out.println("\nCarro cadastrado com sucesso!\n");
		}

		menuCliente.Cliente();
	}

}
