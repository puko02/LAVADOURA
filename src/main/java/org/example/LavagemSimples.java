package org.example;
import java.util.ArrayList;
import java.util.Scanner;
import org.example.Carro;
import java.lang.String;

public class LavagemSimples extends Servico {

	public LavagemSimples(){}

	public LavagemSimples(double preco, String descricao) {
		super(preco, descricao);
	}

	public void menuLS(){
		MenuCliente menuCliente = new MenuCliente();
		Carro Carro = new Carro();
		Scanner sc = new Scanner(System.in);

		System.out.println("\n\n\nQual a marca do seu carro?");
		String marca = sc.nextLine();

		System.out.println("Qual o modelo do seu carro?");
		String modelo = sc.nextLine();

		System.out.println("Qual a cor do seu carro?");
		String cor = sc.nextLine();

		System.out.println("Qual a placa do seu carro?");
		String placa = sc.nextLine();

		if(Carro.compararPlaca(placa, Carro.carros) != null)
		{
			System.out.println("\nCarro já está cadastrado.\n");
		}else{;
			Carro.adicionarCarro(marca, modelo, cor, placa, "Lavagem Simples", "Pedido solicitado");
			System.out.println("\nCarro cadastrado com sucesso!\n");
		}

		menuCliente.Cliente();
		return;

	}
}